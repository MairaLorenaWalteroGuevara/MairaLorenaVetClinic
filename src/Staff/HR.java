package Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Tasks.HRTasks;
import Tasks.StaffTasks;

public class HR extends Administrative {

	protected String moralActivities = " is palaning new team activities"; 
	protected String payment = " and making the payroll.";
	
	public HR(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
	}
	


	public String hrTasks(Administrative staff) {
		
		return staff + moralActivities + payment;
	}


	

}
