package Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Tasks.StaffTasks;

public class Administrative extends Staff implements StaffTasks {

	public Administrative(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
	}
	
//	public void assingwork(ArrayList<Administrative> administrativeStaffList) {
//		
//	
//		Administrative s = null;
//		System.out.println("the employee" + s.toString());
//
//		
//	}
//	
//	public void shuffleCollection(ArrayList<Administrative> administrativeStaffList) {
//		
//		Collections.shuffle(administrativeStaffList);
//	}
//	

	@Override
	public void onHolidays() {
		
		System.out.println("is in holidays.");
		
	}

	@Override
	public void answerEmails() {
		// TODO Auto-generated method stub
		
		System.out.println("has to answers some Emails.");
	}

	@Override
	public void dayOFF() {
		// TODO Auto-generated method stub
		System.out.println("has a day off.");
		
	}



}
