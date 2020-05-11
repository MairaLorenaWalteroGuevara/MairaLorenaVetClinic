package Staff;

import java.util.ArrayList;
import java.util.Random;

import Tasks.DeskTasks;
import Tasks.StaffTasks;

public class Receptionist extends Administrative implements DeskTasks {

	

	public Receptionist(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
	}
	

	public void assinationwork(ArrayList<Receptionist> receptionistStaffList) {
		
		Random r = new Random(); 

		int pick = r.nextInt(receptionistStaffList.size());
		Receptionist s = (Receptionist) receptionistStaffList.get(pick);
		System.out.println("the employee" + s.toString());
		s.answerPhone();
		
	}

	@Override
	public void answerPhone() {
		// TODO Auto-generated method stub
		System.out.println("is answering the phone.");
	}

	@Override
	public void fillFormat() {
		// TODO Auto-generated method stub
		System.out.println("is filling formats.");
		
	}

	@Override
	public void makeApointments() {
		// TODO Auto-generated method stub
		System.out.println("is making apointments.");
		
	}

	
}
