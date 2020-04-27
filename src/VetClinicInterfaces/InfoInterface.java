package VetClinicInterfaces;

import java.io.BufferedReader;
import java.io.IOException;

public interface InfoInterface {
	/*
	 * this method need to read all the names and surnames in the file
	 * and put them in Array<infoStaff) randomly 
	 */

public InfoStaffInterface createInfoStaff(BufferedReader in, BufferedReader on) throws IOException;;

	/*
	 * this method need to read all the animals names from the file and take array of type of animal 
	 * and put them in Array<infoStaff) randomly 
	 */

public InfoAnimalsInterface createInfoAnimals(BufferedReader in) throws IOException;; 




}
