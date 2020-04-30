package VetClinicInterfaces;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import Staff.Administrative;
import Staff.Medical;

public interface InfoInterface {
	/*
	 * this method need to read all the names and surnames in the file
	 * and put them in Array<infoStaff) randomly 
	 */

public  void  readFiles( ) throws IOException;

public ArrayList<Medical>  anyMedicalStaff(ArrayList<String> name, ArrayList<String> surname);

public ArrayList<Administrative>  anyAdministrativeStaff(String name, String surname); 



	
/*
 * this method need to read all the animals names from the file and take array of type of animal 
 * and put them in Array<infoStaff) randomly 
 */





}
