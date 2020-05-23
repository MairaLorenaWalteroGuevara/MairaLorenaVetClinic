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
import Staff.*;

public class Information {

	// This class contain the main method to create each point and is divide in:

	// 1. Creation of the Staff instances
	// 2. Creation of Animals instances
	// 3. Population of the Queue
	// 4 Tasks assignment to each Administrative staff
	// 5. Search

//****************************************** ARRAY LIST FOR EACH GROUP OF STAFF ************************************//
	// I decided to create an array list for each staff type because I thought it was
	// more convenient to print, and use in other methods.
	// In the end, these Array List made easier to print, to populate the queue, and
	// to search for a specific staff
	// but it was a little challenging, when I had to search for an employee and
	// return the Queue. Because the queues are creating with the instances inside of
	//smallAnimalsVestList, largeAnimalsVestList and  laboratoriansList. 
	// For that reason, I had to search the employee in medicalStaffList, 
	// and to get an attribute of the instance. 
	// Whit this attribute, I have to identified if this instance is part of 
	//smallAnimalsVestList, largeAnimalsVestList and  laboratoriansList.
	// Then I will be able to search for the right instance and get the queue. 
	// I will be explain more in Search method and in VetClinic Number 8 and 10. 
	ArrayList<Staff> staffList = new ArrayList<Staff>();
	ArrayList<Medical> medicalStaffList = new ArrayList<Medical>();
	ArrayList<SmallAnimalsVet> smallAnimalsVetsList = new ArrayList<SmallAnimalsVet>();
	ArrayList<LargeAnimalsVet> largeAnimalsVetsList = new ArrayList<LargeAnimalsVet>();
	ArrayList<Laboratorians> laboratoriansList = new ArrayList<Laboratorians>();
	ArrayList<Administrative> administrativeStaffList = new ArrayList<Administrative>();
	ArrayList<HR> hrStaffList = new ArrayList<HR>();
	ArrayList<IT> itStaffList = new ArrayList<IT>();
	ArrayList<Receptionist> receptionistStaffList = new ArrayList<Receptionist>();

	// ******************* ARRAY LIST FOR EACH GROUP OF STAFF ********************//

	// I did the same for animals
	ArrayList<Animals> animalList = new ArrayList<Animals>();
	ArrayList<CompanionAnimals> companionAnimalsList = new ArrayList<CompanionAnimals>();
	ArrayList<LivestockAnimals> livestockAnimalsList = new ArrayList<LivestockAnimals>();

	ArrayList<Cat> cat = new ArrayList<Cat>();
	ArrayList<Dog> dog = new ArrayList<Dog>();
	ArrayList<Rabbit> rabbit = new ArrayList<Rabbit>();
	ArrayList<Cattle> cattle = new ArrayList<Cattle>();
	ArrayList<Sheep> sheep = new ArrayList<Sheep>();

	// ******************* ARRAY LIST OF INTANCE WITH TASKS **********************//
	// These ArrayList contain the instance of administrative staff with their
	// tasks.
	// I create this arrays, because it was the way I found to save the instances
	// that contain the specific tasks and be able to print it.
	ArrayList<Administrative> hrTasks = new ArrayList<Administrative>();
	ArrayList<Administrative> itTasks = new ArrayList<Administrative>();
	ArrayList<Administrative> receptcionistTasks = new ArrayList<Administrative>();
	ArrayList<Administrative> holidays = new ArrayList<Administrative>();

	// constructor to run the methods I needed to run in order to be able to run the
	// main project
	// The methods I called in VetClinic I do not need to run in here, but if I do
	// not call the method in VetClinic
	// I need to be able to run in somewhere and here is the place.

	public Information() throws IOException {

		hierStaff();
		Animal();
		populateQueue();
		assingwork();
		print();
	}

	// ******************* 1. Creation of the Staff instances *******************//

