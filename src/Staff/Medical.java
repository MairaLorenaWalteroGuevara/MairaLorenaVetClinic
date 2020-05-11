package Staff;

import Animals.Animals;
import Tasks.StaffTasks;

public class Medical extends Staff implements StaffTasks{
	
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



	@Override
	public void onHolidays() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void answerEmails() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void dayOFF() {
		// TODO Auto-generated method stub
		
	}

	

}

	


