package VetClinic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import Animals.Animals;
import Animals.Cat;
import Animals.Cattle;
import Animals.CompanionAnimals;
import Animals.Dog;
import Animals.LivestockAnimals;
import Animals.Rabbit;
import Animals.Sheep;
import Staff.Medical;
import Staff.*;

public class Information  {

	public Information() throws IOException {
//		readFiles();
//		anyMedicalStaff(namesList, namesList);
		hierStaff();
		Animal ();
	}

	public void hierStaff() throws IOException {
		
		
		ArrayList<Staff> staffList = new ArrayList<Staff>();	
		ArrayList<Medical> medicalStaffList = new ArrayList<Medical>();
		ArrayList<Administrative> administrativeStaffList = new ArrayList<Administrative>();
		
		int medicaliD =111;
		int administrativeiD=221;
		
		Random r = new Random();
		int numMedicalStaff = r.nextInt(30);
		
		InfoStaff infoStaff = new InfoStaff(); 
		 ArrayList<String> namesStaff= infoStaff.readNamesFile();
		 ArrayList<String> surnamesStaff= infoStaff.readSuramesFile();
		//System.out.println(namesStaff);

		
		for (int i=0; i<40; i++) {
			
		 String fname = namesStaff.get(i);
		 String sname = surnamesStaff.get(i);
		 //System.out.println(fname);
		 //System.out.println(sname);
		 
		 
		  if (i<=14) {
			Staff nextStaff = new SmallAnimalsVet(fname,sname,medicaliD);
			Medical nextStaff1 = new SmallAnimalsVet(fname,sname,medicaliD);
			 staffList.add(nextStaff);
			 medicalStaffList.add(nextStaff1);
			 
			 medicaliD++;
		}else if (i>=15 && i<=20) {
			Staff nextStaff = new LargeAnimalsVet(fname,sname,medicaliD);
			Medical nextStaff1 = new LargeAnimalsVet(fname,sname,medicaliD);

			 staffList.add(nextStaff);
			 medicalStaffList.add(nextStaff1);
			 
			 medicaliD++;
		}else if (i>=20 && i<=29 ) {
			Staff nextStaff = new Laboratorians(fname,sname,medicaliD);
			Medical nextStaff1 = new Laboratorians(fname,sname,medicaliD);
			 staffList.add(nextStaff);
			 medicalStaffList.add(nextStaff1);
			 
			 medicaliD++;
		} else if (i>=30 && i<=35) {
			Staff nextStaff = new Receptionist(fname,sname,administrativeiD);
			Administrative nextStaff1 = new Receptionist(fname,sname,administrativeiD);
			 staffList.add(nextStaff);
			 administrativeStaffList.add(nextStaff1);
			 
			 administrativeiD++;
		}else if (i>=36 && i<=38) {
			Staff nextStaff = new IT(fname,sname,administrativeiD);
			Administrative nextStaff1 = new IT(fname,sname,administrativeiD);
			 staffList.add(nextStaff);
			 administrativeStaffList.add(nextStaff1);
			 
			 administrativeiD++;
		}else if (i>=39) {
			Staff nextStaff = new HR(fname,sname,administrativeiD);
			Administrative nextStaff1 = new HR(fname,sname,administrativeiD);
			 staffList.add(nextStaff);
			 administrativeStaffList.add(nextStaff1);
			 
			 administrativeiD++;
		}
			
		}
		int staffCount = staffList.size();
		System.out.println(staffCount);
		int staffCount1 = medicalStaffList.size();
		System.out.println(staffCount1);
		System.out.println(medicalStaffList);
		int staffCount2 = administrativeStaffList.size();
		System.out.println(staffCount2);
		System.out.println(administrativeStaffList);
		
		System.out.println(staffList);
		
	}
	
	
	public void Animal () throws IOException {
		
		ArrayList<Animals> animalList = new ArrayList<Animals>();
		ArrayList<CompanionAnimals> companionAnimalsList = new ArrayList<CompanionAnimals>();
		ArrayList<LivestockAnimals> livestockAnimalsList = new ArrayList<LivestockAnimals>();
		
		Random r = new Random();
		
		InfoAnimals infoAnimals = new InfoAnimals(); 
		 ArrayList<String> animalNames = infoAnimals.animalNamesFile();
		 
		 String [] companionIlness = infoAnimals.CompanionIlness();
		 String [] livestockIlness = infoAnimals.LilvestockIlness();
		 
		//System.out.println(animalNames);
		
		int i=0; 
		
		 
		for ( i=0; i<800; i++) {
			
			
		// String animalname= animalNames.get(i);
			String animalname= animalNames.get(r.nextInt(animalNames.size()));
		
			int age = r.nextInt(15);
			
			String medicalCondition = (companionIlness[r.nextInt(companionIlness.length)]);
		 
			//System.out.println(medicalCondition);
		 
			if(i<=299) {
			Animals nextAnimal = new Cat(animalname,age,medicalCondition );
			CompanionAnimals nextAnimal1 = new Cat(animalname,age,medicalCondition );
			animalList.add(nextAnimal);
			companionAnimalsList.add(nextAnimal1);
		 
		 //System.out.println(nextAnimal); 

		} else if (i>=300 && i<=599) {
			
			Animals nextAnimal = new Dog(animalname,age,medicalCondition );
			CompanionAnimals nextAnimal1 = new Dog(animalname,age,medicalCondition );
			animalList.add(nextAnimal);
			companionAnimalsList.add(nextAnimal1);
	//		 infoAnimals.addDog(nextAnimal);
		} else if (i>=600 && i<=799) {
				 Animals nextAnimal = new Rabbit(animalname,age,medicalCondition );
				 CompanionAnimals nextAnimal1 = new Rabbit(animalname,age,medicalCondition );
				 animalList.add(nextAnimal);
				 companionAnimalsList.add(nextAnimal1);
		//		 infoAnimals.addRabbit(nextAnimal);
		}
	}
		
		for ( i=800;  i<=999; i++) {
						
		// String animalname= animalNames.get(i);
		
		String animalname= animalNames.get(r.nextInt(animalNames.size()));
						
		int age = r.nextInt(15);
							
		String medicalCondition = (livestockIlness[r.nextInt(companionIlness.length)]);
		
		if (i>=800 && i<=899) {
				 Animals nextAnimal = new Cattle(animalname,age,medicalCondition );
				 LivestockAnimals nextAnimal1 = new Cattle(animalname,age,medicalCondition );
				 animalList.add(nextAnimal);
				 livestockAnimalsList.add(nextAnimal1);
		//		 infoAnimals.addRabbit(nextAnimal);
			
		}else if ( i>=900) {
				 Animals nextAnimal = new Sheep(animalname,age,medicalCondition );
				 LivestockAnimals nextAnimal1 = new Sheep(animalname,age,medicalCondition );
				 animalList.add(nextAnimal);
				 livestockAnimalsList.add(nextAnimal1);
		//		 infoAnimals.addRabbit(nextAnimal);
			
			}
			
		 }
		
		int itemCount = animalList.size();
		System.out.println(itemCount);
		int itemCount1 = companionAnimalsList.size();
		System.out.println(itemCount1);
		System.out.println(companionAnimalsList);
		int itemCount2 = livestockAnimalsList.size();
		System.out.println(itemCount2);
		System.out.println(livestockAnimalsList);
		
		System.out.println(animalList); 
	}
	


}

		

		

	
	


	


	

	


