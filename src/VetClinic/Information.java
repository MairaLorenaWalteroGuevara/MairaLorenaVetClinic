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
import Staff.*;

public class Information {

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

	ArrayList<Cat> cat = new ArrayList<Cat>();
	ArrayList<Dog> dog = new ArrayList<Dog>();
	ArrayList<Rabbit> rabbit = new ArrayList<Rabbit>();
	ArrayList<Cattle> cattle = new ArrayList<Cattle>();
	ArrayList<Sheep> sheep = new ArrayList<Sheep>();
	
	ArrayList<Administrative> hrTasks = new ArrayList<Administrative>(); 
	ArrayList<Administrative> itTasks = new ArrayList<Administrative>(); 
	ArrayList<Administrative> receptcionistTasks = new ArrayList<Administrative>(); 
	ArrayList<Administrative> holidays = new ArrayList<Administrative>();
	

	public Information() throws IOException {
//		readFiles();
//		anyMedicalStaff(namesList, namesList);
		hierStaff();
		Animal();
		populateQueue();
		assingwork();
//		printStaff();
//		printSmallAnimalsVets();
//		printLargeAnimalsVets();
//		printAdministrativeStaff();
//		printMedicalStaff();
		print();



	}

	public void hierStaff() throws IOException {

		int medicaliD = 111;
		int administrativeiD = 221;

		Random r = new Random();
		// int numMedicalStaff = r.nextInt(30);

		InfoStaff infoStaff = new InfoStaff();
		ArrayList<String> namesStaff = infoStaff.readNamesFile();
		ArrayList<String> surnamesStaff = infoStaff.readSuramesFile();

		for (int i = 0; i < 40; i++) {

			String fname = namesStaff.get(i);
			String sname = surnamesStaff.get(i);

			if (i <= 14) {

				Staff nextStaff = new SmallAnimalsVet(fname, sname, medicaliD);
				Medical nextStaff1 = new SmallAnimalsVet(fname, sname, medicaliD);
				SmallAnimalsVet nextStaff2 = new SmallAnimalsVet(fname, sname, medicaliD);

				staffList.add(nextStaff);
				medicalStaffList.add(nextStaff1);
				smallAnimalsVetsList.add(nextStaff2);

				medicaliD++;
			} else if (i >= 15 && i <= 19) {
				Staff nextStaff = new LargeAnimalsVet(fname, sname, medicaliD);
				Medical nextStaff1 = new LargeAnimalsVet(fname, sname, medicaliD);
				LargeAnimalsVet nextStaff2 = new LargeAnimalsVet(fname, sname, medicaliD);

				staffList.add(nextStaff);
				medicalStaffList.add(nextStaff1);
				largeAnimalsVetsList.add(nextStaff2);

				medicaliD++;
			} else if (i >= 20 && i <= 29) {
				Staff nextStaff = new Laboratorians(fname, sname, medicaliD);
				Medical nextStaff1 = new Laboratorians(fname, sname, medicaliD);
				Laboratorians nextStaff2 = new Laboratorians(fname, sname, medicaliD);

				staffList.add(nextStaff);
				medicalStaffList.add(nextStaff1);
				laboratoriansList.add(nextStaff2);
				medicaliD++;

			} else if (i >= 30 && i <= 34) {
				Staff nextStaff = new Receptionist(fname, sname, administrativeiD);
				Administrative nextStaff1 = new Receptionist(fname, sname, administrativeiD);
				Receptionist nextStaff2 = new Receptionist(fname, sname, administrativeiD);
				staffList.add(nextStaff);
				administrativeStaffList.add(nextStaff1);
				receptionistStaffList.add(nextStaff2);

				administrativeiD++;
			} else if (i >= 35 && i <= 37) {
				Staff nextStaff = new IT(fname, sname, administrativeiD);
				Administrative nextStaff1 = new IT(fname, sname, administrativeiD);
				IT nextStaff2 = new IT(fname, sname, administrativeiD);
				staffList.add(nextStaff);
				administrativeStaffList.add(nextStaff1);
				itStaffList.add(nextStaff2);

				administrativeiD++;
			} else if (i >= 38) {
				Staff nextStaff = new HR(fname, sname, administrativeiD);
				Administrative nextStaff1 = new HR(fname, sname, administrativeiD);
				HR nextStaff2 = new HR(fname, sname, administrativeiD);
				staffList.add(nextStaff);
				administrativeStaffList.add(nextStaff1);
				hrStaffList.add(nextStaff2);

				administrativeiD++;
			}

		}

	}

