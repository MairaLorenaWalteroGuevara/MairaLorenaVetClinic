package VetClinic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import Staff.Administrative;
import Staff.HR;
import Staff.IT;
import Staff.Laboratorians;
import Staff.LargeAnimalsVet;
import Staff.Medical;
import Staff.Receptionist;
import Staff.SmallAnimalsVet;
import Staff.Staff;
import VetClinicInterfaces.InfoInterface;
import VetClinicInterfaces.InfoStaffInterface;

public class VetClinic {

		Information information; 
		Administrative a; 

		Scanner sc=new Scanner(System.in); 
		
		
public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
	       new VetClinic(); 
//			new Information(); 
//			new InfoAnimals(); 
	}
	
		
 public VetClinic () throws IOException {
	 
	 options();
	 
	 
 }
 
 public void options() throws IOException {
	 
	 information = new Information();
		int answer=0;
		do {
			displayOptions(); 
		
		answer=sc.nextInt();
		
		
		if (answer==1) {
			
			System.out.println("The list of our staff is: ");
			
			
			for (Staff e: information.staffList) {
				System.out.println("Name: " + e.getName() + " Surname: " + e.getSurname() + " ID: " + e.getiD());
			
		}
		}
		else if (answer==2 ) {
			
			int choose=0; 
			do {
				displayOptions2();
			
			choose=sc.nextInt();
			
			
			if (choose ==1) {
				System.out.println("List of Medical Staff: ");
				
				for(int i=0; i<information.medicalStaffList.size(); i++) {
			
					Medical medicalStaff = information.medicalStaffList.get(i);
					System.out.println("Name: " + medicalStaff.getName() + " Surname: " + medicalStaff.getSurname() + " ID: " + medicalStaff.getiD());
				
				}
			
				} else if (choose==2) {
					System.out.println("List of adminsitrative Staff: ");
					
					for(int i=0; i<information.administrativeStaffList.size(); i++) {
				
						Administrative adStaff = information.administrativeStaffList.get(i);
						System.out.println("Name: " + adStaff.getName() + " Surname: " + adStaff.getSurname() + " ID: " + adStaff.getiD());
				
					}
					
				}else if (choose==3) {
					System.out.println("List of Small Animal Veterinarians: ");
					
					
					for (int i=0; i<information.smallAnimalsVetsList.size(); i++) {
						
						SmallAnimalsVet smVet= information.smallAnimalsVetsList.get(i);
							
							System.out.println("Name: " + smVet.getName() + " Surname: " + smVet.getSurname() + " ID: " + smVet.getiD());
						}
					
					
				}else if (choose==4) {
					System.out.println("List of Large Animal Veterinarians: ");
					
					
					for (int i=0; i<information.largeAnimalsVetsList.size(); i++) {
						
						LargeAnimalsVet laVet= information.largeAnimalsVetsList.get(i);
							
							System.out.println("Name: " + laVet.getName() + " Surname: " + laVet.getSurname() + " ID: " + laVet.getiD());
						}
					
					
				}else if (choose==5) {
					System.out.println("List of Laboratorians: ");
					
					for (int i=0; i<information.laboratoriansList.size(); i++) {
						
						Laboratorians lab= information.laboratoriansList.get(i);
							
							System.out.println("Name: " + lab.getName() + " Surname: " + lab.getSurname() + " ID: " + lab.getiD());
						}
					

				}else if (choose==6) {
					System.out.println("List of Receptionist Staff: ");
					
					
					for (int i=0; i<information.receptionistStaffList.size(); i++) {
						
						Receptionist rec = information.receptionistStaffList.get(i);
							
							System.out.println("Name: " + rec.getName() + " Surname: " + rec.getSurname() + " ID: " + rec.getiD());
						}
					
				
				}else if (choose==7) {
					System.out.println("List of IT Staff: ");
					
					
					for (int i=0; i<information.itStaffList.size(); i++) {
						
						IT it = information.itStaffList.get(i);
							
							System.out.println("Name: " + it.getName() + " Surname: " + it.getSurname() + " ID: " + it.getiD());
						}
					
				}else if (choose==8) {
					
					System.out.println("List of HR Staff: ");
					
					for (int i=0; i<information.hrStaffList.size(); i++) {
						
						HR hr = information.hrStaffList.get(i);
							
							System.out.println("Name: " + hr.getName() + " Surname: " + hr.getSurname() + " ID: " + hr.getiD());
						}
					
				}else if (choose==9) {
					break;
				}
		}while(choose!=0);
 		}
		else if (answer==3) {
			
			information.assingwork();
		}
		else if (answer==4) {
			
//			Scanner input=new Scanner(System.in); 
			String name; 
			String sname; 
			boolean flag=false; 
			String answer1; 
			String yes = "yes"; 
			String no = "exit"; 
			
				
		  do {
				name = getUser("Could you write the Name of the staff are you looking for: ");
				sname= getUser("Could you write the Surname of the staff are you looking for: ");
				
				System.out.println( information.linearSearch(name, sname));
				
				answer1=getUser("If you want to looking for other staff write: " + yes +", if not write: " + no );
				
				if (answer1.toLowerCase().trim().equals(yes)) {
					
					flag=false;
				}else if (answer1.toLowerCase().trim().equals(no))
					 break;
				}while (!flag);
			
//				do {
//				
//	
//				name =input.nextLine(); 
//				sname =input.nextLine();
//	
//				valid1 = validate(name);
//				valid2 = validate(sname);
//				
//				System.out.println("Write a correct name: only letters and with a long between 3 to 12 letters");
//			
//			}while (!valid1 && !valid2);
//			
//				  System.out.println( information.linearSearch(name, sname));   
		 }
			
		else if (answer==5) {
			System.out.println("The hiher numbers are: "  ); 
		}
		else if (answer==6) {
			System.out.println("The hiher numbers are: "  ); 
		}else if (answer==7) {
			System.out.println("The hiher numbers are: "  ); 
		}else if (answer==8) {
			System.out.println("The hiher numbers are: "  ); 
		}else if (answer==9) {
			System.out.println("The hiher numbers are: "  ); 
		}else if (answer==10) {
			System.out.println("The hiher numbers are: "  ); 
		}
	
		else {
			System.out.println("Unespected system error! please enter a valid option between 1 to 10");
			
		}
		}while (answer!=0); 
		}
		
	public 	void displayOptions() {
		
		System.out.println("What it is the method that you want to use"); 
		System.out.println("1.  List of all the staff");
		System.out.println("2.  List staff by category ");
		System.out.println("3.  List of the Administrative Staff who are performing a specific task");
		System.out.println("4.  Seach for a specific member of staff by name");
		System.out.println("5.  List all animals");
		System.out.println("6.  List teh animals by type");
		System.out.println("7.  Search for a specific animal by name");
		System.out.println("8.  List all the animals assigned to a member of medical staff");
		System.out.println("9.  List the order than the animals are going to seen by the medical staff");
		System.out.println("10. Know what is the next pet for a specific medical staff");
		System.out.println("11. Dont do more");
		
	}
	
	public void displayOptions2() {
		
		System.out.println("Choose what category you want "); 
		System.out.println("1.  List of Administrative staff ");
		System.out.println("2.  List of Medical staff ");
		System.out.println("3.  List of Small Animals Veterinarias");
		System.out.println("4.  List of Large Animals Veterinarias");
		System.out.println("5.  List of Laboratorians ");
		System.out.println("6.  List of Receptionist staff");
		System.out.println("7.  List of IT staff");
		System.out.println("8.  List of HR staff ");
		System.out.println("9.  Go back to the first options");
		
	}
	
	public static boolean validate(String input) {
		
		if ( input.length()<3 || input.length()>12) {
			return false; 
		} else  { 
	
			if (input.matches("[0-9]+")) {
			    return false; 	
			}else if (!input.matches("[a-z A-Z]+")) {
			 return false; 
			 
		}else {
			return true; 
		}
		}
	}
	
	public static String getUser(String prompt ) {
		
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false; 
		String input = ""; 
		
		do {
			System.out.println(prompt); 
			try {
				input = myReader.readLine();
		if (( input.length()<3) || (input.length()>12)) {
			valid =  false; 
			System.out.println("ERROR you must enter a name between 3 and 12 letters" );
			
		} else  { 
			
			if (input.matches("[0-9]+")) {
			    valid = false; 	
			}else if (!input.matches("[a-z A-Z]+")) {
			 valid = false; 
			 
		}else {
			valid = true; 
		}
		}
		}catch (Exception e) {
			valid = false; // happen after try. 
			System.out.println("ERROR! you did not eneter a valid name!");
		}
	}while (!valid);
		return input; 
}
}
		
		
		
		
//			if (((name.length()<=3) && (sname.length()<=2)) || ((name.length()>12) && (sname.length()>12))) {
//				return false; 
//			}else {
//				
//				if (name.matches("[0-9]+") && sname.matches("[0-9]+")) {
//				    return false; 	
//				}else {
//			if (!name.matches("[a-z A-Z]") && !sname.matches("[a-z A-Z]"+"'") ) {
//				 return false; 
//				 
//			}else {
//				return true; 
//			}
//			}
//		}
//	}
