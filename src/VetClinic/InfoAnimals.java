package VetClinic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

public class InfoAnimals {

	// InfoAnimals class is helping to generate the information that I need to create the
	// Animals instances
	// first to get the names for the animals from the file and create an array list with the names
	

	// Method to read the file and create a Random Array List with the names
	public ArrayList<String> animalNamesFile() throws IOException {
		// TODO Auto-generated method stub

		// Array to safe the names from the file
		ArrayList<String> animalNamesFile = new ArrayList<String>();
		// buffer reader to read the file and get the names
		BufferedReader on = new BufferedReader(new FileReader("AnimalsNames"));

		// try - catch to read the file
		try {

			// while exist a next line in the file that is not null sale the line in the
			// variable line
			String line;
			while ((line = on.readLine()) != null) {

				// and this line to the Array List call animalNamesFile
				animalNamesFile.add(line);

			}

			// if the file is empty or the program can not read it, catch the error
		} catch (IOException e) {
			throw new FileNotFoundException("Could not read the document");
		}

		// I used a lot printers in order to check that it was working ok
		// I am not remove this because maybe in the future will be necessary to check
		// if it is working correctly.
		// System.out.println(animalNamesFile);

		int index;

		// Second ArrayList to generate a random array, could be possible to jump this step
		// and generate the random names in the moment I would create the instances,
		// but I am trying to include every possible way to do it
		ArrayList<String> animalNames = new ArrayList<String>();

		// A for loop to run the code inside for the number of positions on the
		// Arraylist
		for (int i = 0; i < animalNamesFile.size(); i++) {
			// in this case I am using this way to use the random java
			// get a random name from the array list and save in index
			index = new java.util.Random().nextInt(animalNamesFile.size());
			// take the index and save in the array list animalNames
			animalNames.add(animalNamesFile.get(index));

		}
		// Check that the animalNames is random and contain the names
		// System.out.println(animalNames);

		// return the array list with random names
		return animalNames;
	}

	// Because I have two kind of animals they have a different possibles illnesses
	// I created an Array because this give me the opportunity to use the random in
	// an array in Information Class

	// Method to obtain a Array of Illness for the pets
	public String[] CompanionIlness() {

		// create an Array with the next elements
		String[] companionIllness = { "Giardiasis", "Salmonella", "MRSA", "Tubercolosis", "Influenza", "Ringworm",
				"Brucellocis" };

		// return the Array companionIllness
		return companionIllness;

	}

	// Method to obtain a Array of Illness for the livestock animals
	public String[] LilvestockIlness() {

		String[] livestockIllness = { "Akabane", "Anthrax", "Bluetongue", "Cattletick", "Cryptococcosis", "Johne's",
				"Leptospirosis", "Neosporosis", "Tetanus" };

		return livestockIllness;

	}

}
