package Staff;

import Animals.Animals;
import Tasks.StaffTasks;

public class Medical extends Staff {
	
	 private Queue myQueue; 
	

	public Medical(String name, String surname, int iD) {
		super(name, surname, iD);
		this.myQueue = new Queue();
		// TODO Auto-generated constructor stub
	}


	public Queue getMyQueue() {
		return myQueue;
	}


	public void Queue(Animals e ) {
		myQueue.add(e); 
		
	}

}

	


