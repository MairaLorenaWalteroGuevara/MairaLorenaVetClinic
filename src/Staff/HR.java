package Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import Tasks.HRTasks;
import Tasks.StaffTasks;

public class HR extends Administrative implements HRTasks {

	
	public HR(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
	}
	
	
	
//	public void assinationwork(ArrayList<HR> hrStaffList) {
//		
//		Random r = new Random(); 
//		int pick = r.nextInt(hrStaffList.size());
//		HR s = (HR) hrStaffList.get(pick);
//		
//		System.out.println("the employee" + s.toString());
//		s.moralActivities();
//		
//		Collections.shuffle(hrStaffList);
//		int pick1 = r.nextInt(hrStaffList.size());
//		HR a = (HR) hrStaffList.get(pick1);
//		
//		System.out.println("the employee" + a.toString());
//		a.Payment();
//		}

	@Override
	public void makeInterviews() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Payment() {
		// TODO Auto-generated method stub
		System.out.println("needs to make the payrole");
	}

	@Override
	public void moralActivities() {
		// TODO Auto-generated method stub
		System.out.println("creating new team bulding activities");
		
	}

	

}
