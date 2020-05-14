package Staff;

import java.util.ArrayList;
import java.util.Random;

import Tasks.ComputerTasks;
import Tasks.StaffTasks;

public class IT extends Administrative {

	private String reparing= " is reparing some funtion in the website";
	private String adding = " and adding new staff in the website."; 



	public IT(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
		
	}
	

	public String ItTasks(Administrative staff) {
		return  staff + this.reparing + this.adding;
	}
	

}
