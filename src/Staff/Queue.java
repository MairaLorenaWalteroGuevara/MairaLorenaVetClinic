package Staff;

import Animals.Animals;

public class Queue {
	
	
	private Animals first; 
	private Animals last; 
	private int size;
	
	public Queue() {
		super();
		this.first = null;
		this.last = null;
		this.size = 0;
	} 
	

	public void add(Animals animal) {
		if (size ==0) {
			this.first = animal; 
			this.last = animal; 
			size++; 
		}else {
			this.last.setNext(animal); 
			this.last = animal; 
			size++; 
		}
		
	}
	
	public void addFirst(Animals animal) {
		if (size ==0) {
			this.first = animal; 
			this.last = animal; 
			size++; 
		}else {
			animal.setNext(this.first);
			this.first = animal; 
			size++; 
		}
	}
	
	public boolean remove() {
		
		if (size==0) {
			
			return false; 
		}else if (size ==1) {
			this.first = null; 
			this.last = null; 
			size--; 
			return true; 
		}else {
			this.first = this.first.getNext(); 
			size--; 
			return true;
		}
		
	}
	
	public boolean removeLast() {
		
		if (size==0) {
			return false; 
		}else if (size ==1) {
			this.first = null; 
			this.last = null; 
			size--; 
			return true; 
		}else {
			Animals current = this.first; 
			int i = 0; 
			while (i<size -2) {
				current = current.getNext(); 
				i++; 
			}
			this.last = current; 
			this.last.setNext(null); 
			size--; 
			return true; 
		}
	}
	
	public Animals getFirst() {
		return first;
	}


	public void setFirst(Animals first) {
		this.first = first;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		String toReturn = ""; 
		Animals current = this.first; 
		
		while (current != null) {
			toReturn += current + " ";
			current = current.getNext(); 
		}
		
		return toReturn; 
	}
	
	

}
