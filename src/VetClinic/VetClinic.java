package VetClinic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import VetClinicInterfaces.InfoInterface;
import VetClinicInterfaces.InfoStaffInterface;

public class VetClinic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//I am creating a interface from Information 
		InfoInterface Staff = new Information();
		String namesFile = "Names";
		String surnamesFile = "Surnames";
		
		BufferedReader in = new BufferedReader(new FileReader(namesFile));
		BufferedReader on = new BufferedReader(new FileReader(surnamesFile));

		InfoStaffInterface namesEmployee = Staff.createInfoStaff(in,on);
		
		//InfoStaffInterface surnamesEmployee = Staff.createInfoStaff(on);

	    
		System.out.println("=== Staff ===");
		
	//	for(String title : namesEmployee.listStaff()) {
		//	System.out.println(title);
	//	}
		
		
		
	
	}
}
