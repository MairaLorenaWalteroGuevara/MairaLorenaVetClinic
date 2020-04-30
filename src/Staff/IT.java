package Staff;

import Tasks.ComputerTasks;
import Tasks.StaffTasks;

public class IT extends Administrative implements ComputerTasks, StaffTasks {

	

	public IT(String surname, String name, int iD) {
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
	public void repairSoftware() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addNewContain() {
		// TODO Auto-generated method stub

	}

}