	public void Animal() throws IOException {

		Random r = new Random();

		InfoAnimals infoAnimals = new InfoAnimals();
		ArrayList<String> animalNames = infoAnimals.animalNamesFile();

		String[] companionIlness = infoAnimals.CompanionIlness();
		String[] livestockIlness = infoAnimals.LilvestockIlness();

		int i = 0;
		
		int min =1;
		int max = 15;
		int age;

		for (i = 0; i < 800; i++) {

			String animalname = animalNames.get(r.nextInt(animalNames.size()));

			age = r.nextInt((max-min)+1)+min;
           
			String medicalCondition = (companionIlness[r.nextInt(companionIlness.length)]);

			if (i <= 299) {
				Animals nextAnimal = new Cat(animalname, age, medicalCondition);
				CompanionAnimals nextAnimal1 = new Cat(animalname, age, medicalCondition);
				Cat nextAnimal2 = new Cat(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				companionAnimalsList.add(nextAnimal1);
				cat.add(nextAnimal2);

//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);
			} else if (i >= 300 && i <= 599) {

				Animals nextAnimal = new Dog(animalname, age, medicalCondition);
				CompanionAnimals nextAnimal1 = new Dog(animalname, age, medicalCondition);
				Dog nextAnimal2 = new Dog(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				companionAnimalsList.add(nextAnimal1);
				dog.add(nextAnimal2);

//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);
			} else if (i >= 600 && i <= 799) {
				Animals nextAnimal = new Rabbit(animalname, age, medicalCondition);
				CompanionAnimals nextAnimal1 = new Rabbit(animalname, age, medicalCondition);
				Rabbit nextAnimal2 = new Rabbit(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				companionAnimalsList.add(nextAnimal1);
				rabbit.add(nextAnimal2);
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);
			}
		}

		for (i = 800; i <= 999; i++) {

			String animalname = animalNames.get(r.nextInt(animalNames.size()));

			age = r.nextInt((max-min)+1)+min;
			
			String medicalCondition = (livestockIlness[r.nextInt(companionIlness.length)]);

			if (i >= 800 && i <= 899) {
				Animals nextAnimal = new Cattle(animalname, age, medicalCondition);
				LivestockAnimals nextAnimal1 = new Cattle(animalname, age, medicalCondition);
				Cattle nextAnimal2 = new Cattle(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				livestockAnimalsList.add(nextAnimal1);
				cattle.add(nextAnimal2);
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);

			} else if (i >= 900) {
				Animals nextAnimal = new Sheep(animalname, age, medicalCondition);
				LivestockAnimals nextAnimal1 = new Sheep(animalname, age, medicalCondition);
				Sheep nextAnimal2 = new Sheep(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				livestockAnimalsList.add(nextAnimal1);
				sheep.add(nextAnimal2);
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);

			}

		}

//		int itemCount = animalList.size();
//		System.out.println(itemCount);
//		int itemCount1 = companionAnimalsList.size();
//		System.out.println(itemCount1);
//		System.out.println("companion Animals " + companionAnimalsList);
//		int itemCount2 = livestockAnimalsList.size();
//		System.out.println(itemCount2);
//		System.out.println("livestock Animals: " + livestockAnimalsList);
//		
//		System.out.println("animal List: " + animalList); 
	}

	public void populateQueue() {

		// Counters, i for companion Animals List and j for small Animals Vets List
		int i = 0;
		int j = 0;
		// while we have companion animals in the list they are going to save each
		// companionAnimals instance in each queue of small Animals Veterinarians
		while (i < companionAnimalsList.size()) {

			// get the animal instance from companionAnimalsList
			CompanionAnimals q = companionAnimalsList.get(i);
			// call the queue for each instance of small Animals Veterinarians and save one
			// companion Animals in each queue until the end of the small Animals Vets list
			smallAnimalsVetsList.get(j).Queue(q);

			// in order to pass to the next the counter have to increase
			i++;
			j++;
			// When we finish to add one animal to each queue of each instance from
			// smallAnimalsVetList, we have to start again the small Animals Vets list
			if (j >= smallAnimalsVetsList.size()) {
				j = 0;
			}
//			System.out.println("This Veterinarian: " + smallAnimalsVetsList.get(j).getMyQueue());
		}

		int k = 0;
		int l = 0;
		while (k < livestockAnimalsList.size()) {

			LivestockAnimals q = livestockAnimalsList.get(k);

			largeAnimalsVetsList.get(l).Queue(q);

			k++;
			l++;

			if (l >= largeAnimalsVetsList.size()) {
				l = 0;
			}

		}

		Random r = new Random();
		int m = 500;
		int n = 0;
		while (m < animalList.size()) {

			Animals q = animalList.get(r.nextInt(animalList.size()));

			laboratoriansList.get(n).Queue(q);
			m++;
			n++;

			if (n >= laboratoriansList.size()) {
				n = 0;
			}

		}
	}

//	public void assingwork() {
//
//		Random r = new Random();
//		Administrative pick = administrativeStaffList.get(r.nextInt(administrativeStaffList.size()));
//
//		int i = 0;
//
//		for (Administrative e : administrativeStaffList) {
//
//			if (e == pick) {
//				
//				e.onHolidays();
//
//			} else if (e instanceof HR) {
//
//			System.out.println(((HR) e).Payment(e));
//
//			} else if (e instanceof IT) {
//				System.out.println(((IT) e).ItTasks(e));
//
//			} else if (e instanceof Receptionist) {
//
//				System.out.println(((Receptionist) e).RecTasks(e));
//
//			}
//			i++;
//		}
//		
//	}
	public Administrative assingwork() {

		Random r = new Random();
		Administrative pick = administrativeStaffList.get(r.nextInt(administrativeStaffList.size()));


		for (Administrative e : administrativeStaffList) {

			if (e == pick) {
				holidays.add(e);
				e.setTask(e, " is on holidays!");  
				
				

			} else if (e instanceof HR) {
				hrTasks.add(e);
				
				e.setTask(e, " is palaning new team activities" + " and making the payroll.");
				
				

			} else if (e instanceof IT) {
				itTasks.add(e);
				e.setTask(e, " is reparing some funtion in the website" + " and adding new staff in the website.");


			} else if (e instanceof Receptionist) {
				
				receptcionistTasks.add(e);
				((Receptionist) e).setTask(e, " is answering the phone" + ", filling formats" + " and making apointments. ");
		
			}
		
			
		}
		return pick; 
		
	}
	

	
	public void print() {

//		System.out.print(hrTasks);
//		System.out.println("Staff list" + staffList);
//		System.out.println("administrative " + administrativeStaffList);
//		System.out.println("ad" + administrativeStaffList);
//		System.out.println("HR" + hrStaffList);
//		System.out.println("IT" + itStaffList);
//		System.out.println("Receptionist" + receptionistStaffList);

//		//System.out.println("medicalList" + medicalStaffList);
//		//System.out.println("small Animal List" + smallAnimalsVetsList);
		// System.out.println("large Animal List" + smallAnimalsVetsList);
//		
//		int staffCount = smallAnimalsVetsList.size();
//		System.out.println(" small vets" + staffCount);
//		int staffCount1 = largeAnimalsVetsList.size();
//		System.out.println("large vets" + staffCount1);
//		int staffCount3 = laboratoriansList.size();
//		System.out.println("laboratorians" + staffCount3);
//		
//		int staffCount4 = largeAnimalsVetsList.size();
//		System.out.println("large vets" + staffCount4);
//		int staffCount5 = laboratoriansList.size();
//		System.out.println("laboratorians" + staffCount5);
//		
//		
//		System.out.println(medicalStaffList);
//		int staffCount2 = administrativeStaffList.size();
//		System.out.println(staffCount2);
//		
//		
//		
//		
//		System.out.println("Animal list :" + animalList);
//		System.out.println("pet list :" +companionAnimalsList);
//		System.out.println("cat list :" +cat);
//		System.out.println("dog list :" +dog);
//		System.out.println("rabbit list :" +rabbit);
//		System.out.println("cattle list :" +cattle);
//		System.out.println("sheep list :" +sheep);
	}
	
	

	
	public String staffSearch(String name, String sname) {


		boolean found = false;
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		int i = 0;

		do {
			if (staffList.get(i).getName().toLowerCase().equals(inputname)
					&& staffList.get(i).getSurname().toLowerCase().equals(inputsname)) {
				found = true;
				return "\n          This employee woks in the clinic \n" + "\n     |     Name: "+staffList.get(i).getName() + " "
						+ staffList.get(i).getSurname() + "\n     |     ID: " + staffList.get(i).getiD() + " "
						+ staffList.get(i).getSalaryLevel();
			}
			i++;
		} while (!found && i < staffList.size());
		return "\n  ----------  SORRY! This employee is not working in the clinic.  ----------  ";

	}
	
	public  void staffnameSearch(String name) {
		

		Staff employee = null; 
		System.out.println(" \n          These are the staff that contain this words:  \n" );
		for (int i=0; i<staffList.size(); i++) {
			if (staffList.get(i).getName().toLowerCase().trim().contains(name)|| staffList.get(i).getSurname().toLowerCase().trim().contains(name)) {
				
				employee= staffList.get(i);

				String name2 = employee.getName(); 
				String sname2= employee.getSurname();
				int id2 = employee.getiD();
				double salary2= employee.getSalaryLevel();
			
				System.out.println("\n     |     Full name: " + name2 +" "+ sname2 + "\n     |     ID: " + id2 + "    and  the salary is: " + salary2+ "\n     |     ");
	
				
			}
		}if (employee==null) {
			System.out.println("\n   ---------  Any staff contains this name  ----------  \n"); 
		}
		}

	public ArrayList<Animals> searchAnimal(String name) {

		ArrayList<Animals> foundanimal = new ArrayList<Animals>();
		// String inputname = name.toLowerCase().trim();

		for (int i = 0; i < animalList.size(); i++) {

			if (animalList.get(i).getName().toLowerCase().equals(name)) {
//			if ( name.equals(animalList.get(i).getName())) {
				Animals a = animalList.get(i);
				foundanimal.add(a);
				
			}
		}
		return foundanimal;
	}

	public int medicalStaffSearch(String name, String sname) {

		boolean found = false;
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		int i = 0;
		int id=0;
		do {

			if (medicalStaffList.get(i).getName().toLowerCase().equals(inputname)
					&& medicalStaffList.get(i).getSurname().toLowerCase().equals(inputsname)) {
				found = true;
				id = medicalStaffList.get(i).getiD();
				
				return id;
			}
			i++;

		} while (!found && i < medicalStaffList.size());

		return id;
	}
	
	

	public int smallVetSearch(String name, String sname) {

		boolean found = false;
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		int i = 0;

		do {
			if (smallAnimalsVetsList.get(i).getName().toLowerCase().equals(inputname)
					&& smallAnimalsVetsList.get(i).getSurname().toLowerCase().equals(inputsname)) {
				found = true;
				return i;
			}
			i++;
		} while (!found && i < smallAnimalsVetsList.size());

		return i;
	}
	
	public int largeVetSearch(String name, String sname) {

		boolean found = false;
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		int i = 0;

		do {
			if (largeAnimalsVetsList.get(i).getName().toLowerCase().equals(inputname)
					&& largeAnimalsVetsList.get(i).getSurname().toLowerCase().equals(inputsname)) {
				found = true;
				return i;
			}
			i++;
		} while (!found && i < largeAnimalsVetsList.size());

		return i;
	}
	
	public int laboratoriansSearch(String name, String sname) {

		boolean found = false;
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		int i = 0;

		do {
			if (laboratoriansList.get(i).getName().toLowerCase().equals(inputname)
					&& laboratoriansList.get(i).getSurname().toLowerCase().equals(inputsname)) {
				found = true;
				return i;
			}
			i++;
		} while (!found && i < laboratoriansList.size());

		return i;
	}



}
