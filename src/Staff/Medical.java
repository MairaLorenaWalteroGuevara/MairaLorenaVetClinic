package Staff;

import Animals.Animals;
import Tasks.StaffTasks;

public class Medical extends Staff {

	// I create a variable type Queue in order to generate myQueue
	private Queue myQueue;

	// constructor of the class, allow us to create a instance in other classes :
	public Medical(String name, String surname, int iD) {
		super(name, surname, iD);
		// initialization of the variable calling the class Queue
		this.myQueue = new Queue();
		// TODO Auto-generated constructor stub
	}

	// Getter of the attribute Queue to get this in other classes
	public Queue getMyQueue() {
		return myQueue;
	}

	// Method Queue to call this method with the medical or subclass medical
	// instance and add the animal in the queue.
	public void Queue(Animals e) {
		myQueue.add(e);

	}

}
