package Staff;

import Animals.Animals;

// This class contain the creation of own Queue
public class Queue {

	// Contain 3 variables: first animal in the queue, last animal in the queue and
	// the size of the queue
	private Animals first;
	private Animals last;
	private int size;

	// The constructor of the queue
	public Queue() {
		super();
		this.first = null;
		this.last = null;
		this.size = 0;
	}

// The method to add a new animal in the Queue, that say: 
	// if the size of the queue is zero, the animal that we entrance is going to be
	// the first and the last animal in the queue, and the size of the queue will
	// increase
	// if the size of the queue is no zero, the the new animal will be save as the
	// Next animal and this will be add in the last position of the queue
	// this set next is coming from the Animals Class
	// finally the size of the queue will increase
	public void add(Animals animal) {
		if (size == 0) {
			this.first = animal;
			this.last = animal;
			size++;
		} else {
			this.last.setNext(animal);
			this.last = animal;
			size++;
		}

	}

	// This method is not going to use in this project, but this can help to add the
	// animal in the first position instead of the last position.
	// the order will be change, the animal already in the queue will be save as a
	// next, and the new animal will be the first
	public void addFirst(Animals animal) {
		if (size == 0) {
			this.first = animal;
			this.last = animal;
			size++;
		} else {
			animal.setNext(this.first);
			this.first = animal;
			size++;
		}
	}

	// the method remove allow us to remove the first animal in the Queue and
	// decreases the size of the queue
	// if the Queue is zero you can not remove, if it is size 1, the first and the
	// last is going to be empty
	// if the size is bigger than 1, the first is going to be deleted and now the
	// first is going to be the next
	public boolean remove() {

		if (size == 0) {

			return false;
		} else if (size == 1) {
			this.first = null;
			this.last = null;
			size--;
			return true;
		} else {
			this.first = this.first.getNext();
			size--;
			return true;
		}

	}

	// This method is not going to be used in here, but it allow us to change the
	// position that we remove.
	// this remove the last element in the queue, the first animal is going to be
	// the Animal instance call current
	// While the size decrease the current element will be get the nest and is going
	// to be save as a last
	public boolean removeLast() {

		if (size == 0) {
			return false;
		} else if (size == 1) {
			this.first = null;
			this.last = null;
			size--;
			return true;
		} else {
			Animals current = this.first;
			int i = 0;
			while (i < size - 2) {
				current = current.getNext();
				i++;
			}
			this.last = current;
			this.last.setNext(null);
			size--;
			return true;
		}
	}

	// the getter for the first in order to get the Instance of the Animal in the
	// first position of the Queue
	public Animals getFirst() {
		return first;
	}

	// This help us to print the Queue, so is going to return the Queue with this
	// format:
	// first instance animal- space with characters- next instance animal
	// Mylo 12 Tubercolosis-|- Rufus 15 MRSA-|-
	@Override
	public String toString() {
		String toReturn = "";
		Animals current = this.first;

		while (current != null) {
			toReturn += current + " -|- ";
			current = current.getNext();
		}

		return toReturn;
	}

}
