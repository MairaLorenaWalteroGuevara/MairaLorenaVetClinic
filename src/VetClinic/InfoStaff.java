package VetClinic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class InfoStaff {

	// InfoAStaff class is helping to generate the information that I need to create
	// the
	// Staff instances
	// first to get the names for the staff from the file and create an array list
	// with the names
	// Second to get the surnames for the staff from the file and create an array
	// list with the surnames
	Random r = new Random();

	// String variables for name and surname and they are protected because I want
	// to allow to use in all the java files in the Vet Clinic package
	protected String name;
	protected String surname;

	// Array List are going to use only in this class
	ArrayList<String> namesFile = new ArrayList<String>();
	ArrayList<String> surnamesFile = new ArrayList<String>();

	public InfoStaff() throws IOException {

		readSuramesFile();
		readNamesFile();

	}

	public ArrayList<String> readNamesFile() throws IOException {
		// TODO Auto-generated method stub

		String file = "Names";
		// buffer reader to read the files
		BufferedReader in = null;

		// try and catch to read the file and get the names inside
		try {

			in = new BufferedReader(new FileReader(file));
			// String variable to put each name from each line of the text Names
			String linenames;
			while ((linenames = in.readLine()) != null) {

				// I am adding each name from the file inside the array namesFile
				namesFile.add(linenames);

			}
			// catch the exception if the file is empty or the program can not read it
		} catch (IOException e) {
			throw new FileNotFoundException("Could not read the document");
		} finally {

			try {
				if (in != null)
					in.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			// it was presenting some problems for that I used this code to stop to read the
			// file.
		}

		// Checked that the names was inside of the array
		// System.out.println(namesFile);

		// Generate a random array, could be possible to jump this step
		// and generate the random names in the moment I would create the instances,
		// but I am trying to include every possible way to do it
		int index;
		// ArrayList to save the names randomly
		ArrayList<String> namesStaff = new ArrayList<String>();

		// run the code until i is bigger that the size of the array
		for (int i = 0; i < namesFile.size(); i++) {
			// in this case I am using this way to use the random java, the same that in
			// InfoAnimals
			// get a random name from the array list and save in index
			index = new java.util.Random().nextInt(namesFile.size());
			// save the index in the Array List called namesStaff
			namesStaff.add(namesFile.get(index));

		}
		// Checked that the namesStaff is random and contains the names
		// System.out.println(namesStaff);

		// return the random ArrayList with the names
		return namesStaff;

	}

	// repeat the same that I did in readnamesFile method but now with Surnames file
	public ArrayList<String> readSuramesFile() throws IOException {
		// TODO Auto-generated method stub

		BufferedReader on = new BufferedReader(new FileReader("Surnames"));

		try {

			String linesurnames;
			while ((linesurnames = on.readLine()) != null) {

				surname = linesurnames;

				// System.out.println(name + " " + surname);

				surnamesFile.add(surname);

			}

		} catch (IOException e) {
			throw new FileNotFoundException("Could not read the document");
		}

		int index;
		ArrayList<String> surnamesStaff = new ArrayList<String>();

		for (int i = 0; i < surnamesFile.size(); i++) {

			index = new java.util.Random().nextInt(surnamesFile.size());
			surnamesStaff.add(surnamesFile.get(index));

		}
		// System.out.println(surnamesStaff);

		return surnamesStaff;
	}

}
