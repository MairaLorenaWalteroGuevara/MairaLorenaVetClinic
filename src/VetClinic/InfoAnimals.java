package VetClinic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

import Animals.Animals;
import Animals.Cat;
import Animals.Cattle;
import Animals.Dog;
import Animals.Rabbit;
import Animals.Sheep;

public class InfoAnimals {
	
	Random r = new Random ();
	
	ArrayList<Animals> animalList = new ArrayList<Animals>();
	ArrayList<Animals> companionAnimalsList = new ArrayList<Animals>();
	ArrayList<Animals> livestockAnimalsList = new ArrayList<Animals>();
	
	
//	public InfoAnimals() throws IOException {
//		animalNamesFile();
//		CompanionIlness ();
//		LilvestockIlness ();
//	}
//	
//	public void addCat(Animals nextAnimal) {
//		// TODO Auto-generated method stub
//
//		animalList.add(nextAnimal);
//		companionAnimalsList.add(nextAnimal);
//		
//	}
//	
//	
//	public void addDog(Animals nextAnimal) {
//		// TODO Auto-generated method stub
//
//		animalList.add(nextAnimal);
//		companionAnimalsList.add(nextAnimal);
//
//	}
//	
//	public void addRabbit(Animals nextAnimal) {
//		// TODO Auto-generated method stub
//
//		animalList.add(nextAnimal);
//		companionAnimalsList.add(nextAnimal);
//
//	}
//
//	public void addCattle(Cattle animal) {
//		// TODO Auto-generated method stub
//
//		animalList.add(animal);
//		livestockAnimalsList.add(animal);
//
//	}
//	
//	public void addSheep(Sheep animal) {
//		// TODO Auto-generated method stub
//
//		animalList.add(animal);
//		livestockAnimalsList.add(animal);
//
//	}
	
	
	
	

	public    ArrayList<String> animalNamesFile() throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> animalNamesFile = new ArrayList<String>(); 
		BufferedReader on = new BufferedReader(new FileReader("AnimalsNames"));
			
		try {

			String line;
			while ((line=on.readLine())!=null) {

			animalNamesFile.add(line); 
			
			}
		
		}catch (IOException e ) {
				throw new FileNotFoundException("Could not read the document");
			}
		
		//System.out.println(animalNamesFile);
		
		int index; 
		ArrayList<String> animalNames = new ArrayList<String>();
		
		for (int i=0; i<animalNamesFile.size(); i++) {
			
		index = new java.util.Random().nextInt(animalNamesFile.size());
		animalNames.add(animalNamesFile.get(index));
		
		} 
		//System.out.println(animalNames);
		
		
		return animalNames; 
	}

	public  String[] CompanionIlness () {
		
		String [] companionIllness = {"Giardiasis", "Salmonella", "MRSA", "Tubercolosis", "Influenza", "Ringworm", "Brucellocis"};
		 
		
		return companionIllness;
		
	}
	
	public  String[] LilvestockIlness () {
		
		String [] livestockIllness = {"Akabane", "Anthrax", "Bluetongue","Cattletick","Cryptococcosis", "Johne's", "Leptospirosis", "Neosporosis", "Tetanus"};
		 
		
		return livestockIllness;
		
	}
	

}
