package VetClinic;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Animals.Animals;
import Animals.Cat;
import Animals.Cattle;
import Animals.CompanionAnimals;
import Animals.Dog;
import Animals.LivestockAnimals;
import Animals.Rabbit;
import Animals.Sheep;
import Staff.Administrative;
import Staff.HR;
import Staff.IT;
import Staff.Laboratorians;
import Staff.LargeAnimalsVet;
import Staff.Medical;

import Staff.Receptionist;
import Staff.SmallAnimalsVet;
import Staff.Staff;

public class VetClinic {

	// This class is the printing class, in here I called all the methods from
	// Information class,
	// and instances from the subclasses of Animals and Staff

	// The Main class I am using in here is Information, is for this reason that I
	// need a instance of Information call information
	Information information;

	// Buffer is what I am using to get the user input, I am calling in here because
	// is practical,
	// allow me to call only ones and using every time I needed.
	BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

	public VetClinic() throws IOException {

		// initialized the information instance from Information class
		information = new Information();

		// Variable integer for get the number of the answer, in order to choose the
		// main options. This variable could be a string and allow to the user make more
		// mistakes like spaces after the input.
		int answer = 0;
		// boolean to break the do principle do - while for the main options
		boolean option = false;
		// String options for yes and no to print the same in each question
		String yes = "yes";
		String no = "no";
		// boolean variable to get the option yes or no for the question to keep doing
		// the same action or not.
		boolean answer1;

//========================================= MAIN DO - WHILE ===============================================//
		do {
			// display the main options
			displayOptions();
			// try and catch to catch the wrong input for the answers
			try {
				// get the input from the user; this need to be a number between 1 to 10,
				// without spaces after or before the input.
				answer = Integer.parseInt(myReader.readLine());
				option = true;

				// First is a error message if the number is less than 0
				if (answer <= 0) {
					System.out.println(
							"\n*********** ERROR!, This option is not correct, please enter a number between 1 to 10  *********** \n");
					// the main boolean is false, in order to keep in the main boolean
					option = false;

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 1 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THE FISRT OPTION IS TO PRINT THE LIST OF THE STAFF
				} else if (answer == 1) {

					// Print the line to separate the list of the line before
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
					System.out.println("\n          The list of our staff is: \n");

					// FOR loop to get a staff instance for each element inside of the staffList and
					// print it.
					for (Staff e : information.staffList) {
						System.out.println("          Name: " + e.getName() + "              Surname: " + e.getSurname()
								+ "              ID: " + e.getiD());

					}
					// Print the line to separate the list of the main options
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 2 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THE SECOND OPTION GIVE THE OPTION TO PRINT THE LIST FOR EACH TYPE OF THE
					// STAFF
					// In this option we can see how useful was create a different arrays for each
					// type of staff.
					// Because I only need to print the Array List of each type of staff, in order
					// to print the list for each type of staff.
					// The code for each option have the same principle, a FOR loop to read each
					// instance inside of the ArrayList,then to get the attributes for the instance,
					// and then print it.
				} else if (answer == 2) {
					// boolean for the do - while for the second option
					boolean choose1 = false;
					// integer variable to get the number for the sub menu
					int choose = 0;
					do {
						// display the second options
						displayOptions2();
						// try and catch to catch the wrong input for the choose variable
						try {
							// get the input and save in choose variable
							choose = Integer.parseInt(myReader.readLine());

							// -----------------------CHOOSE 1 -----------------------------//
							if (choose == 1) {
								// Print the list of the medical staff
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our medical staff is: \n");

								// FOR loop to get a Medical instance for each element inside of the
								// medicalStaffList and print it.
								for (int i = 0; i < information.medicalStaffList.size(); i++) {

									Medical medicalStaff = information.medicalStaffList.get(i);
									System.out.println("          Name: " + medicalStaff.getName()
											+ "              Surname: " + medicalStaff.getSurname()
											+ "              ID: " + medicalStaff.getiD());

								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE 2 -----------------------------//
							} else if (choose == 2) {
								// Print the list of the administrative staff
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our adminsitrative staff is: \n");

								// FOR loop to get a Administrative instance for each element inside of the
								// administrativeStaffList and print it.
								for (int i = 0; i < information.administrativeStaffList.size(); i++) {

									Administrative adStaff = information.administrativeStaffList.get(i);
									System.out
											.println("          Name: " + adStaff.getName() + "              Surname: "
													+ adStaff.getSurname() + "              ID: " + adStaff.getiD());

								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE 3 -----------------------------//
							} else if (choose == 3) {
								// Print the list of the veterinarians for pets
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our veterinarians for pets is: \n");

								// FOR loop to get a SmallAnimalsVet instance for each element inside of the
								// smallAnimalsVetsList and print it.
								for (int i = 0; i < information.smallAnimalsVetsList.size(); i++) {

									SmallAnimalsVet smVet = information.smallAnimalsVetsList.get(i);

									System.out.println("          Name: " + smVet.getName() + "              Surname: "
											+ smVet.getSurname() + "              ID: " + smVet.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE 4 -----------------------------//
							} else if (choose == 4) {
								// Print the list of the veterinarians for livestock animals
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out
										.println("\n          List of our veterinarians for livestock animals is: \n");

								// FOR loop to get a LargeAnimalsVet instance for each element inside of the
								// largeAnimalsVetsList and print it.
								for (int i = 0; i < information.largeAnimalsVetsList.size(); i++) {

									LargeAnimalsVet laVet = information.largeAnimalsVetsList.get(i);

									System.out.println("          Name: " + laVet.getName() + "              Surname: "
											+ laVet.getSurname() + "              ID: " + laVet.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE 5 -----------------------------//
							} else if (choose == 5) {
								// Print the list of the laboratorians
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our laboratorians is: \n");

								// FOR loop to get a laboratorian instance for each element inside of the
								// laboratoriansList and print it.
								for (int i = 0; i < information.laboratoriansList.size(); i++) {

									Laboratorians lab = information.laboratoriansList.get(i);

									System.out.println("          Name: " + lab.getName() + "              Surname: "
											+ lab.getSurname() + "              ID: " + lab.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE 6 -----------------------------//
							} else if (choose == 6) {
								// Print the list of the receptionist
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our receptionist staff is: \n");

								// FOR loop to get a receptiomist instance for each element inside of the
								// receptionistStaffList and print it.
								for (int i = 0; i < information.receptionistStaffList.size(); i++) {

									Receptionist rec = information.receptionistStaffList.get(i);

									System.out.println("          Name: " + rec.getName() + "              Surname: "
											+ rec.getSurname() + "              ID: " + rec.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE 7 -----------------------------//
							} else if (choose == 7) {
								// Print the list of the IT staff
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our IT staff is: \n");

								// FOR loop to get a IT instance for each element inside of the
								// itStaffList and print it.
								for (int i = 0; i < information.itStaffList.size(); i++) {

									IT it = information.itStaffList.get(i);

									System.out.println("          Name: " + it.getName() + "              Surname: "
											+ it.getSurname() + "              ID: " + it.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE 8 -----------------------------//
							} else if (choose == 8) {
								// Print the list of the HR staff
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our HR staff is: \n");
								// FOR loop to get a HR instance for each element inside of the
								// hrStaffList and print it.
								for (int i = 0; i < information.hrStaffList.size(); i++) {

									HR hr = information.hrStaffList.get(i);

									System.out.println("          Name: " + hr.getName() + "              Surname: "
											+ hr.getSurname() + "              ID: " + hr.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");

								// -----------------------CHOOSE -----------------------------//
							} else if (choose == 9) {
								// break the do -while loop and go back to the main do - while, so it go back to
								// the main options.
								break;
							} else {
								// if the number is bigger or lower of the options this else is going to print
								// the error message
								System.out.println(
										"\n*********** ERROR! This number is lower or bigger than the options, Could you write a option between 1 to 9?  ***********  \n                                      Thanks! ");
								// and the boolean will be false and the user will be in the do - while loop for
								// the option 2.
								choose1 = false;
							}
							// catch is to avoid that a error input will break the program.
							// it will print the error and go back to the display options 2 in the do -
							// while of the option 2
						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This is not a number or contain spaces, Please write a number between 1 to 9 without spaces  ***********  \n                                              Thanks! ");
							// whit this false the user will continue in the do - while of the option 2
							choose1 = false;
						}
						// the do - While is running for the options different to zero, and is going to
						// break when the boolean choose1 is true or whit the option 9 that breaks the
						// loop .
					} while (choose != 0 || !choose1);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 3 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THE THIRD OPTION GIVE THE OPTION TO PRINT THE ADMINISTRATIVE STAFF THAT IS
					// PERFORMIN A SPECIFIC TASK
					// In this method I printed each array that contain the instance with the task
					// attribute.
					// in order to do this, first I read the array that contain the instance in the
					// task attibute,
					// second for each instance I get the task attribute,
					// finally I print it.
				} else if (answer == 3) {

					// integer variable to get the number for the sub menu
					int option3 = 0;
					// boolean for the do - while for the third option
					boolean choose3 = false;
					do {
						// display the second options
						displayOptions3();

						// try and catch to catch the wrong input for the choose3 variable

						try {
							// get the input and save in choose3 variable
							option3 = Integer.parseInt(myReader.readLine());

							// -----------------------OPTION 1 -----------------------------//
							if (option3 == 1) {
								// FOR loop to get an Administrative instance for each element inside of the
								// administrativeStaffList
								for (Administrative e : information.administrativeStaffList) {

									// with the instance get the task (attribute of Administrative staff) and print
									// it.
									System.out.println("          Name: " + e.getTask());

								}

								// -----------------------OPTION 2 -----------------------------//
							} else if (option3 == 2) {
								// FOR loop to get an Administrative instance for each element inside of the
								// holidays ArrayList
								for (Administrative e : information.holidays) {
									// with the instance get the task (attribute of Administrative staff) and print
									// it.
									System.out.println("          Name: " + e.getTask());

								}

								// -----------------------OPTION 3 -----------------------------//
							} else if (option3 == 3) {
								// FOR loop to get an Administrative instance for each element inside of the
								// hrTasks ArrayList
								for (Administrative e : information.hrTasks) {
									// with the instance get the task (attribute of Administrative staff) and print
									// it.
									String task = e.getTask();

									System.out.println("          Name: " + task);

								}

								// -----------------------OPTION 4 -----------------------------//
							} else if (option3 == 4) {
								// FOR loop to get an Administrative instance for each element inside of the
								// itTasks ArrayList
								for (Administrative e : information.itTasks) {
									// with the instance get the task (attribute of Administrative staff) and print
									// it.
									String task = e.getTask();

									System.out.println("          Name: " + task);

								}

								// -----------------------OPTION 5 -----------------------------//
							} else if (option3 == 5) {
								// FOR loop to get an Administrative instance for each element inside of the
								// receptcionistTasks ArrayList
								for (Administrative e : information.receptcionistTasks) {
									// with the instance get the task (attribute of Administrative staff) and print
									// it.
									String task = e.getTask();
									System.out.println("          Name: " + task);

								}

								// -----------------------OPTION 6 -----------------------------//
								// break the loop and go to the main do - while with the main options
							} else if (option3 == 6) {
								break;
							} else {
								// if the number is bigger or lower of the options, this ELSE is going to print
								// the error message

								System.out.println(
										"\n*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 3  *********** \n                       Thanks! ");

							}
							// catch is to avoid that a error input will break the program.
							// it will print the error and go back to the display options 2 in the do -
							// while of the option 2

						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This options is a letter or contain spaces, please write a number between 1 to 3 without spaces *********** \n                       Thanks! ");
							// whit this false the user will continue in the do - while of the option 3
							choose3 = false;
						}
						// the do - While is running for the options different to zero, and is going to
						// break when the boolean choose3 is true or whit the option 6 breaks the loop .
					} while (option3 != 0 || !choose3);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 4 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THE FOURTH OPTION GIVE THE OPTION TO SEARCH THE STAFF BY NAME, SURNAME , AND
					// BY FULL NAME

				} else if (answer == 4) {
					// integer variable to get the number for the sub menu
					int option4 = 0;
					// boolean for the do - while for the second option
					boolean choose4 = false;
					do {
						// display the fourht options
						displayOptions4();
						// try and catch to catch the wrong input for the choose4 variable
						try {

							// get the input and save in choose4 variable
							option4 = Integer.parseInt(myReader.readLine());

							// -----------------------OPTION 1 -----------------------------//
							// IF THE OPTION IS 1 THE USER CAN SEACH BY NAME OF SURNAME
							// In here the search is not specific. This method will return every member of
							// the staff, who contains the input word in the name or surname.
							if (option4 == 1) {

								String name;
								// do -while loop to run until the user do not want to look for other staff
								// member
								do {
									// I am getting the input in other method call get User, that also validate the
									// input.
									// I am only sending the prompt to print the question, and I will get the input
									// after it has passed the validation.
									name = getUser(
											"\n   ----------  Please write the Name or Surname of the staff you are looking for: \n");

									// I am sending the input in lower case and without spaces to the search method
									// in Information class.
									information.staffnameSearch(name.toLowerCase().trim());

									// I am sending a prompt again to the get confirmation method. In that method I
									// am getting the input for yes or not and validate the input.
									// After the input is validate, I will receive a true or false in answer1
									// boolean variable.
									answer1 = getconfirmation1(
											"\n   ----------  If you want to look for other staff write: " + yes
													+ ", if not write: " + no + "\n");
									// if the answer1 is yes, The user will be continue in the loop for option 1 of
									// option 4.
									// but if the answer1 is no, I will obtain a true and the loop will break and
									// return to the loop for option 4.
								} while (!answer1);

								// -----------------------OPTION 2 -----------------------------//
								// IF THE OPTION IS 1 THE USER CAN SEACH BY SPECIFIC NAME AND SURNAME
								// In here the search is specific. This method will a unique member of the
								// staff, who contains the input name and surname.
							} else if (option4 == 2) {

								// to string variables for name and surname
								String name;
								String sname;
								// do -while loop to run until the user do not want to look for other staff
								// member
								do {
									// I am getting the input in other method call get User, that also validate the
									// input.
									// I am only sending the prompt to print the question, and I will get the input
									// until it has passed the validation.
									name = getUser(
											"\n   ----------  Please write the Name of the staff you are looking for: ");
									sname = getUser(
											"\n   ----------  Please write the Surname of the staff  you are looking for: ");

									// I am sending the input to the search method in Information class, and print
									// the return message.
									System.out.println(information.staffSearch(name, sname));

									// I am sending a prompt again to the get confirmation method. In that method I
									// am getting the input for yes or not and validate the input.
									// After the input is validate, I will receive a true or false in answer1
									// boolean variable.
									answer1 = getconfirmation1(
											"\n   ----------  If you want to look for other staff write: " + yes
													+ ", if not write: " + no);
									// if the answer1 is yes, The user will be continue in the loop for option 2 of
									// option 4.
									// but if the answer1 is no, I will obtain a true and the loop will break and
									// return to the loop for option 4.
								} while (!answer1);

								// -----------------------OPTION 3 -----------------------------//
								// break the loop for the option 4 and go back to the main loop, and main
								// options.
							} else if (option4 == 3) {
								break;
							} else {
								// if the number is bigger or lower of the options this ELSE is going to print
								// the error message

								System.out.println(
										"\n*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 3  *********** \n                       Thanks! ");

							}
							// catch is to avoid that an error input will break the program.
							// it will print the error and go back to the display options4 to the do - while
							// of the option 4
						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This options is a letter or contain spaces, please write a number between 1 to 3 without spaces *********** \n                       Thanks! ");
							// whit this false, the user will continue in the do - while of the option 4
							choose4 = false;
						}
						// the do - While is running for the options different to zero, and is going to
						// break when the boolean choose4 is true or whit the option 4 breaks the loop .
					} while (option4 != 0 || !choose4);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 5 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THIS OPTION PRINT THE LIST OF THE ANIMALS
				} else if (answer == 5) {
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
					System.out.println("\n          The list of all Animals: \n");
					// FOR loop to get a Animals instance for each element inside of the animalList,
					// the instances are from the subclasses of Animals
					// In here i print the type of the animal because is easy to see what animals
					// are.
					for (Animals e : information.animalList) {
						System.out.println(
								"          Type: " + e.getType() + "          Name: " + e.getName() + "          Age: "
										+ e.getAge() + "          Medical condition: " + e.getMedicalCondition());
					}
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 6 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THIS OPTION ALLOW ME TO PRINT THE ANIMALS BY TYPE
					// In this option we can see how useful was create a different arrays for each
					// type of animals.
					// Because I only need to print the Array List of each type of animal, in order
					// to print the list for each type of animal.
					// The code for each option have the same principle, a FOR loop to read each
					// instance inside of the ArrayList,then to get the attributes for the instance,
					// and then print it.

				} else if (answer == 6) {
					// boolean for the do - while for the sixth option
					boolean option6 = false;
					// integer variable to get the number for the sub menu
					int choose = 0;
					do {
						// display the sixth options
						displayOptions6();
						// try and catch to catch the wrong input for the choose6 variable

						try {
							// With buffer Reader I get the input and save in choose variable
							choose = Integer.parseInt(myReader.readLine());

							// -----------------------CHOOSE 1 -----------------------------//
							// PRINT THE LIST OF COMPANION ANIMALS
							if (choose == 1) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out
										.println("\n          List of Companion animals registered in the clinic : \n");

								// FOR loop to get a CompanionAnimals instance for each element inside of the
								// companionAnimalsList and print it.
								for (CompanionAnimals compaion : information.companionAnimalsList) {

									System.out.println("          Type: " + compaion.getType() + "          Name: "
											+ compaion.getName() + "          Age: " + compaion.getAge()
											+ "          Medical condition: " + compaion.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");

								// -----------------------CHOOSE 2 -----------------------------//
								// PRINT THE LIST OF LIVESTOCK ANIMALS
							} else if (choose == 2) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out
										.println("\n          List of Livestock animals registered in the clinic: \n");
								// FOR loop to get a LivestockAnimals instance for each element inside of the
								// livestockAnimalsList and print it.
								for (LivestockAnimals Li : information.livestockAnimalsList) {

									System.out.println("          Type: " + Li.getType() + "          Name: "
											+ Li.getName() + "          Age: " + Li.getAge()
											+ "          Medical condition: " + Li.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								// -----------------------CHOOSE 3 -----------------------------//
								// PRINT THE LIST OF CATS
							} else if (choose == 3) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of cats registered in the clinic: \n");

								// FOR loop to get a Cat instance for each element inside of the cat ArrayList
								// and print it.
								for (Cat cat : information.cat) {

									System.out.println(
											"          Name: " + cat.getName() + "          Age: " + cat.getAge()
													+ "          Medical condition: " + cat.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");

								// -----------------------CHOOSE 4 -----------------------------//
								// PRINT THE LIST OF DOGS
							} else if (choose == 4) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of dogs registered in the clinic: \n");
								// FOR loop to get a Dog instance for each element inside of the dog Arraylist
								// and print it.
								for (Dog dog : information.dog) {

									System.out.println(
											"          Name: " + dog.getName() + "          Age: " + dog.getAge()
													+ "          Medical condition: " + dog.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");

								// -----------------------CHOOSE 5 -----------------------------//
								// PRINT THE LIST OF RABBITS
							} else if (choose == 5) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of rabbits registered in the clinic: \n");
								// FOR loop to get a Rabbit instance for each element inside of the rabbit
								// Arraylist and print it.
								for (Rabbit rab : information.rabbit) {

									System.out.println(
											"          Name: " + rab.getName() + "          Age: " + rab.getAge()
													+ "          Medical condition: " + rab.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");

								// -----------------------CHOOSE 6 -----------------------------//
								// PRINT THE LIST OF CATTLES
							} else if (choose == 6) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of cattles registered in the clinic: \n");
								// FOR loop to get a Cattle instance for each element inside of the cattle
								// Arraylist and print it.
								for (Cattle cattle : information.cattle) {

									System.out.println(
											"          Name: " + cattle.getName() + "          Age: " + cattle.getAge()
													+ "          Medical condition: " + cattle.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");

								// -----------------------CHOOSE 7 -----------------------------//
								// PRINT THE LIST OF SHEEPS
							} else if (choose == 7) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of sheeps registered in the clinic: \n");
								// FOR loop to get a Sheep instance for each element inside of the sheep
								// Arraylist and print it.
								for (Sheep sh : information.sheep) {

									System.out.println("          Name: " + sh.getName() + "          Age: "
											+ sh.getAge() + "          Medical condition: " + sh.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								// -----------------------CHOOSE 8 -----------------------------//
								// break the do -while loop and go back to the main do - while. this option go
								// back to the main options.

							} else if (choose == 8) {
								break;
							} else {
								// if the number is bigger or lower of the options this else is going to print
								// the error message
								System.out.println(
										"\n*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 8  *********** \n                       Thanks! ");

							}
							// catch is to avoid that a error input will break the program.
							// it will print the error and go back to the display options 6.
						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This options is a letter or contain spaces, please write a number between 1 to 8 without spaces *********** \n                       Thanks! ");
							// whit this false the user will continue in the do - while of the option 6
							option6 = false;
						}
						// the do - While is running for the options different to zero, and is going to
						// break when the boolean option6 is true or whit the option 8 breaks the loop .
					} while (choose != 0 || !option6);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 7 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THIS OPTION SEVETH ALLOW ME TO LOOK FOR AN ANIMAL WITH A SPECIFIC NAME
				} else if (answer == 7) {

					String name;

					do {
						// I am getting the input in other method call get User, that also validate the
						// input.
						// First, I am sending a prompt to getUser method, in order to ask to the user.
						// I will get the input until it has passed the validation.
						name = getUser("  ----------  Please write the Name of the animal you are looking for: ");

						// I am sending the input to the search method in Information class, as a result
						// I will get an ArrayList with all the Animals that contains the input name.
						ArrayList<Animals> foundanimal = information.searchAnimal(name.toLowerCase().trim());

						// if the array I will receive is empty, this print a message to inform that
						// this animal do not exist.
						if (foundanimal.size() <= 0) {
							System.out.println("\n---------- SORRY! This animal is not registered in the clinic");
							// if the arrayList is not empty, with a for loop I will obtain each instance
							// inside of the ArrayList.
							// Then I will print it with all the attributes of the Animals
						} else {
							System.out.println("\n          The answer from our system is: \n");
							for (Animals a : foundanimal) {

								System.out.println("     |     Name: " + a.getName() + "          Age: " + a.getAge()
										+ "          Type: " + a.getType() + "          Medical condition: "
										+ a.getMedicalCondition());
							}
						}

						// I am sending a prompt to the get confirmation method. In that method I am
						// getting the input for yes or not and validate the input.
						// After the input is validate, I will receive a true or false in answer1
						// boolean variable.
						answer1 = getconfirmation1("\n  ----------  If you want to look for other animal write: " + yes
								+ ", if not write: " + no);

						// if the answer1 is yes, The user will be continue in the loop for option 7.
						// but if the answer1 is no, I will obtain a true and the loop will break and
						// return to the main options.
					} while (!answer1);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 8 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
					// THE EIGHTH OPTION GIVE THE OPTION TO PRINT THE QUEUE FOR EACH MEDICAL STAFF,
					// ALSO TO SEARCH FOR A MEDICAL STAFF AND GET THE QUEUEU

				} else if (answer == 8) {
					// integer variable to get the number for the sub menu
					int choose = 0;
					// boolean for the do - while for the eighth option
					boolean option7 = false;

					do {
						// display the eight options
						displayOptions8();

						// try and catch to catch the wrong input for the choose variable
						try {
							// With BufferedReader I get the input and save in choose variable
							choose = Integer.parseInt(myReader.readLine());

							// -----------------------CHOOSE 1 -----------------------------//
							if (choose == 1) {
								// call the method smallVetsHoleQueue that print the hole Queue for each
								// veterinarians for pets
								smallVetsHoleQueue();
								option7 = false;

								// -----------------------CHOOSE 2 -----------------------------//
							} else if (choose == 2) {
								// call the method largeVetsHoleQueue that print the hole Queue for each
								// veterinarians for livestock animals
								largeVetsHoleQueue();
								option7 = false;

								// -----------------------CHOOSE 3 -----------------------------//
							} else if (choose == 3) {
								// call the method laboratoriansHoleQueue that print the hole Queue for each
								// laboratorian
								laboratoriansHoleQueue();
								option7 = false;

								// -----------------------CHOOSE 4 -----------------------------//
							} else if (choose == 4) {

								String name;
								String sname;

								do {

									// I am getting the input in other method call get User, that also validate the
									// input.
									// I am only sending the prompt to print the question, and I will get the input
									// until it has passed the validation.
									name = getUser(
											"\n  ----------  Please write the NAME of the staff  you are looking for: ");
									sname = getUser(
											"\n  ----------  Please write the SURNAME of the staff  you are looking for: ");

									// I am sending the input to the search method in Information class, and get the
									// id of the medical staff
									int id = information.medicalStaffSearch(name, sname);

									// whit this id, I will be able to go and search for the medical staff in the
									// other arrayList, when I have the instances with the queues.
									if (id == 0) {
										// if the id is zero the name and the user does not exist in medical staff
										// In here I could look the input in the staff list and identified it is medical
										// or administrative staff.
										// and later search for the queues.
										System.out.println(
												"\n----------  SORRY! Look for the staff again, because this employee does not work in here.");

										// if the id is between this numbers means that is a veterinarian for pets, so
										// the search must be in smallAnimalsVetsList
									} else if (id >= 111 && id <= 125) {
										// I am sending the input to the search method in Information class, and I will
										// get the position in the Array list
										// With this position, i can get the information for this medical staff and the
										// queue. Then I just print it.
										int number = information.smallVetSearch(name, sname);

										String vetna = information.smallAnimalsVetsList.get(number).getName();
										String vetsna = information.smallAnimalsVetsList.get(number).getSurname();

										System.out.println("\n     |     The veterinarian for pets: " + vetna + " "
												+ vetsna + "\n     |" + "\n     |     Has the next animals to attent:  "
												+ "\n     |" + "\n     |     "
												+ information.smallAnimalsVetsList.get(number).getMyQueue());

										// if the id is between this numbers means that is a veterinarian for livestock
										// animals, so the search must be in largeAnimalsVetsList

									} else if (id >= 126 && id <= 130) {
										// I am sending the input to the search method in Information class, and I will
										// get the position in the Array list
										// With this position, I can get the information for this medical staff and the
										// queue. Then I just print it.
										int number = information.largeVetSearch(name, sname);

										String vetna = information.largeAnimalsVetsList.get(number).getName();
										String vetsna = information.largeAnimalsVetsList.get(number).getSurname();

										System.out.println("\n     |     The veterinarian for livestock animals: "
												+ vetna + " " + vetsna + "\n     |"
												+ "\n     |     Has the next animals to attent:  " + "\n     |" +

												"\n     |     "
												+ information.largeAnimalsVetsList.get(number).getMyQueue());
										// if the id is between this numbers means that is a laboratorian, so the search
										// must be in laboratoriansList

									} else if (id >= 131 && id <= 140) {
										// I am sending the input to the search method in Information class, and I will
										// get the position in the Array list
										// With this position, I can get the information for this medical staff and the
										// queue. Then I just print it.
										int number = information.laboratoriansSearch(name, sname);

										String vetna = information.laboratoriansList.get(number).getName();
										String vetsna = information.laboratoriansList.get(number).getSurname();

										System.out.println("\n     |     The laboratorian: " + vetna + " " + vetsna
												+ "\n     |" + "\n     |     Has the next animals to attent:  "
												+ "\n     |" +

												"\n     |     "
												+ information.laboratoriansList.get(number).getMyQueue());

									}
									// I am sending a prompt to getconfirmation method. In that method I am getting
									// the input for yes or not and validate the input.
									// After the input is validate, I will receive a true or false in answer1
									// boolean variable.
									answer1 = getconfirmation1("\n"
											+ "\n  ----------  If you want to look for other veterinarian or laboratorian write: "
											+ yes + ", if not write: " + no + "\n");
									// if the answer1 is yes, The user will be continue in the loop for option 4 of
									// option 8.
									// but if the answer1 is no, I will obtain a true and the loop will break and
									// return to the loop for option 8.
								} while (!answer1);

								// -----------------------CHOOSE 5 -----------------------------//
								// break the do -while loop and go back to the main do - while, so it go back to
								// the main options.
							} else if (choose == 5) {
								break;
								// if the number is bigger or lower of the options, this ELSE is going to print
								// the error message.
							} else {
								System.out.println(
										"*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 5 ***********\n                       Thanks! ");

							}
							// catch is to avoid that a error input will break the program.
							// it will print the error and go back to the display options 8.
						} catch (Exception e) {
							System.out.println(
									"*********** ERROR! what you just write contain a letter or space *********** \n***********       Please write a number between 1 to 5 without spaces *********** \n                       Thanks! ");
							// whit this false the user will continue in the do - while of the option 8
							option7 = false;
						}
						// the do - While is running for the options different to zero, and is going to
						// break when the boolean option7 is true or whit the option 5 that break the
						// loop .
					} while (choose != 0 || !option7);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 9 ++++++++++++++++++++++++++++++++++++++++++++++++++++//

					// THE NINTH OPTION GIVE THE OPTION TO SEARCH THE MEDICAL STAFF AND GET WHAT
					// ANIMAL THEY ARE ATTENDING AND GET THE NEXT ANIMAL TO ATTEND
				} else if (answer == 9) {

					String name;
					String sname;
					// boolean for the do - while
					boolean flag = false;
					// booleans for the answers to keep doing the action
					boolean answer2;
					boolean answer3;

//--------------// --------------FIRST LOOP --------------------------------------------- //
					// first question about what is the name and surname of the medical staff that
					// the user is looking for
					do {
						// I am getting the input in other method call get User, that also validate the
						// input.
						// I am only sending the prompt to print the question, and I will get the input
						// until it has passed the validation.
						name = getUser("\n  ----------  Please write the NAME of the staff you are looking for:  ");
						sname = getUser("\n  ----------  Please write the SURNAME of the staff you are looking for: ");

						// I am sending the input to the search method in Information class, and receive
						// the id of the staff.
						int id = information.medicalStaffSearch(name, sname);
						// Whit this id I will be able to search the medical staff in the correct list
						// in order to get the Queue
						// to check what id I am receiving
						// System.out.println(id);
//--------------// --------------PRINT THE INFORMATION--------------------------------------------- //	
						if (id == 0) {
							// if the id is zero the name and the user does not exist in medical staff
							// In here I could look the input in the staff list and identified it is medical
							// or administrative staff.
							// and later search for the queues.

							System.out.println(
									"\n----------  SORRY! Look for the staff again, because this employee does not work in here  ----------");

							// if the id is between this numbers means that is a veterinarian for pets, so
							// the search must be in smallAnimalsVetsList
						} else if (id >= 111 && id < 126) {
							// I am sending the input to the search method in Information class, and I will
							// get the position in the Array list

							int number = information.smallVetSearch(name, sname);
							// I am sending this position to smallVetsQueue,where is the print method of the
							// first animal of the Queue.
							smallVetsQueue(number);

							// In order to give two options to continue with the action, I am using the same
							// method getconfirmation but with two different booleans
							// and other boolean to break the do - while.
							do {
								// I am sending a prompt to getconfirmation method. In that method I am getting
								// the input for yes or not and validate the input.
								// After the input is validate, I will receive a true or false in answer1
								// boolean variable.
								answer1 = getconfirmation1(
										"\n  ----------  Did you finish to attent this animaland would you like to attent the next one?, please write: "
												+ yes + "\n or " + no
												+ " if you haven't finished to attent this animal and you would like to go back.");
								// if the answer is yes, I will obtain false, and I will sent the position of
								// the array to nextsmallAnimalQueue method, where I will print the next animal
								// to attend.
								if (answer1 == false) {

									nextsmallAnimalQueue(number);
									flag = false;
									// if the answer is no, I will print the same animal that is been attended by
									// the medical staff.
									// I will send the position of the array to the first method to get the animal
									// that is attending by the medical staff.
								} else if (answer1 == true) {

									smallVetsQueue(number);
									// I am sending a prompt to getconfirmation method. In that method I am getting
									// the input for yes or not and validate the input.
									// After the input is validate, I will receive a true or false in answer1
									// boolean variable.
									answer2 = getconfirmation1(
											"\n  ----------  Would you like to continue with the same veterinarian?, please write: "
													+ yes + " or " + no);

									if (answer2 == false) {
										// whit this false the user will continue in the do - while of the same medical
										// staff
										flag = false;
									} else if (answer2 == true) {
										// whit this true the user will go back to the do - while of the option 9
										flag = true;
//										break;
									}
								}
								// this do - while is running until flag is true.
							} while (!flag);

//---------------------------------------------------------------------------------------------------------------------------------//								
							// The code is going to be the same for each else if option to the veterinarians
							// for livestock animasl and for laboratorians.
							// The different between them is the methods to print the information and the
							// list to use.

							// if the id is between this numbers means that is a veterinarian for livestock
							// animals, so the search must be in largeAnimalsVetsList
						} else if (id >= 126 && id <= 130) {
							// I am sending the input to the search method in Information class, and I will
							// get the position in the Array list

							int number = information.largeVetSearch(name, sname);
							// I am sending this position to largeVetsQueue,where is the print method of the
							// first animal of the Queue.
							largeVetsQueue(number);
							// In order to give two options to continue with the action, I am using the same
							// method getconfirmation but with two different booleans
							// and other boolean to break the do - while.
							do {

								answer1 = getconfirmation1(
										"\n  ----------  Did you finish to attent this animal and would you like to attent the next one?, please write: "
												+ yes + "\n or " + no
												+ " if you haven't finished to attent this animal and you would like to go back.");
								// if the answer is yes, I will obtain false, and I will sent the position of
								// the array to nextlargeAnimalQueue method, where I will print the next animal
								// to attend.
								if (answer1 == false) {

									nextlargeAnimalQueue(number);

									flag = false;
									// if the answer is no, I will print the same animal that is been attended by
									// the medical staff.
									// I will send the position of the array to the first method to get the animal
									// that is attending by the medical staff.
								} else if (answer1 == true) {

									largeVetsQueue(number);

									// I am sending a prompt to getconfirmation method. In that method I am getting
									// the input for yes or not and validate the input.
									// After the input is validate, I will receive a true or false in answer1
									// boolean variable.

									answer2 = getconfirmation1(
											"\n  ----------  Would you like to continue with the same veterinarian?, please write: "
													+ yes + " or " + no);

									if (answer2 == false) {
										flag = false;
										// whit this false the user will continue in the do - while of the same medical
										// staff
									} else if (answer2 == true) {
										// whit this true the user will go back to the do - while of the option 9
										flag = true;
									}
								}
								// this do - while is running until flag is true.
							} while (!flag);
//--------------------------------------------------------------------------------------------------------------------//
						} else if (id >= 131 && id <= 140) {
							// I am sending the input to the search method in Information class, and I will
							// get the position in the Array list

							int number = information.laboratoriansSearch(name, sname);
							// I am sending this position to laboratoriansQueue,where is the print method of
							// the first animal of the Queue.
							laboratoriansQueue(number);
							// In order to give two options to continue with the action, I am using the same
							// method getconfirmation but with two different booleans
							// and other boolean to break the do - while.
							do {

								answer1 = getconfirmation1(
										"\n  ----------  Did you finish to attent this animal and would you like to attent the next one?, please write: "
												+ yes + "\n or " + no
												+ " if you haven't finished to attent this animal and you would like to go back.");
								// if the answer is yes, I will obtain false, and I will sent the position of
								// the array to nextlaboratoriansQueue method, where I will print the next
								// animal to attend.
								if (answer1 == false) {

									nextlaboratoriansQueue(number);

									flag = false;
									// if the answer is no, I will print the same animal that is been attended by
									// the medical staff.
									// I will send the position of the array to the first method to get the animal
									// that is attending by the medical staff.
								} else if (answer1 == true) {

									laboratoriansQueue(number);

									// I am sending a prompt to getconfirmation method. In that method I am getting
									// the input for yes or not and validate the input.
									// After the input is validate, I will receive a true or false in answer1
									// boolean variable.

									answer2 = getconfirmation1(
											"\n  ----------  Would like to continue with the same laboratorian?, please write "
													+ yes + " or " + no);

									if (answer2 == false) {
										flag = false;
										// whit this false the user will continue in the do - while of the same medical
										// staff
									} else if (answer2 == true) {
										flag = true;
										// whit this true the user will go back to the do - while of the option 9
//										break;
									}
//									break;
								}
								// this do - while is running until flag is true.
							} while (!flag);

						}

//--------------//-----------------FINISH TO PRINT --------------------------------------------------//

						// I am sending a prompt to getconfirmation method. In that method I am getting
						// the input for yes or not and validate the input.
						// After the input is validate, I will receive a true or false in answer1
						// boolean variable.

						answer3 = getconfirmation1(
								"\n  ----------  Would you like to look for other Medial Staff?, please write " + yes
										+ " if not write " + no);
						// if the answer is yes, the return is false, so The user is going to continue
						// in option 9
						// but if the answer is no, the return is true and it will break the do - while
						// and return to the main options.
						// this do - while is running until answer is true.
					} while (!answer3);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 10 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 10) {
					// the option 10 is a break to stop the main do while and thanks for visit us.
					System.out.println(
							"\n  ----------------  THANK YOU FOR VISIT US, HAVE A GOOD DAY   ----------------  ");
					break;
				}

// +++++++++++++++++++++++++++++++++++++ FINISH OPTION  ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				else {
					// if the number is bigger or lower of the options this ELSE is going to print
					// the error message
					System.out.println(
							"***********  ERROR! Unespected system error! please enter a valid option between 1 to 10 without spaces ***********");
					// And continue in the main loop.
				}
//*************************************** FINISH TRY - CATCH ************************************************//
				// catch is to avoid that a error input will break the program.
				// it will print the error and go back to display the main options
			} catch (Exception e) {
				System.out.println(
						"***********  ERROR! Unespected system error! please enter a valid option between 1 to 10 without spaces ***********");
				option = false;

//********************************* FINISH DO - WHILE THE OPTIONS *******************************************//	
			}
			// the do - While is running for the answer different to zero, and is going to
			// break, when the boolean option is true, or whit the option 10 that break the
			// loop. .
		} while (answer != 0 || !option);
	}

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  FINISH METHOS OF OPTIONS %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

// $$$$$$$$$$$$$$$$$$$$$$$$$ START METHOS TO USE INSIDE OF OPTIONS METHOS $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//

// +++++++++++++++++++++++++++++++++++++ DISPLAY METHOD  ++++++++++++++++++++++++++++++++++++++++++++++++++++//

	// I have all the display options in here. Each method only contain a lines of
	// system.out.println of each display menu and sub menus.
	// The last option of each sub menu is a go back to the main method.

	public void displayOptions() {

		System.out.println("\n          What it is the option you want to use:\n");
		System.out.println("          1.  List of all the staff");
		System.out.println("          2.  List the staff by category ");
		System.out.println("          3.  List of the Administrative Staff who are performing a specific task");
		System.out.println("          4.  Seach for a specific member of staff by name");
		System.out.println("          5.  List all animals");
		System.out.println("          6.  List the animals by type");
		System.out.println("          7.  Search for a specific animal by name");
		System.out.println("          8.  List all the animals assigned to a member of medical staff");
		System.out.println(
				"          9.  Search for a specific medical staff and see:\n              what is the animal they are attending and get the next animal to attent");
		System.out.println("          10. Finish to search\n");

	}

	public void displayOptions2() {

		System.out.println("\n          Choose what list you want to see:\n ");
		System.out.println("          1.  List of Medical staff ");
		System.out.println("          2.  List of Administrative staff ");
		System.out.println("          3.  List of Veterinarias of pets");
		System.out.println("          4.  List of Veterinarias for livestock animals");
		System.out.println("          5.  List of Laboratorians ");
		System.out.println("          6.  List of Receptionist staff");
		System.out.println("          7.  List of IT staff");
		System.out.println("          8.  List of HR staff ");
		System.out.println("          9.  Go back to the first options\n");

	}

	public void displayOptions3() {

		System.out.println("\n          Choose how you would like to check who are performing the taks:\n");
		System.out.println("          1.  List of administrative staff with the tasks they are performing");
		System.out.println("          2.  Who are in holidays");
		System.out.println("          3.  Who is palaning new team activities");
		System.out.println("          4.  Who is working in the Website");
		System.out.println("          5.  Who is doing desk tasks ");
		System.out.println("          6.  Go back to the main options \n");

	}

	public void displayOptions4() {
		System.out.println("\n          Choose how you would like to search the staff:\n");
		System.out.println("          1.  Look for similar Name or Surname");
		System.out.println("          2.  Look for specific Full Name ");
		System.out.println("          3.  Go back to the main options \n");

	}

	public void displayOptions6() {

		System.out.println("\n          Choose what list of type of animals you want to see:\n ");
		System.out.println("          1.  List of Companion animals ");
		System.out.println("          2.  List of Livestock animals ");
		System.out.println("          3.  List of Cats");
		System.out.println("          4.  List of Dogs");
		System.out.println("          5.  List of Rabbits  ");
		System.out.println("          6.  List of Cattles");
		System.out.println("          7.  List of Sheeps");
		System.out.println("          8.  Go back to the first options\n");

	}

	public void displayOptions8() {

		System.out.println("\n          Choose what queue  you would like to see:\n ");
		System.out.println("          1.  Queues of each Veterinarian for pets");
		System.out.println("          2.  Queues of each Veterinarian for livestosck animals. ");
		System.out.println("          3.  Queues of each Laboratorians");
		System.out.println("          4.  Look for a especific Medical Staff and see their queue");
		System.out.println("          5.  Go back to the first options\n");

	}

// +++++++++++++++++++++++++++++++++++++ VALIDATIONS METHODS  ++++++++++++++++++++++++++++++++++++++++++++++++++++//

	// These method are helping to validate the inputs receiving for the user.

	// This method validate a string and I used to use to validate each string that
	// I got from the user, but I change this method for getUser.
//	public static boolean validate(String input) {
//
//		if (input.length() < 3 || input.length() > 12) {
//			return false;
//		} else {
//
//			if (input.matches("[0-9]+")) {
//				return false;
//			} else if (!input.matches("[a-z A-Z]+")) {
//				return false;
//
//			} else {
//				return true;
//			}
//		}
//	}

// I choose this validation because it was easier to use with different variables and sending different messages. Also reduce the code in the options.
//	 Validation of my user input: this method is creating to validate and control the user input, in order to get the correct information. 
	public static String getUser(String prompt) {

		// I am using the Buffer reader to get the input from the user
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		// variable boolean for break the do -while loop
		boolean valid = false;
		// variable to get the user input as a String variable
		String input = "";

		// do -while: in order to validate the input, if this not fulfill the conditions
		// the do while keep going until the input is valid.
		do {
			// print the String I am getting from the options.
			System.out.println(prompt);

			// try -catch: in order to get the error in the input that I am not aware of.
			try {
				// I am getting the input with bufferreader and save ib a variable input.
				input = myReader.readLine();

				// Because the names and surnames that I have in the file contain between 3 and
				// 12 letters, I thought it could be the main validation.
				if ((input.length() < 3) || (input.length() > 12)) {
					// if The input do not fulfill this condition, the boolean is going to be false
					// and run the loop again to get a new input.
					// And It will print the error message.
					valid = false;
					System.out.println(
							"\n*********** ERROR!, You must enter a name between 3 and 12 letters  ***********\n ");

				} else {

					// If the user input contain numbers, it will print a message error and run the
					// loop again to get a new input..
					if (input.matches("[0-9]+")) {
						valid = false;
						System.out.println(
								"\n*********** ERROR!, This has a number, you must enter a name between 3 and 12 letters  ***********\n ");

						// if the input is not only letters, it will print a message error and run the
						// loop again to get a new input..
					} else if (!input.matches("[a-z A-Z]+")) {
						valid = false;
						System.out.println(
								"\n*********** ERROR!, This is not only letters, you must enter a name between 3 and 12 letters  *********** \n");

						// if the input fulfill al the condition, it will print true and break the loop.
					} else {
						valid = true;
					}
				}
			} catch (Exception e) {
				valid = false; // happen after try.
				System.out.println("\n*********** ERROR! You did not eneter a valid name!  *********** \n");
			}
			// the do - while is running until the boolean valid is true. when the input
			// fulfill all the conditions.
		} while (!valid);
		// return the input.
		return input;
	}

// Method to validate my option yes or no, I created a method because I am going to use this method in many occasions. 
	// And this help me to have less code, and make easier to handle the do - while
	// loops.
	public static boolean getconfirmation1(String prompt) {

		// buffer reader to get the input of the user
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

		// two booleans variables in order to use two different do -while
		// first boolean is the boolean that we will return
		boolean flag = false;
		// second boolean is working only in this method, and help to validate the input
		boolean valid = false;
		// variable for the input
		String input = "";

		// first lest go! to get a valid input to be a yes or no
		do {
			System.out.println(prompt);
			// try - catch is to catch unforeseen errors
			try {
				input = myReader.readLine();

				// if the input is equal to yes or no is going to return a true or false in the
				// flag variable
				if (input.toLowerCase().trim().equals("yes") || input.toLowerCase().trim().equals("no")) {

					if (input.toLowerCase().trim().equals("yes")) {

						// false for yes to run the option again
						flag = false;
					} else if (input.toLowerCase().trim().equals("no")) {

						// true for stop the do _while in the option
						flag = true;

					}
					// in the case the input is correct, it is going to get out of this do _while
					valid = true;
					// if the input is not correct is going to return a error message and ask again
					// for the correct input
					// if the input is a number, a different word, or a space, it will return this
					// error message
				} else {
					valid = false;
					System.out.println("\n***********  ERROR! You must enter yes or no  ***********\n");
				}
				// happen after try.
			} catch (Exception e) {
				valid = false;
				System.out.println(
						"\n***********  ERROR! Unspectected error, you did not enter a valid option!  ***********\n");
			}
			// the do while is running until the variable valid is no false, in other words
			// when the input is valid
		} while (!valid);
		// the return is going to be false, if the answer is yes and true if the answer
		// is no
		return flag;
	}

	// I used this method before to validate the yes and no, but I changed.
	// Because I saw that the other method it would help me to reduce the code in
	// the constructor, and help me to avoid some conflicts with the do -while
	// loops.
//	public static String getconfirmation(String prompt) {
//
//		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
//		boolean valid = false;
//		String input = "";
//
//		do {
//			System.out.println(prompt);
//			try {
//				input = myReader.readLine();
//				if (input.toLowerCase().equals("yes") || input.toLowerCase().equals("no")) {
//					valid = true;
//
//				} else {
//					valid = false;
//					System.out.println("\n***********  ERROR! you must enter yes or no  ***********\n");
//				}
//			} catch (Exception e) {
//				valid = false; // happen after try.
//				System.out.println("\n***********  ERROR! you did not enter a valid option!  ***********\n");
//			}
//		} while (!valid);
//		return input;
//	}

// ++++++++++++++++++++++++++++++++ METHODS TO HELP  QUEUE METHOS  ++++++++++++++++++++++++++++++++++++++++++//

	// In here you can find every method I use to print the Queues
	// there are a tree methods for each type of medical staff:
	// 1. Print the hole QUEUE of the medical staff
	// 2. Print only the first animal of the QUEUE for the specific medical staff.
	// 3. Print the nest animal in the QUEUE for a specific medical staff.

	// ----------------- QUEUES OF THE VETERINARIAS FOR PETS ------------------//

	// Print the hole QUEUE
	public void smallVetsHoleQueue() {
		System.out.println("\n          The queue in the clinic for each Small Veterinarian: ");

		// FOR loop to read each instance inside of the ArrayList
		for (int i = 0; i < information.smallAnimalsVetsList.size(); i++) {
			// to get the name and surname for each instance of the Array List
			String smname = information.smallAnimalsVetsList.get(i).getName();
			String smsname = information.smallAnimalsVetsList.get(i).getSurname();

			// Print it
			System.out
					.println("\n     |      " + smname + " " + smsname + "\n     |     has to attent the next animals: "
							+ information.smallAnimalsVetsList.get(i).getMyQueue());
		}

	}

	// Print the first animal of the Queue for a specific medical staff
	// This method received the number of the position in the ArrayList
	public void smallVetsQueue(int number) {

		// with this number, it will obtain the information of the instance and the
		// information of the first animal of the queue.
		String vetna = information.smallAnimalsVetsList.get(number).getName();
		String vetsna = information.smallAnimalsVetsList.get(number).getSurname();
		String na = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		// Print it
		System.out.println("\n     |        The Veterinarian for pets :\n     |" + "\n     |        " + vetna + " "
				+ vetsna + "\n     |" + "\n     |        At the moment is attending a:\n     |"
				+ "\n     |        Type: " + type + "\n     |" + "\n     |        With next information:" + "\n     |"
				+ "\n     |        * Name: " + na + "\n     |        * Age: " + age
				+ "\n     |        * Medical condition: " + med);

	}

	// Print the next animal of the Queue for a specific medical staff
	// In order to get the specific medical staff, this method received the position
	// of the Array List of this particular medical staff.
	public void nextsmallAnimalQueue(int number) {

		// in here, whit the position we get the instance and the queue, then we call
		// the remove method from QUEUE class.
		// this line is going to remove the first animal in the queue of this particular
		// medical staff.
		// then the first animal is going to change for the next animal, and the next is
		// going to change for the next next.
		information.smallAnimalsVetsList.get(number).getMyQueue().remove();

		// After we have removed the fist animal in the queue, we only need to print
		// again the first animal in the QUEUE, adn we will obtain the next one. .

		String na1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		// Print it
		System.out.println("\n      |       The next animal to attent is a:\n      | " + "\n      |        * Type: "
				+ type1 + "\n      |" + "\n      |        With next information:\n      |  ");
		System.out.println("      |        * Name: " + na1 + "\n      |        * Age: " + age1
				+ "\n      |        * Medical condition: " + med1);

	}

	// ----------------- QUEUES OF THE VETERINARIAS FOR LIVESTOCK ANIMALS
	// ------------------//
	// THE CODE IS THE SAME TO THE QUEUES FOR VETERINARIANS FOR PETS, THE ONLY
	// CHANGE IS THE ARRAY LIST.

	public void largeVetsHoleQueue() {

		System.out.println("\n          The queue in the clinic for each livestock Veterinarian: ");

		// FOR loop to read each instance inside of the ArrayList
		for (int i = 0; i < information.largeAnimalsVetsList.size(); i++) {

			// to get the name and surname for each instance of the Array List
			String laname = information.largeAnimalsVetsList.get(i).getName();
			String lasname = information.largeAnimalsVetsList.get(i).getSurname();

			// Print it
			System.out
					.println("\n     |      " + laname + " " + lasname + "\n     |     has to attent the next animals: "
							+ information.largeAnimalsVetsList.get(i).getMyQueue());
		}

	}

	// Print the first animal of the Queue for a specific medical staff
	// This method received the number of the position in the ArrayList
	public void largeVetsQueue(int number) {

		// with this number, it will obtain the information of the instance and the
		// information of the first animal of the queue.
		String vetna = information.largeAnimalsVetsList.get(number).getName();
		String vetsna = information.largeAnimalsVetsList.get(number).getSurname();
		String na = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		// Print it
		System.out.println("\n     |        The Veterinarian for livestock animals:\n     |" + "\n     |        "
				+ vetna + " " + vetsna + "\n     |" + "\n     |        At the moment is attending a:\n     |"
				+ "\n     |        Type: " + type + "\n     |" + "\n     |        With next information:" + "\n     |"
				+ "\n     |        * Name: " + na + "\n     |        * Age: " + age
				+ "\n     |        * Medical condition: " + med);

	}

	// Print the next animal of the Queue for a specific medical staff
	// In order to get the specific medical staff, this method received the position
	// of the Array List of this particular medical staff.
	public void nextlargeAnimalQueue(int number) {

		// in here, whit the position we get the instance and the queue, then we call
		// the remove method from QUEUE class.
		// this line is going to remove the first animal in the queue of this particular
		// medical staff.
		// then the first animal is going to change for the next animal, and the next is
		// going to change for the next next.
		information.largeAnimalsVetsList.get(number).getMyQueue().remove();

		// After we have removed the fist animal in the queue, we only need to print
		// again the first animal in the QUEUE, adn we will obtain the next one.
		String na1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		// Print it
		System.out.println("\n      |       The next animal to attent is a:\n      | " + "\n      |        * Type: "
				+ type1 + "\n      |" + "\n      |        With next information:\n      |  ");
		System.out.println("      |        * Name: " + na1 + "\n      |        * Age: " + age1
				+ "\n      |        * Medical condition: " + med1);

	}

	// --------------------- QUEUES OF THE LABORATORIANS ------------------------//
	// THE CODE IS THE SAME TO THE QUEUES FOR VETERINARIANS FOR PETS, THE ONLY
	// CHANGE IS THE ARRAY LIST.

	public void laboratoriansHoleQueue() {

		System.out.println("\n          The queue in the clinic for each Laboratorian: ");

		// FOR loop to read each instance inside of the ArrayList
		for (int i = 0; i < information.laboratoriansList.size(); i++) {

			// to get the name and surname for each instance of the Array List
			String labname = information.laboratoriansList.get(i).getName();
			String labsname = information.laboratoriansList.get(i).getSurname();

			// Print it
			System.out.println(
					"\n     |      " + labname + " " + labsname + "\n     |     has to attent the next animals: "
							+ information.laboratoriansList.get(i).getMyQueue());

		}

	}

	// Print the first animal of the Queue for a specific medical staff
	// This method received the number of the position in the ArrayList

	public void laboratoriansQueue(int number) {

		// with this number, it will obtain the information of the instance and the
		// information of the first animal of the queue.
		String vetna = information.laboratoriansList.get(number).getName();
		String vetsna = information.laboratoriansList.get(number).getSurname();
		String na = information.laboratoriansList.get(number).getMyQueue().getFirst().getName();
		double age = information.laboratoriansList.get(number).getMyQueue().getFirst().getAge();
		String med = information.laboratoriansList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type = information.laboratoriansList.get(number).getMyQueue().getFirst().getType();

		// Print it
		System.out.println("\n     |        The Laboratorian :\n     |" + "\n     |        " + vetna + " " + vetsna
				+ "\n     |" + "\n     |        At the moment is attending a:\n     |" + "\n     |        Type: " + type
				+ "\n     |" + "\n     |        With next information:" + "\n     |" + "\n     |        * Name: " + na
				+ "\n     |        * Age: " + age + "\n     |        * Medical condition: " + med);

	}

	// Print the next animal of the Queue for a specific medical staff
	// In order to get the specific medical staff, this method received the position
	// of the Array List of this particular medical staff.
	public void nextlaboratoriansQueue(int number) {

		// in here, whit the position we get the instance and the queue, then we call
		// the remove method from QUEUE class.
		// this line is going to remove the first animal in the queue of this particular
		// medical staff.
		// then the first animal is going to change for the next animal, and the next is
		// going to change for the next next.
		information.laboratoriansList.get(number).getMyQueue().remove();

		// After we have removed the fist animal in the queue, we only need to print
		// again the first animal in the QUEUE, adn we will obtain the next one.
		String na1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getName();
		double age1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getAge();
		String med1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getType();

		// Print it
		System.out.println("\n      |       The next animal to attent is a:\n      | " + "\n      |        * Type: "
				+ type1 + "\n      |" + "\n      |        With next information:\n      |  ");
		System.out.println("      |        * Name: " + na1 + "\n      |        * Age: " + age1
				+ "\n      |        * Medical condition: " + med1);

	}

}
