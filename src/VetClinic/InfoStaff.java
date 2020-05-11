package VetClinic;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import Staff.Administrative;
import Staff.HR;
import Staff.IT;
import Staff.Medical;
import Staff.Receptionist;
import Staff.Staff;
import VetClinicInterfaces.InfoStaffInterface;

public class InfoStaff {
	Random r = new Random();
	
	// String variables for name and surname and they are protected because i want to allow to use in all the java files in the Vet Clinic package 
	protected String name; 
	protected String surname;
	
	
	// Array List are going to use only in this class 
	 ArrayList<String> namesFile = new ArrayList<String>(); 
	 ArrayList<String> surnamesFile = new ArrayList<String>();
	

	
	public InfoStaff() throws IOException {
		
		readSuramesFile();
		readNamesFile();
		 
	}
	
	public    ArrayList<String> readNamesFile() throws IOException {
		// TODO Auto-generated method stub
	
		
		String file = "Names"; 
		// buffer reader to read the files 
		BufferedReader in = null; 
		
		// try and catch to read the file and get the names inside 
		try {

			in =  new BufferedReader(new FileReader(file));
			// String variable to put each name from each line of the text Names
			String linenames; 
			while ((linenames=in.readLine())!=null){
			
			//name= linenames; 
			
			// I am adding each name from the file inside the array namesFile
			namesFile.add(linenames); 
			
			}
		// catch the exception if the file is empty
		}catch (IOException e ) {
				throw new FileNotFoundException("Could not read the document");
			}finally {

			   try {
			    if (in != null)
			     in.close();
			   } catch (IOException ex) {
			    ex.printStackTrace();
			   }
		
			}
		
		//System.out.println(namesFile);
		int index; 
		ArrayList<String> namesStaff = new ArrayList<String>();
		
		for (int i=0; i<namesFile.size(); i++) {
			
		index = new java.util.Random().nextInt(namesFile.size());
		namesStaff.add(namesFile.get(index));
		
		
		} 
		//System.out.println(namesStaff);
		
		
		return namesStaff; 

	
	}

	// repeat the same that I did in  readnamesFile method but now with Surnames file 
	public    ArrayList<String> readSuramesFile() throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader on = new BufferedReader(new FileReader("Surnames"));
			
		try {

			String linesurnames;
			while ((linesurnames=on.readLine())!=null) {
				
			surname=linesurnames; 
			
			//System.out.println(name + " " + surname);

			surnamesFile.add(surname); 
			
			}
		
		}catch (IOException e ) {
				throw new FileNotFoundException("Could not read the document");
			}
		
		int index; 
		ArrayList<String> surnamesStaff = new ArrayList<String>();
		
		for (int i=0; i<surnamesFile.size(); i++) {
			
		index = new java.util.Random().nextInt(surnamesFile.size());
		surnamesStaff.add(surnamesFile.get(index));
		
		} 
		//System.out.println(surnamesStaff);
		
		
		return surnamesStaff; 
	}
	
	
//	public void assingwork(ArrayList<Administrative> administrativeStaffList) {
//		
//		Random r = new Random(); 
//		
//		for (int i=0; i<administrativeStaffList.size(); i++) {
//			
//		
//		Administrative s = administrativeStaffList.get(r.nextInt(administrativeStaffList.size())); 
//		Administrative s1 = administrativeStaffList.get(r.nextInt(administrativeStaffList.size())); 
//		
//		
//		if (s.getiD()==221 && s.getiD()<=225 || s1.getiD()==221 && s1.getiD()<=225) {
//			
//			Receptionist a = (Receptionist) s;
//			Receptionist b = (Receptionist) s1;
//			a.fillFormat();
//			b.answerPhone();
//			System.out.print(a);
//			
//		} else if (s.getiD()==226 && s.getiD()<=228 || s1.getiD()==226 && s1.getiD()<=228) {
//			
//			IT a = (IT) s;
//			IT b = (IT) s1;
//			a.addNewContain();
//			b.repairSoftware();
//			
//		} else if (s.getiD()==229 && s.getiD()<=230 || s1.getiD()==229 && s1.getiD()<=230) {
//			
//			HR a = (HR) s;
//			HR b = (HR) s1;
//			a.Payment();
//			b.moralActivities();
//			
//		}
//		}
//		
		
		
//	}
}
