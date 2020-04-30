package Staff;

import Tasks.DeskTasks;
import Tasks.StaffTasks;

public class Receptionist extends Administrative implements DeskTasks, StaffTasks {

	

	public Receptionist(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
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

	@Override
	public void answerPhone() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fillFormat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeApointments() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
