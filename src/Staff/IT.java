package Staff;

import java.util.ArrayList;
import java.util.Random;

import Tasks.ComputerTasks;
import Tasks.StaffTasks;

public class IT extends Administrative implements ComputerTasks {

	

	public IT(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
		
	}
	
		public void assinationwork(ArrayList<IT> itStaffList) {
		
		Random r = new Random(); 
		int i=0;

		int pick = r.nextInt(itStaffList.size());
		IT s = (IT) itStaffList.get(pick);
		System.out.println("the employee" + s.toString());
		s.repairSoftware();
		
	}

	@Override
	public void repairSoftware() {
		// TODO Auto-generated method stub
		System.out.println("is reparing some funtion in the website.");
		
	}

	@Override
	public void addNewContain() {
		// TODO Auto-generated method stub
		System.out.println("is adding new staff in the website.");
		
	}

	

}