	// Because in here, we are using the method from InfoStaff that use a throw
	// Exception to catch any error in the moment of read the file. We need to use
	// the throw exception.
	public void hierStaff() throws IOException {

		// To set up the Id for medical and administrative staff
		int medicaliD = 111;
		int administrativeiD = 221;

		// I am using this mark to close some attempts that could be usefull in the
		// future
		// <<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>//
		// whit this random is possible to create a random number between 0 to 30, the
		// idea it was to create a random quantity of medical staff, but also it could
		// be use to create a random id
		// the idea of create a random number of staff type, it is possible and
		// challenging.
		// Random r = new Random();
		// int numMedicalStaff = r.nextInt(30);
		// <<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>//

		// Creation of InfoStaff instance to allow me to run and be able to use the
		// ArrayList created in that methods
		InfoStaff infoStaff = new InfoStaff();
		// I Brought the ArrayList with random names and surnames from InfoStaff using
		// the instance infoStaff
		ArrayList<String> namesStaff = infoStaff.readNamesFile();
		ArrayList<String> surnamesStaff = infoStaff.readSuramesFile();

		// Loop to create a 40 instances for my Staff
		for (int i = 0; i < 40; i++) {

			// get the a name and surname from the arrays with each FOR run
			String fname = namesStaff.get(i);
			String sname = surnamesStaff.get(i);

			// -------------------- CREATE THE MEDICAL STAFF -----------------------------//

			// ------------------- CREATE THE VETERINARIANS FOR PETS ---------------------//
			// for the first 15 runs create the Veterinarians for pets
			// 15 Veterinarians for pets
			if (i <= 14) {

				// I created 3 instances with the same information and saving in 3 different
				// arrays
				Staff nextStaff = new SmallAnimalsVet(fname, sname, medicaliD);
				Medical nextStaff1 = new SmallAnimalsVet(fname, sname, medicaliD);
				SmallAnimalsVet nextStaff2 = new SmallAnimalsVet(fname, sname, medicaliD);

				staffList.add(nextStaff);
				medicalStaffList.add(nextStaff1);
				smallAnimalsVetsList.add(nextStaff2);
				// The id of medical staff is going to increase for each FOR run
				medicaliD++;

				// ---------- CREATE THE VETERINARIANS FOR LIVESTOCK ANIMALS --------------//
				// between the 16 run to 20 run create the Veterinarians for livestock animals
				// 5 Veterinarians for livestock animals
			} else if (i >= 15 && i <= 19) {

				Staff nextStaff = new LargeAnimalsVet(fname, sname, medicaliD);
				Medical nextStaff1 = new LargeAnimalsVet(fname, sname, medicaliD);
				LargeAnimalsVet nextStaff2 = new LargeAnimalsVet(fname, sname, medicaliD);

				staffList.add(nextStaff);
				medicalStaffList.add(nextStaff1);
				largeAnimalsVetsList.add(nextStaff2);

				medicaliD++;

				// ---------- CREATE THE LABORATORIANS --------------//
				// between the 21 run to 30 run create the Laboratorians
				// 10 Laboratorians
			} else if (i >= 20 && i <= 29) {
				Staff nextStaff = new Laboratorians(fname, sname, medicaliD);
				Medical nextStaff1 = new Laboratorians(fname, sname, medicaliD);
				Laboratorians nextStaff2 = new Laboratorians(fname, sname, medicaliD);

				staffList.add(nextStaff);
				medicalStaffList.add(nextStaff1);
				laboratoriansList.add(nextStaff2);
				medicaliD++;

				// ---------------- CREATE THE ADMINISTRATIVE STAFF ----------------------//
				// I thought we are going to need more Receptionist that IT and HR staff
				// -------------------- CREATE THE RECEPTIONIST -------------------------//
				// between the 31 run to 35 run create the Receptionist

				// 5 receptionist
			} else if (i >= 30 && i <= 34) {
				Staff nextStaff = new Receptionist(fname, sname, administrativeiD);
				Administrative nextStaff1 = new Receptionist(fname, sname, administrativeiD);
				Receptionist nextStaff2 = new Receptionist(fname, sname, administrativeiD);
				staffList.add(nextStaff);
				administrativeStaffList.add(nextStaff1);
				receptionistStaffList.add(nextStaff2);
				// in here the medical id change to administrative id and start to increment
				administrativeiD++;

				// --------------------- CREATE THE IT STAFF----------------------------//
				// between the 36 run to 38 run create the IT staff
				// 3 IT employees
			} else if (i >= 35 && i <= 37) {
				Staff nextStaff = new IT(fname, sname, administrativeiD);
				Administrative nextStaff1 = new IT(fname, sname, administrativeiD);
				IT nextStaff2 = new IT(fname, sname, administrativeiD);
				staffList.add(nextStaff);
				administrativeStaffList.add(nextStaff1);
				itStaffList.add(nextStaff2);

				administrativeiD++;

				// --------------------- CREATE THE HR STAFF----------------------------//
				// for 39 and 40 run create the HR staff
				// 3 HR employees
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

	// ******************* 2. Creation of Animals instances *******************//

	// We need to use the throw exception in here, because we are using the method
	// from InfoAnimals that use a throw Exception to catch any error in the moment
	// of read the file. .

	public void Animal() throws IOException {

		// I need the random in here, because the Array of the illness is not random and
		// it must be random.
		// in addition I need to use the random to get a age randomly for each type of
		// animal
		Random r = new Random();

		// instance of InfoAnimals in order to bring the ArrayList and the Array
		InfoAnimals infoAnimals = new InfoAnimals();
		// I brought the ArrayList with names and the Array with illness for each kind
		// of animal.
		ArrayList<String> animalNames = infoAnimals.animalNamesFile();
		String[] companionIlness = infoAnimals.CompanionIlness();
		String[] livestockIlness = infoAnimals.LilvestockIlness();

		// Initialized the variable use in the FOR loop
		int i = 0;
		// set up the range of Age, between 1 to 15 years
		int min = 1;
		int max = 15;
		int age;

		// ------------------- CREATION OF COMPANION ANIMALS
		// ---------------------------//

		// The FOR loop is going to run until create 800 animals
		for (i = 0; i < 800; i++) {

			// string variable to get a random name from the array list of names
			// Because the array list is random this random it is not necessary but I wrote
			// in here in order to use other way to code the random for the Array List
			String animalname = animalNames.get(r.nextInt(animalNames.size()));

			// Age was set up randomly between the minim of 1 and the maximum of 15
			age = r.nextInt((max - min) + 1) + min;

			// Random medical condition for each animal
			// This is the random using an Array, we can see that change size for length
			// because now is an Array, the square brackets to refer an Array and is
			// necessary to add other brackets to close the code.
			String medicalCondition = (companionIlness[r.nextInt(companionIlness.length)]);

			// ---------------------- CREATION OF CATS --------------------------------//
			// Create Cats in the first 300 runs
			// 300 Cats
			if (i <= 299) {
				Animals nextAnimal = new Cat(animalname, age, medicalCondition);
				CompanionAnimals nextAnimal1 = new Cat(animalname, age, medicalCondition);
				Cat nextAnimal2 = new Cat(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				companionAnimalsList.add(nextAnimal1);
				cat.add(nextAnimal2);

				// to check if the instances are the same.
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);

				// ---------------------- CREATION OF DOGS --------------------------------//
				// Create Dogs in btween the 301 and 600 runs
				// 300 Dogs
			} else if (i >= 300 && i <= 599) {

				Animals nextAnimal = new Dog(animalname, age, medicalCondition);
				CompanionAnimals nextAnimal1 = new Dog(animalname, age, medicalCondition);
				Dog nextAnimal2 = new Dog(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				companionAnimalsList.add(nextAnimal1);
				dog.add(nextAnimal2);
				// to check if the instances are the same.
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);

				// ---------------------- CREATION OF RABBITS --------------------------------//
				// Create Rabbits in between the 601 and 800 runs
				// 200 Rabbits

			} else if (i >= 600 && i <= 799) {
				Animals nextAnimal = new Rabbit(animalname, age, medicalCondition);
				CompanionAnimals nextAnimal1 = new Rabbit(animalname, age, medicalCondition);
				Rabbit nextAnimal2 = new Rabbit(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				companionAnimalsList.add(nextAnimal1);
				rabbit.add(nextAnimal2);
				// to check if the instances are the same.
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);
			}
		}

		// ------------------- CREATION OF LIVESTOCK ANIMALS
		// ---------------------------//

		// I create the livestock animals instances a part because the Illness Array I
		// used in here is different, the rest of is the same, also the code is the
		// same.

		// REPEAT THE SAME THAT BEFORE
		// The FOR loop is going to run until create 200 animals
		for (i = 800; i <= 999; i++) {

			String animalname = animalNames.get(r.nextInt(animalNames.size()));

			age = r.nextInt((max - min) + 1) + min;

			String medicalCondition = (livestockIlness[r.nextInt(companionIlness.length)]);

			// ---------------------- CREATION OF CATTLE --------------------------------//
			// Create Cattle in the first 100 runs
			// 100 Catlles
			if (i >= 800 && i <= 899) {
				Animals nextAnimal = new Cattle(animalname, age, medicalCondition);
				LivestockAnimals nextAnimal1 = new Cattle(animalname, age, medicalCondition);
				Cattle nextAnimal2 = new Cattle(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				livestockAnimalsList.add(nextAnimal1);
				cattle.add(nextAnimal2);
				// to check if the instances are the same.
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);

				// ---------------------- CREATION OF SHEEPS --------------------------------//
				// Create Sheeps in last 100 runs
				// 100 Sheeps
			} else if (i >= 900) {
				Animals nextAnimal = new Sheep(animalname, age, medicalCondition);
				LivestockAnimals nextAnimal1 = new Sheep(animalname, age, medicalCondition);
				Sheep nextAnimal2 = new Sheep(animalname, age, medicalCondition);
				animalList.add(nextAnimal);
				livestockAnimalsList.add(nextAnimal1);
				sheep.add(nextAnimal2);
				// to check if the instances are the same.
//				System.out.println(nextAnimal);
//				System.out.println(nextAnimal1);
//				System.out.println(nextAnimal2);

			}

		}

	}

	// ******************* 3. Population of the Queues *******************//
	public void populateQueue() {

		// -------- POPULATE THE QUEUE FOR THE VETERINARIAS FOR PET ---------------//
		// Populate the Queue for each veterinarian for pet with only pets
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

			// in order to pass to the next, the counter have to increase
			i++;
			j++;
			// When we finish to add one animal to each queue of each instance from
			// smallAnimalsVetList, we have to start again the small Animals Vets list
			if (j >= smallAnimalsVetsList.size()) {
				j = 0;
			}
			// check the queue for one of the Veterinarias to see that it's populated
//			System.out.println("This Veterinarian: " + smallAnimalsVetsList.get(j).getMyQueue());
		}

		// REPEAT THE SAME FOR EACH TYPE OF MEDICAL STAFF

		// --- POPULATE THE QUEUE FOR THE VETERINARIAS FOR LIVESTOCK ANIMALS ------//
		// Populate the Queue for each veterinarian for livestock animals with only
		// livestock animals

		// Repeat the same that before where I populated the Veterinarias for pets
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

		// -------------- POPULATE THE QUEUE FOR LABORATORIANS -----------------//
		// Populate the Queue for each laboratorian with all the animals in the clinic

		// the only difference in here that before, it is in here, I am getting the
		// animal randomly from animallist
		Random r = new Random();
		int m = 0;
		int n = 0;

		// This while is going to run until m will be bigger than 500, so I populate the
		// Queues with 50 animals for each laboratorian
		while (m < 500) {

			Animals q = animalList.get(r.nextInt(animalList.size()));

			laboratoriansList.get(n).Queue(q);
			m++;
			n++;

			if (n >= laboratoriansList.size()) {
				n = 0;
			}

		}
	}

// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//

	// Before I created a methods to assign the work to each Administrative staff
	// this method are contain in the interfaces inside of Tasks package
	// I change this idea to the next one follow Ken Advice
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
// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//	

	// **************** 4. Tasks assignment to each Administrative staff
	// **************//
	public void assingwork() {

		// I chose a random Administrative staff to send to Holidays
		Random r = new Random();
		Administrative pick = administrativeStaffList.get(r.nextInt(administrativeStaffList.size()));

		// I created a loop to get each administrative staff from the
		// administrativeStafflist
		for (Administrative e : administrativeStaffList) {

			// if the administrative staff is the lucky that is going to be on holidays
			if (e == pick) {
				// with the instance get the instance inside of the Arraylist and set the task
				// sending the staff and what is going to do.

				e.setTask(e, " is on holidays!");
				// now save this instance in a holidays Array list, this is going to help to
				// print this information in VetClinic
				holidays.add(e);

				// if the instance is a instance of HR
			} else if (e instanceof HR) {
				// get the instance set the task and saved in hrtasks Array List
				e.setTask(e, " is palaning new team activities" + " and making the payroll.");
				hrTasks.add(e);
				// if the instance is a instance of IT
			} else if (e instanceof IT) {
				// get the instance set the task and saved in itTasks Array List

				e.setTask(e, " is reparing some funtion in the website" + " and adding new staff in the website.");
				itTasks.add(e);
				// if the instance is a instance of receptionist
			} else if (e instanceof Receptionist) {
				// get the instance set the task and saved in ReceptionistTasks Array List

				((Receptionist) e).setTask(e,
						" is answering the phone" + ", filling formats" + " and making apointments. ");
				receptcionistTasks.add(e);
			}

		}

	}

	// ******************************* 5. SEARCH ********************************//

	// I created different search for different reason that I am going to explain:

	// --------------------------- STAFF SEARCH --------------------------------//
	// 1. This search is to search the name and surname of the staff that the user
	// are looking
	// for
	public String staffSearch(String name, String sname) {

		// The boolean to stop the do - while loop if the staff is found
		boolean found = false;
		// two strings to take the user input and change for lower case and remove the
		// spaces
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		// A counter for the do While loop
		int i = 0;

		// first do:
		// if the name and surname input is equal to an instance in our staffList Array
		// List return that message
		do {
			// in this case because I am using .equals(), the instance must be equal to the input. 
			if (staffList.get(i).getName().toLowerCase().equals(inputname)
					&& staffList.get(i).getSurname().toLowerCase().equals(inputsname)) {
				found = true;
				return "\n          This employee woks in the clinic \n" + "\n     |     Name: "
						+ staffList.get(i).getName() + " " + staffList.get(i).getSurname() + "\n     |     ID: "
						+ staffList.get(i).getiD() + " " + staffList.get(i).getSalaryLevel();
			}
			i++;

			// Run the loop until the staff is found or until finish to check all the
			// staffList
		} while (!found && i < staffList.size());

		// if the staff it was not found return this message
		return "\n  ----------  SORRY! This employee is not working in the clinic.  ----------  ";

	}

	// 2. This search is to search the name or surname of the staff that the user
	// are looking
	// for.
	// But in this case is not specific, because we are going to look for the
	// element that contains the input not to look for the specific words.
	public void staffnameSearch(String name) {

		// this variable type Staff is going to help me to print the message if we are
		// no found anything similar to the input
		Staff employee = null;
		System.out.println(" \n          These are the staff that contain this words:  \n");

		// for loop to check all the elements inside of the staffList
		for (int i = 0; i < staffList.size(); i++) {
			// if the input is contained in the name or surname of any instance inside of
			// staffList, get the instance and print it
			// the code that allow us to look for something that contain the input is .contain(), so it does not need to be equal. 
			if (staffList.get(i).getName().toLowerCase().trim().contains(name)
					|| staffList.get(i).getSurname().toLowerCase().trim().contains(name)) {

				// get the instance that contains the input
				employee = staffList.get(i);

				// Get the information of the instance, name, surname, id and the SalaryLevel
				String name2 = employee.getName();
				String sname2 = employee.getSurname();
				int id2 = employee.getiD();
				double salary2 = employee.getSalaryLevel();

				// Print
				System.out.println("\n     |     Full name: " + name2 + " " + sname2 + "\n     |     ID: " + id2
						+ "    and  the salary is: " + salary2 + "\n     |     ");

			}
		}
		// If we do not get the instance because any elements contains the words in the
		// input, print this message
		if (employee == null) {
			System.out.println("\n   ---------  Any staff contains this name, try again  ----------  \n");
		}
	}

	// --------------------------- ANIMAL SEARCH --------------------------------//
	// 3. This search the animal by the name that the user are looking
	// for.
	public ArrayList<Animals> searchAnimal(String name) {

		// I used an Arraylist to get all the answers in an array list to print in
		// VetClinic
		ArrayList<Animals> foundanimal = new ArrayList<Animals>();
		// In this case i am not using this code in here because i change the input to
		// lower case and without spaces before I sent to this method. If would not do
		// it before i have to do it in here
		// String inputname = name.toLowerCase().trim();

		// for loop to check all the elements inside of the animalList
		for (int i = 0; i < animalList.size(); i++) {

			// if the name input is equal to an instance in our animalList Array
			// List , add this instance to the new Array List call foundanimal
			if (animalList.get(i).getName().toLowerCase().equals(name)) {
//			if ( name.equals(animalList.get(i).getName())) {
				Animals a = animalList.get(i);
				foundanimal.add(a);

			}
		}
		// in the end return the new array list with the Animal instances found
		return foundanimal;
	}

	// --------------------------- MEDICAL STAFF SEARCH
	// --------------------------------//
	// 4. This search look for an specific name and surname of medical staff that
	// the user is looking for inside of the medicalStaffList

	public int medicalStaffSearch(String name, String sname) {

		// this search is working similar to the Staff search with name and surname
		// boolean to stop the do - while when the input have been found
		boolean found = false;
		// two strings to take the user input and change for lower case and remove the
		// spaces
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		// A counter for the do While loop
		int i = 0;
		// and the int to return the value.

		int id = 0;

		// I am using this search to find the medical Staff and get the id.
		// Because what I need in the end is to get the Queue.
		// As I explained before, I used a different Array List to set the Queue so that these
		// instances in staffList do not contain the Queue, the instances that contain
		// the Queue are in
		// smallAnimalsVetsList, largeAnimalsVetsList and laboratorianList. The problem
		// is that these 3 list do not contain all the medical staff, for that reason I
		// have to find the staff first in medicalList (that contain all medical staff)
		// and return the id.
		// With this id, I would redirect the search to the correct search and look for
		// the staff in the other 3 lists, in order to get the instance that contain the
		// Queue.
		do {
			// if the name and surname input is equal to an instance in our medicalList
			// Array
			// the boolean change to true and break the loop, then it get the id from this instance,
			// save it in id type int and return it. 

			if (medicalStaffList.get(i).getName().toLowerCase().equals(inputname)
					&& medicalStaffList.get(i).getSurname().toLowerCase().equals(inputsname)) {
				found = true;
				id = medicalStaffList.get(i).getiD();

				return id;
			}
			i++;

			// the loop is going to run until the boolean turn to true that means we found
			// the medical staff or until check the hole medicalStaffList
		} while (!found && i < medicalStaffList.size());

		// In the end return the variable id
		return id;
	}

	// 4.1 SEARCH FOR VETERINARIANS OR LABORATORIANS
	// THE NEXT SEARCH ARE THE SAME, THE DIFFERENT BETWEEN THEM IS THE ARRAYLIST
	// THAT THEY USE TO DO THE SEARCH.

	// After the Medical search happened, if the id is between 111 to 125 this search
	// is going to happen.
	// This method is going to receive the same input that medicalStaffSearch
	// received and then do the search. 
	public int smallVetSearch(String name, String sname) {

		// This method could receive the id instead of the name and surname and look for
		// the id
		// The method is working the same that before, what change is the return. In this
		// case the return is an instance of SmallAnimalsVet
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

		// return the smallAnimalsVet instance
		return i;
	}

	// 4.2 SEARCH FOR VETERINARIANS FOR LIVESTOCK ANIMALS
	// After the Medical search happened if the id is between 126 to 130 this search
	// is going to happen
	// this method is going to receive the same input that medicalStaffSearch
	// received
	public int largeVetSearch(String name, String sname) {

		// This method could receive the id instead of the name and surname and look for
		// the id
		// The method is working the same that before, what change is the return. In
		// this case the return is an instance of LargAnimalsVet

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

		// return the LargeAnimalsVet instance
		return i;
	}

	// 4.3 SEARCH FOR LABORATORIANS
	// After the Medical search happened if the id is between 131 to 140 this search
	// is going to happen
	// this method is going to receive the same input that medicalStaffSearch
	// received
	public int laboratoriansSearch(String name, String sname) {

		boolean found = false;
		String inputname = name.toLowerCase().trim();
		String inputsname = sname.toLowerCase().trim();
		int i = 0;

		// This method could receive the id instead of the name and surname and look for
		// the id
		// The method is working the same that before, what change is the return. In
		// this case the return is an instance of Laboratorians

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

	// I used this method to print and count every Array List to check that everything
	// was in order and right.
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
		// System.out.println("laboratorians List" + laboratoriansList);
//		
//		int staffCount = smallAnimalsVetsList.size();
//		System.out.println(" small vets" + staffCount);
//		int staffCount1 = largeAnimalsVetsList.size();
//		System.out.println("large vets" + staffCount1);
//		int staffCount3 = laboratoriansList.size();
//		System.out.println("laboratorians" + staffCount3);
//		
//		int staffCount1 = staffList.size();
//		System.out.println(staffCount1);
//		int staffCount2 = administrativeStaffList.size();
//		System.out.println(staffCount2);
//		int staffCount3 = hrStaffList.size();
//		System.out.println(staffCount3);
//		int staffCount4 = itStaffList.size();
//		System.out.println(staffCount4);
//		int staffCount5 = receptionistStaffList.size();
//		System.out.println(staffCount5);

//		System.out.println("Animal list :" + animalList);
//		System.out.println("pet list :" +companionAnimalsList);
//		System.out.println("cat list :" +cat);
//		System.out.println("dog list :" +dog);
//		System.out.println("rabbit list :" +rabbit);
//		System.out.println("cattle list :" +cattle);
//		System.out.println("sheep list :" +sheep);

		// I use this code to count how many animals are in the main Arrays
//		int itemCount = animalList.size();
//		System.out.println(itemCount);
//		int itemCount1 = companionAnimalsList.size();
//		System.out.println(itemCount1);
//		System.out.println("companion Animals " + companionAnimalsList);
//		int itemCount2 = livestockAnimalsList.size();
//		System.out.println(itemCount2);
//		System.out.println("livestock Animals: " + livestockAnimalsList);
//		

	}

}
