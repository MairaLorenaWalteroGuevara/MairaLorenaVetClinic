package Staff;

import Tasks.HRTasks;
import Tasks.StaffTasks;

public class HR extends Administrative implements HRTasks, StaffTasks {

	
	public HR(String surname, String name, int iD) {
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
	public void makeInterviews() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Payment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moralActivities() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
