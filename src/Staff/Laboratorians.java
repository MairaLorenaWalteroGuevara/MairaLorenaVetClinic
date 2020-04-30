package Staff;

import Tasks.LaboratoryTasks;
import Tasks.StaffTasks;


public class Laboratorians extends Medical implements StaffTasks, LaboratoryTasks  {

	

	public Laboratorians(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void takeExamples() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printResults() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testForVaccine() {
		// TODO Auto-generated method stub
		
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
