package Staff;

import java.util.ArrayList;
import java.util.Random;

import Tasks.DeskTasks;
import Tasks.StaffTasks;

public class Receptionist extends Administrative {

	private String answering = " is answering the phone";
	private String filling = ", filling formats";
	private String making= " and making apointments. ";

	public Receptionist(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
	}
	

	public String RecTasks(Administrative staff) {
		
		return staff + this.answering + this.filling + this.making;
	}

	

	
}
