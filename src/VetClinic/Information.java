package VetClinic;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.jar.Attributes.Name;

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
	
	ArrayList<Staff> staffList = new ArrayList<Staff>();	
	ArrayList<Medical> medicalStaffList = new ArrayList<Medical>();
	ArrayList<SmallAnimalsVet> smallAnimalsVetsList = new ArrayList<SmallAnimalsVet>();
	ArrayList<LargeAnimalsVet> largeAnimalsVetsList = new ArrayList<LargeAnimalsVet>();
	ArrayList<Laboratorians> laboratoriansList = new ArrayList<Laboratorians>();
	ArrayList<Administrative> administrativeStaffList = new ArrayList<Administrative>();
	ArrayList<HR> hrStaffList = new ArrayList<HR>();
	ArrayList<IT> itStaffList = new ArrayList<IT>();
	ArrayList<Receptionist> receptionistStaffList = new ArrayList<Receptionist>();
	
	
	ArrayList<Animals> animalList = new ArrayList<Animals>();
	ArrayList<CompanionAnimals> companionAnimalsList = new ArrayList<CompanionAnimals>();
	ArrayList<LivestockAnimals> livestockAnimalsList = new ArrayList<LivestockAnimals>();

	public Information() throws IOException {
//		readFiles();
//		anyMedicalStaff(namesList, namesList);
		hierStaff();
		Animal ();
		populateQueue();
		assingwork();
	}

	public void hierStaff() throws IOException {
		
		
		
		
		int medicaliD =111;
		int administrativeiD=221;
		
		Random r = new Random();
		//int numMedicalStaff = r.nextInt(30);
		
		 
		InfoStaff infoStaff = new InfoStaff(); 
		 ArrayList<String> namesStaff= infoStaff.readNamesFile();
		 ArrayList<String> surnamesStaff= infoStaff.readSuramesFile();
		 //Queue<Animals> myQueue = new ArrayDeque<Animals>(); 
		 
		//System.out.println(namesStaff);

		
		for (int i=0; i<40; i++) {
			
		 String fname = namesStaff.get(i);
		 String sname = surnamesStaff.get(i);
		 //System.out.println(fname);
		 //System.out.println(sname);
		 
		 
		  if (i<=14) {
			  
			Staff nextStaff = new SmallAnimalsVet(fname,sname,medicaliD);
			Medical nextStaff1 = new SmallAnimalsVet(fname,sname,medicaliD);
			SmallAnimalsVet nextStaff2 = new SmallAnimalsVet(fname,sname,medicaliD);
			
			 staffList.add(nextStaff);
			 medicalStaffList.add(nextStaff1);
			 smallAnimalsVetsList.add(nextStaff2);
			 
			 
			 medicaliD++;
		}else if (i>=15 && i<=19) {
			Staff nextStaff = new LargeAnimalsVet(fname,sname,medicaliD);
			Medical nextStaff1 = new LargeAnimalsVet(fname,sname,medicaliD);
			LargeAnimalsVet nextStaff2 = new LargeAnimalsVet(fname,sname,medicaliD);

			 staffList.add(nextStaff);
			 medicalStaffList.add(nextStaff1);
			 largeAnimalsVetsList.add(nextStaff2);
			 
			 medicaliD++;
		}else if (i>=20 && i<=29 ) {
			Staff nextStaff = new Laboratorians(fname,sname,medicaliD);
			Medical nextStaff1 = new Laboratorians(fname,sname,medicaliD);
			Laboratorians nextStaff2 = new Laboratorians(fname,sname,medicaliD);
			
			 staffList.add(nextStaff);
			 medicalStaffList.add(nextStaff1);
			 laboratoriansList.add(nextStaff2);
			 medicaliD++;
			 
		} else if (i>=30 && i<=34) {
			Staff nextStaff = new Receptionist(fname,sname,administrativeiD);
			Administrative nextStaff1 = new Receptionist(fname,sname,administrativeiD);
			 staffList.add(nextStaff);
			 administrativeStaffList.add(nextStaff1);
			 
			 administrativeiD++;
		}else if (i>=35 && i<=37) {
			Staff nextStaff = new IT(fname,sname,administrativeiD);
			Administrative nextStaff1 = new IT(fname,sname,administrativeiD);
			 staffList.add(nextStaff);
			 administrativeStaffList.add(nextStaff1);
			 
			 administrativeiD++;
		}else if (i>=38) {
			Staff nextStaff = new HR(fname,sname,administrativeiD);
			Administrative nextStaff1 = new HR(fname,sname,administrativeiD);
			 staffList.add(nextStaff);
			 administrativeStaffList.add(nextStaff1);
			 
			 administrativeiD++;
		}
			
		}
		
		System.out.println("administrative " + administrativeStaffList);
		//System.out.println("medicalList" + medicalStaffList);
		//System.out.println("large Animal List" + smallAnimalsVetsList);
		
		int staffCount = smallAnimalsVetsList.size();
		System.out.println(" small vets" + staffCount);
		int staffCount1 = largeAnimalsVetsList.size();
		System.out.println("large vets" + staffCount1);
		int staffCount3 = laboratoriansList.size();
		System.out.println("laboratorians" + staffCount3);
		
		int staffCount4 = largeAnimalsVetsList.size();
		System.out.println("large vets" + staffCount4);
		int staffCount5 = laboratoriansList.size();
		System.out.println("laboratorians" + staffCount5);
		
		
		System.out.println(medicalStaffList);
		int staffCount2 = administrativeStaffList.size();
		System.out.println(staffCount2);
		System.out.println(administrativeStaffList);
		
		System.out.println(staffList);
		
	}
	
	
	public void Animal () throws IOException {
		
		
		
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
						
		
		String animalname= animalNames.get(r.nextInt(animalNames.size()));
						
		int age = r.nextInt(15);
							
		String medicalCondition = (livestockIlness[r.nextInt(companionIlness.length)]);
		
		if (i>=800 && i<=899) {
				 Animals nextAnimal = new Cattle(animalname,age,medicalCondition );
				 LivestockAnimals nextAnimal1 = new Cattle(animalname,age,medicalCondition );
				 animalList.add(nextAnimal);
				 livestockAnimalsList.add(nextAnimal1);
		
		}else if ( i>=900) {
				 Animals nextAnimal = new Sheep(animalname,age,medicalCondition );
				 LivestockAnimals nextAnimal1 = new Sheep(animalname,age,medicalCondition );
				 animalList.add(nextAnimal);
				 livestockAnimalsList.add(nextAnimal1);
	
			
			}
			
		 }
		
		int itemCount = animalList.size();
		System.out.println(itemCount);
		int itemCount1 = companionAnimalsList.size();
		System.out.println(itemCount1);
		System.out.println("companion Animals " + companionAnimalsList);
		int itemCount2 = livestockAnimalsList.size();
		System.out.println(itemCount2);
		System.out.println("livestock Animals: " + livestockAnimalsList);
		
		System.out.println("animal List: " + animalList); 
	}
	

	public void populateQueue() {

		// Counters, i for companion Animals List and j for small Animals Vets List 
		int i=0;
		int j=0; 
		// while we have companion animals in the list they are going to save each companionAnimals instance in each queue of  small Animals Veterinarians 
			while ( i<companionAnimalsList.size()) {
					
				// get the animal instance from companionAnimalsList 
					CompanionAnimals q =companionAnimalsList.get(i);
				// call the queue for each instance of small Animals Veterinarians and save one companion Animals in each queue until the end of the small Animals Vets list 
					smallAnimalsVetsList.get(j).Queue(q);
					
				// in order to pass to the next the counter have to increase
					i++;
					j++; 
			   // When we finish to add one animal to each queue of each instance from smallAnimalsVetList, we have to start again the small Animals Vets list 
					if (j>= smallAnimalsVetsList.size()) {
					j=0; 
					}
				}
			
			
			int k=0;
			int l=0;
			while ( k<livestockAnimalsList.size()) {
				
				
					LivestockAnimals q =livestockAnimalsList.get(k);
				 
					largeAnimalsVetsList.get(l).Queue(q); 
					
				
					k++;
					l++; 
			   
					if (l>= largeAnimalsVetsList.size()) {
					l=0; 
					}
				}
			
			System.out.println("   queue large Animals Vets:   " + largeAnimalsVetsList.get(0).getMyQueue());
			
			
			Random r = new Random(); 
			int m=500;
			int n=0;
			while ( m<animalList.size()) {
				
				
				Animals q =animalList.get(r.nextInt(animalList.size()));
				
				
				laboratoriansList.get(n).Queue(q); 
				m++;
				n++; 
		   
				if (n>= laboratoriansList.size()) {
				n=0; 
				}
				
			}
			
			System.out.println("   queue laboratorista:   " + laboratoriansList.get(9).getMyQueue());
			System.out.println("   queue laboratorista:   " + laboratoriansList.get(0).getMyQueue());	
			}
	
	
	public void assingwork() {
		
		Random r = new Random(); 
		
		 Administrative pick = administrativeStaffList.get(r.nextInt(administrativeStaffList.size()));
		 
		 
		 
		 for (Administrative e: administrativeStaffList) {
			 
			 if (e == pick) {
				 
				 System.out.println(e);
				 e.onHolidays();
				
			 } else if (e instanceof HR) {
					System.out.println(e);
					((HR)e).Payment();
					((HR)e).moralActivities();
					
			 }else if (e instanceof IT) {
					System.out.println(e);
					((IT)e).repairSoftware();
					((IT)e).addNewContain();
					
				}else if (e instanceof Receptionist) {
					System.out.println(e);
					((Receptionist)e).answerPhone();
					((Receptionist)e).fillFormat();
				}
				
		 }
			 
		
//		int i=0; 
//		while (i<5) {
//			
//		
//		 
//		 
//			if (pick instanceof HR ) {
//				System.out.println(pick);
//				((HR)pick).Payment();
//				
//			}else if (pick instanceof IT ) {
//				System.out.println(pick);
//				((IT)pick).repairSoftware();
//				
//			}else if (pick instanceof Receptionist ) {
//				System.out.println(pick);
//				((Receptionist)pick).answerPhone();
//				
//			}
//			i++;
//		}
//		
//		int f=0; 
//		while (f<5) {
//			
//		 Administrative pick = administrativeStaffList.get(r.nextInt(administrativeStaffList.size()));
//		 
//		 
//			if (pick instanceof HR ) {
//				System.out.println(pick);
//				((HR)pick).moralActivities();
//				
//			}else if (pick instanceof IT ) {
//				System.out.println(pick);
//				((IT)pick).addNewContain();
//				
//			}else if (pick instanceof Receptionist ) {
//				System.out.println(pick);
//				((Receptionist)pick).fillFormat();
//			}
//			f++;
//		}
			 
		System.out.println("Administrative list" + administrativeStaffList);
		//shuffleCollection(administrativeStaffList);
		//Collections.shuffle(administrativeStaffList);
		//System.out.println("After shuffle adminsitrative list" + administrativeStaffList);
		
	}
	
	

	}


		

	
	


	


	

	


