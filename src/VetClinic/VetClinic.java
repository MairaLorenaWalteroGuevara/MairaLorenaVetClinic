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

	// Buffer is what I am using to get the user input, I am calling in here because is practical, 
	// allow me to call only ones and using every time I needed. 
	BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));


	public VetClinic() throws IOException {

		options();

	}

	public void options() throws IOException {

		information = new Information();

		int answer = 0;
		boolean option = false;
		String yes = "yes";
		String no = "no";
		boolean answer1;
		do {
			displayOptions();
			try {

				answer = Integer.parseInt(myReader.readLine());
				option = true;

				if (answer <= 0) {
					System.out.println(
							"\n*********** ERROR!, This option is not correct, please enter a number between 1 to 10  *********** \n");
					option = false;

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 1 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 1) {
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
					System.out.println("\n          The list of our staff is: \n");

					for (Staff e : information.staffList) {
						System.out.println("          Name: " + e.getName() + "              Surname: " + e.getSurname()
								+ "              ID: " + e.getiD());

					}
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 2 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 2) {
					boolean choose1 = false;
					int choose = 0;
					do {
						displayOptions2();
						try {
							choose = Integer.parseInt(myReader.readLine());

							if (choose == 1) {
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our medical staff is: \n");

								for (int i = 0; i < information.medicalStaffList.size(); i++) {

									Medical medicalStaff = information.medicalStaffList.get(i);
									System.out.println("          Name: " + medicalStaff.getName()
											+ "              Surname: " + medicalStaff.getSurname()
											+ "              ID: " + medicalStaff.getiD());

								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 2) {
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our adminsitrative staff is: \n");

								for (int i = 0; i < information.administrativeStaffList.size(); i++) {

									Administrative adStaff = information.administrativeStaffList.get(i);
									System.out
											.println("          Name: " + adStaff.getName() + "              Surname: "
													+ adStaff.getSurname() + "              ID: " + adStaff.getiD());

								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 3) {
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our veterinarians for pets is: \n");

								for (int i = 0; i < information.smallAnimalsVetsList.size(); i++) {

									SmallAnimalsVet smVet = information.smallAnimalsVetsList.get(i);

									System.out.println("          Name: " + smVet.getName() + "              Surname: "
											+ smVet.getSurname() + "              ID: " + smVet.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 4) {
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out
										.println("\n          List of our veterinarians for livestock animals is: \n");

								for (int i = 0; i < information.largeAnimalsVetsList.size(); i++) {

									LargeAnimalsVet laVet = information.largeAnimalsVetsList.get(i);

									System.out.println("          Name: " + laVet.getName() + "              Surname: "
											+ laVet.getSurname() + "              ID: " + laVet.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 5) {
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our laboratorians is: \n");

								for (int i = 0; i < information.laboratoriansList.size(); i++) {

									Laboratorians lab = information.laboratoriansList.get(i);

									System.out.println("          Name: " + lab.getName() + "              Surname: "
											+ lab.getSurname() + "              ID: " + lab.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 6) {
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our receptionist staff is: \n");

								for (int i = 0; i < information.receptionistStaffList.size(); i++) {

									Receptionist rec = information.receptionistStaffList.get(i);

									System.out.println("          Name: " + rec.getName() + "              Surname: "
											+ rec.getSurname() + "              ID: " + rec.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 7) {
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our IT staff is: \n");

								for (int i = 0; i < information.itStaffList.size(); i++) {

									IT it = information.itStaffList.get(i);

									System.out.println("          Name: " + it.getName() + "              Surname: "
											+ it.getSurname() + "              ID: " + it.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 8) {

								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
								System.out.println("\n          List of our HR staff is: \n");

								for (int i = 0; i < information.hrStaffList.size(); i++) {

									HR hr = information.hrStaffList.get(i);

									System.out.println("          Name: " + hr.getName() + "              Surname: "
											+ hr.getSurname() + "              ID: " + hr.getiD());
								}
								System.out.println(
										"\n         | -------------------------------------------------------------------- |");
							} else if (choose == 9) {

								break;
							} else {
								System.out.println(
										"\n*********** ERROR! This number is lower or bigger than the options, Could you write a option between 1 to 9?  ***********  \n                                      Thanks! ");
								choose1 = false;
							}
						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This is not a number, Please write a number between 1 to 9  ***********  \n                                              Thanks! ");
							choose1 = false;
						}
					} while (choose != 0 || !choose1);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 3 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 3) {

					int option3 = 0;
					boolean choose3 = false;
					do {
						displayOptions3();

						try {

							option3 = Integer.parseInt(myReader.readLine());

							// -----------------------OPTION 1 -----------------------------//
							if (option3 == 1) {

								for (Administrative e : information.administrativeStaffList) {

									System.out.println("          Name: " + e.getTask());

								}

								// -----------------------OPTION 2 -----------------------------//
							} else if (option3 == 2) {

								for (Administrative e : information.holidays) {

									System.out.println("          Name: " + e.getTask());

								}

								// -----------------------OPTION 3 -----------------------------//
							} else if (option3 == 3) {

								for (Administrative e : information.hrTasks) {

									String task = e.getTask();

									System.out.println("          Name: " + task);

								}

								// -----------------------OPTION 4 -----------------------------//
							} else if (option3 == 4) {

								for (Administrative e : information.itTasks) {

									String task = e.getTask();

									System.out.println("          Name: " + task);

								}

								// -----------------------OPTION 5 -----------------------------//
							} else if (option3 == 5) {

								for (Administrative e : information.receptcionistTasks) {

									String task = e.getTask();
									System.out.println("          Name: " + task);

								}

								// -----------------------OPTION 6 -----------------------------//

							} else if (option3 == 6) {
								break;
							} else {

								System.out.println(
										"\n*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 3  *********** \n                       Thanks! ");

							}
						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This options is a letter, please write a number between 1 to 3  *********** \n                       Thanks! ");

							choose3 = false;
						}
					} while (option3 != 0 || !choose3);

					information.assingwork();

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 4 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 4) {

					int option4 = 0;
					boolean choose4 = false;
					do {
						displayOptions4();

						try {

							option4 = Integer.parseInt(myReader.readLine());

							// -----------------------OPTION 1 -----------------------------//
							if (option4 == 1) {

								String name;

								do {
									name = getUser(
											"\n   ----------  Please write the Name or Surname of the staff you are looking for: \n");

									information.staffnameSearch(name.toLowerCase().trim());

									answer1 = getconfirmation1(
											"\n   ----------  If you want to look for other staff write: " + yes
													+ ", if not write: " + no + "\n");

								} while (!answer1);

								// -----------------------OPTION 2 -----------------------------//
							} else if (option4 == 2) {

								String name;
								String sname;

								do {
									name = getUser(
											"\n   ----------  Please write the Name of the staff you are looking for: ");
									sname = getUser(
											"\n   ----------  Please write the Surname of the staff  you are looking for: ");

									System.out.println(information.staffSearch(name, sname));

									answer1 = getconfirmation1(
											"\n   ----------  If you want to look for other staff write: " + yes
													+ ", if not write: " + no);

								} while (!answer1);

								// -----------------------OPTION 3 -----------------------------//

							} else if (option4 == 3) {
								break;
							} else {

								System.out.println(
										"\n*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 3  *********** \n                       Thanks! ");

							}
						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This options is a letter, please write a number between 1 to 3  *********** \n                       Thanks! ");

							choose4 = false;
						}
					} while (option4 != 0 || !choose4);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 5 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 5) {
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
					System.out.println("\n          The list of all Animals: \n");

					for (Animals e : information.animalList) {
						System.out.println(
								"          Type: " + e.getType() + "          Name: " + e.getName() + "          Age: "
										+ e.getAge() + "          Medical condition: " + e.getMedicalCondition());
					}
					System.out.println(
							"\n         | -------------------------------------------------------------------- |");
// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 6 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 6) {
					boolean option6 = false;
					int choose = 0;
					do {
						displayOptions6();

						try {
							choose = Integer.parseInt(myReader.readLine());

							if (choose == 1) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out
										.println("\n          List of Companion animals registered in the clinic : \n");

								for (CompanionAnimals compaion : information.companionAnimalsList) {

									System.out.println("          Type: " + compaion.getType() + "          Name: "
											+ compaion.getName() + "          Age: " + compaion.getAge()
											+ "          Medical condition: " + compaion.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
							} else if (choose == 2) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out
										.println("\n          List of Livestock animals registered in the clinic: \n");

								for (LivestockAnimals Li : information.livestockAnimalsList) {

									System.out.println("          Type: " + Li.getType() + "          Name: "
											+ Li.getName() + "          Age: " + Li.getAge()
											+ "          Medical condition: " + Li.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
							} else if (choose == 3) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of cats registered in the clinic: \n");

								for (Cat cat : information.cat) {

									System.out.println(
											"          Name: " + cat.getName() + "          Age: " + cat.getAge()
													+ "          Medical condition: " + cat.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
							} else if (choose == 4) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of dogs registered in the clinic: \n");

								for (Dog dog : information.dog) {

									System.out.println(
											"          Name: " + dog.getName() + "          Age: " + dog.getAge()
													+ "          Medical condition: " + dog.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
							} else if (choose == 5) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of rabbits registered in the clinic: \n");

								for (Rabbit rab : information.rabbit) {

									System.out.println(
											"          Name: " + rab.getName() + "          Age: " + rab.getAge()
													+ "          Medical condition: " + rab.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
							} else if (choose == 6) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of cattles registered in the clinic: \n");

								for (Cattle cattle : information.cattle) {

									System.out.println(
											"          Name: " + cattle.getName() + "          Age: " + cattle.getAge()
													+ "          Medical condition: " + cattle.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
							} else if (choose == 7) {
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
								System.out.println("\n          List of sheeps registered in the clinic: \n");

								for (Sheep sh : information.sheep) {

									System.out.println("          Name: " + sh.getName() + "          Age: "
											+ sh.getAge() + "          Medical condition: " + sh.getMedicalCondition());

								}
								System.out.println(
										"\n         | ----------------------------------------------------------------------------------------------------- |");
							} else if (choose == 8) {
								break;
							} else {
								System.out.println(
										"\n*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 8  *********** \n                       Thanks! ");

							}
						} catch (Exception e) {
							System.out.println(
									"\n*********** ERROR! This options is a letter, please write a number between 1 to 8  *********** \n                       Thanks! ");
							option6 = false;
						}
					} while (choose != 0 || !option6);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 7 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 7) {

					String name;

					do {
						name = getUser("  ----------  Please write the Name of the animal you are looking for: ");

						ArrayList<Animals> foundanimal = information.searchAnimal(name.toLowerCase().trim());

						if (foundanimal.size() <= 0) {
							System.out.println("\n---------- SORRY! This animal is not registered in the clinic");

						} else {
							System.out.println("\n          The answer from our system is: \n");
							for (Animals a : foundanimal) {

								System.out.println("     |     Name: " + a.getName() + "          Age: " + a.getAge()
										+ "          Type: " + a.getType() + "          Medical condition: "
										+ a.getMedicalCondition());
							}
						}

						answer1 = getconfirmation1("\n  ----------  If you want to look for other animal write: " + yes
								+ ", if not write: " + no);

					} while (!answer1);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 8 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 8) {

					int choose = 0;
					boolean option7 = false;

					do {

						displayOptions8();

						try {
							choose = Integer.parseInt(myReader.readLine());

							if (choose == 1) {

								smallVetsHoleQueue();

							} else if (choose == 2) {

								largeVetsHoleQueue();

							} else if (choose == 3) {

								laboratoriansHoleQueue();

							} else if (choose == 4) {

								String name;
								String sname;

								do {
									name = getUser(
											"\n  ----------  Please write the NAME of the staff  you are looking for: ");
									sname = getUser(
											"\n  ----------  Please write the SURNAME of the staff  you are looking for: ");

									int id = information.medicalStaffSearch(name, sname);

									if (id == 0) {

										System.out.println(
												"\n----------  SORRY! Look for the staff again, because this employee does not work in here.");

									} else if (id >= 111 && id <= 125) {

										int number = information.smallVetSearch(name, sname);

										String vetna = information.smallAnimalsVetsList.get(number).getName();
										String vetsna = information.smallAnimalsVetsList.get(number).getSurname();

										System.out.println(
												"\n     |     The veterinarian for pets: " + vetna + " " + vetsna);
										System.out.println("     |     Has the next animals to attent:  ");
										System.out.println("     |     "
												+ information.smallAnimalsVetsList.get(number).getMyQueue());

									} else if (id >= 126 && id <= 130) {

										int number = information.largeVetSearch(name, sname);

										String vetna = information.largeAnimalsVetsList.get(number).getName();
										String vetsna = information.largeAnimalsVetsList.get(number).getSurname();

										System.out.println("\n     |     The veterinarian for livestock animals: "
												+ vetna + " " + vetsna);
										System.out.println("     |     Has the next animals to attent:  ");
										System.out.println("     |     "
												+ information.largeAnimalsVetsList.get(number).getMyQueue());

									} else if (id >= 131 && id <= 140) {

										int number = information.laboratoriansSearch(name, sname);

										String vetna = information.laboratoriansList.get(number).getName();
										String vetsna = information.laboratoriansList.get(number).getSurname();

										System.out.println("\n     |     The laboratorian: " + vetna + " " + vetsna);
										System.out.println("     |     Has the next animals to attent:  ");
										System.out.println(
												"     |     " + information.laboratoriansList.get(number).getMyQueue());

									}

									answer1 = getconfirmation1(
											"\n  ----------  If you want to look for other veterinarian or laboratorian write: "
													+ yes + ", if not write: " + no);

								} while (!answer1);
							} else if (choose == 5) {
								break;

							} else {
								System.out.println(
										"*********** ERROR! This number is lower and bigger than the options, please write a number between 1 to 5 ***********\n                       Thanks! ");

							}
						} catch (Exception e) {
							System.out.println(
									"*********** ERROR! what you just write contain a letter or space *********** \n***********       Please write a number between 1 to 5  *********** \n                       Thanks! ");
							option7 = false;
						}
					} while (choose != 0 || !option7);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 9 ++++++++++++++++++++++++++++++++++++++++++++++++++++//

				} else if (answer == 9) {

					String name;
					String sname;
					boolean flag = false;
					boolean answer2;
					boolean answer3;

//--------------// --------------FIRST LOOP --------------------------------------------- //
					// first question about what is the name and surname of the medical staff that
					// the user is looking for
					do {
						name = getUser("\n  ----------  Please write the NAME of the staff you are looking for:  ");
						sname = getUser("\n  ----------  Please write the SURNAME of the staff you are looking for: ");

						int id = information.medicalStaffSearch(name, sname);

//						int id=131;
						System.out.println(id);
//--------------// --------------PRINT THE INFORMATION--------------------------------------------- //	
						if (id == 0) {

							System.out.println(
									"\n----------  SORRY! Look for the staff again, because this employee does not work in here  ----------");

						} else if (id >= 111 && id < 126) {

							int number = information.smallVetSearch(name, sname);
							smallVetsQueue(number);

							do {
								answer1 = getconfirmation1(
										"\n  ----------  Did you finish to attent this animaland would you like to attent the next one?, please write: "
												+ yes + "\n or " + no
												+ " if you haven't finished to attent this animal and you would like to go back.");

								if (answer1 == false) {

									nextsmallAnimalQueue(number);
									flag = false;
								} else if (answer1 == true) {

									smallVetsQueue(number);

									answer2 = getconfirmation1(
											"\n  ----------  Would you like to continue with the same veterinarian?, please write: "
													+ yes + " or " + no);

									if (answer2 == false) {
										flag = false;
									} else if (answer2 == true) {

										flag = true;
//										break;
									}
								}
							} while (!flag);

//---------------------------------------------------------------------------------------------------------------------------------//								

						} else if (id >= 126 && id <= 130) {

							int number = information.largeVetSearch(name, sname);

							largeVetsQueue(number);

							do {

								answer1 = getconfirmation1(
										"\n  ----------  Did you finish to attent this animal and would you like to attent the next one?, please write: "
												+ yes + "\n or " + no
												+ " if you haven't finished to attent this animal and you would like to go back.");

								if (answer1 == false) {

									nextlargeAnimalQueue(number);

									flag = false;
								} else if (answer1 == true) {

									largeVetsQueue(number);

									answer2 = getconfirmation1(
											"\n  ----------  Would you like to continue with the same veterinarian?, please write: "
													+ yes + " or " + no);

									if (answer2 == false) {
										flag = false;
									} else if (answer2 == true) {

										flag = true;
									}
								}
							} while (!flag);
//--------------------------------------------------------------------------------------------------------------------//
						} else if (id >= 131 && id <= 140) {

							int number = information.laboratoriansSearch(name, sname);

							laboratoriansQueue(number);

							do {

								answer1 = getconfirmation1(
										"\n  ----------  Did you finish to attent this animal and would you like to attent the next one?, please write: "
												+ yes + "\n or " + no
												+ " if you haven't finished to attent this animal and you would like to go back.");

								if (answer1 == false) {

									nextlaboratoriansQueue(number);

									flag = false;
								} else if (answer1 == true) {

									laboratoriansQueue(number);

									answer2 = getconfirmation1(
											"\n  ----------  Would like to continue with the same laboratorian?, please write "
													+ yes + " or " + no);

									if (answer2 == false) {
										flag = false;
									} else if (answer2 == true) {
										flag = true;
//										break;
									}
//									break;
								}
							} while (!flag);

						}

//--------------//-----------------FINISH TO PRINT --------------------------------------------------//

						answer3 = getconfirmation1(
								"\n  ----------  Would you like to look for other Medial Staff?, please write " + yes
										+ " if not write " + no);

					} while (!answer3);

// ++++++++++++++++++++++++++++++++++++++++++ ANSWER 10 ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				} else if (answer == 10) {
					System.out.println(
							"\n  ----------------  THANK YOU FOR VISIT US, HAVE A GOOD DAY   ----------------  ");
					break;
				}

// +++++++++++++++++++++++++++++++++++++ FINISH OPTION  ++++++++++++++++++++++++++++++++++++++++++++++++++++//
				else {
					System.out.println(
							"***********  ERROR! Unespected system error! please enter a valid option between 1 to 10  ***********");

				}
//*************************************** FINISH TRY - CATCH ************************************************//
			} catch (Exception e) {
				System.out.println(
						"***********  ERROR! Unespected system error! please enter a valid option between 1 to 10  ***********");
				option = false;

//********************************* FINISH DO - WHILE THE OPTIONS *******************************************//	
			}
		} while (answer != 0 || !option);
	}

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  FINISH METHOS OF OPTIONS %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%//

// $$$$$$$$$$$$$$$$$$$$$$$$$ START METHOS TO USE INSIDE OF OPTIONS METHOS $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$//

// +++++++++++++++++++++++++++++++++++++ DISPLAY METHOD  ++++++++++++++++++++++++++++++++++++++++++++++++++++//
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

	public static boolean validate(String input) {

		if (input.length() < 3 || input.length() > 12) {
			return false;
		} else {

			if (input.matches("[0-9]+")) {
				return false;
			} else if (!input.matches("[a-z A-Z]+")) {
				return false;

			} else {
				return true;
			}
		}
	}

//	 Validation of my user input: this method is creating to validate and control the user input, in order to get the correct inforamtion. 
	public static String getUser(String prompt) {

		// I am using the Buffer reader to get the input from the user
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		// variable boolean used in for break the do -while loop
		boolean valid = false;
		// variable to get the user input as a String variable
		String input = "";

		// do -while: in order to validate the input, if this not fulfill the conditions
		// the do while keep going until the input is valid.
		do {
			System.out.println(prompt);

			// try -catch:
			try {
				input = myReader.readLine();
				if ((input.length() < 3) || (input.length() > 12)) {
					valid = false;
					System.out.println(
							"\n*********** ERROR!, You must enter a name between 3 and 12 letters  ***********\n ");

				} else {

					if (input.matches("[0-9]+")) {
						valid = false;
						System.out.println(
								"\n*********** ERROR!, This has a number, you must enter a name between 3 and 12 letters  ***********\n ");

					} else if (!input.matches("[a-z A-Z]+")) {
						valid = false;
						System.out.println(
								"\n*********** ERROR!, This is not only letters, you must enter a name between 3 and 12 letters  *********** \n");

					} else {
						valid = true;
					}
				}
			} catch (Exception e) {
				valid = false; // happen after try.
				System.out.println("\n*********** ERROR! You did not eneter a valid name!  *********** \n");
			}
		} while (!valid);
		return input;
	}

// Method to validate my option yes or no, I created a method because I am going to use this method in many occasions
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

		// first do is working to get a valid input to be a yes or no
		do {
			System.out.println(prompt);
			// try - catch is to catch unforeseen errors
			try {
				input = myReader.readLine();

				// if the input is equal to yes or no is going to return a true or false in the
				// flag variable
				if (input.toLowerCase().trim().equals("yes") || input.toLowerCase().trim().equals("no")) {

					if (input.toLowerCase().trim().equals("yes")) {

						// false for yes to run the method again
						flag = false;
					} else if (input.toLowerCase().trim().equals("no")) {

						// true for stop the do _while in the method
						flag = true;

					}
					// in the case is a correct input is going to get out of this do _while
					valid = true;
					// if the input is not correct is going to return a error message and ask again
					// for the correct input
					// if the input is a number is going to return this error message
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
		// the return is going to be false if the answer is yes and true if the answer
		// is no
		return flag;
	}

	public static String getconfirmation(String prompt) {

		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		boolean valid = false;
		String input = "";
		String yes = "yes";
		String no = "no";

		do {
			System.out.println(prompt);
			try {
				input = myReader.readLine();
				if (input.toLowerCase().equals("yes") || input.toLowerCase().equals("no")) {
					valid = true;

				} else {
					valid = false;
					System.out.println("\n***********  ERROR! you must enter yes or no  ***********\n");
				}
			} catch (Exception e) {
				valid = false; // happen after try.
				System.out.println("\n***********  ERROR! you did not enter a valid option!  ***********\n");
			}
		} while (!valid);
		return input;
	}

// ++++++++++++++++++++++++++++++++ METHODS TO HELP  QUEUE METHOS  ++++++++++++++++++++++++++++++++++++++++++//

	public void smallVetsHoleQueue() {
		System.out.println("\n          The queue in the clinic for each Small Veterinarian: ");

		for (int i = 0; i < information.smallAnimalsVetsList.size(); i++) {
			String smname = information.smallAnimalsVetsList.get(i).getName();
			String smsname = information.smallAnimalsVetsList.get(i).getSurname();

			System.out
					.println("\n     |      " + smname + " " + smsname + "\n     |     has to attent the next animals: "
							+ information.smallAnimalsVetsList.get(i).getMyQueue());
		}

	}

	public void smallVetsQueue(int number) {

		String vetna = information.smallAnimalsVetsList.get(number).getName();
		String vetsna = information.smallAnimalsVetsList.get(number).getSurname();
		String na = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		System.out.println("\n     |        The Veterinarian for pets :\n     |" + "\n     |        " + vetna + " "
				+ vetsna + "\n     |" + "\n     |        At the moment is attending a:\n     |"
				+ "\n     |        Type: " + type + "\n     |" + "\n     |        With next information:" + "\n     |"
				+ "\n     |        * Name: " + na + "\n     |        * Age: " + age
				+ "\n     |        * Medical condition: " + med);

	}

	public void nextsmallAnimalQueue(int number) {

		information.smallAnimalsVetsList.get(number).getMyQueue().remove();

		String na1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type1 = information.smallAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		System.out.println("\n      |       The next animal to attent is a:\n      | " + "\n      |        * Type: "
				+ type1 + "\n      |" + "\n      |        With next information:\n      |  ");
		System.out.println("      |        * Name: " + na1 + "\n      |        * Age: " + age1
				+ "\n      |        * Medical condition: " + med1);

	}

	public void largeVetsHoleQueue() {

		System.out.println("\n          The queue in the clinic for each livestock Veterinarian: ");

		for (int i = 0; i < information.largeAnimalsVetsList.size(); i++) {

			String laname = information.largeAnimalsVetsList.get(i).getName();
			String lasname = information.largeAnimalsVetsList.get(i).getSurname();

			System.out
					.println("\n     |      " + laname + " " + lasname + "\n     |     has to attent the next animals: "
							+ information.largeAnimalsVetsList.get(i).getMyQueue());
		}

	}

	public void largeVetsQueue(int number) {

		String vetna = information.largeAnimalsVetsList.get(number).getName();
		String vetsna = information.largeAnimalsVetsList.get(number).getSurname();
		String na = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		System.out.println("\n     |        The Veterinarian for livestock animals:\n     |" + "\n     |        "
				+ vetna + " " + vetsna + "\n     |" + "\n     |        At the moment is attending a:\n     |"
				+ "\n     |        Type: " + type + "\n     |" + "\n     |        With next information:" + "\n     |"
				+ "\n     |        * Name: " + na + "\n     |        * Age: " + age
				+ "\n     |        * Medical condition: " + med);

	}

	public void nextlargeAnimalQueue(int number) {

		information.largeAnimalsVetsList.get(number).getMyQueue().remove();

		String na1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getName();
		double age1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getAge();
		String med1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type1 = information.largeAnimalsVetsList.get(number).getMyQueue().getFirst().getType();

		System.out.println("\n      |       The next animal to attent is a:\n      | " + "\n      |        * Type: "
				+ type1 + "\n      |" + "\n      |        With next information:\n      |  ");
		System.out.println("      |        * Name: " + na1 + "\n      |        * Age: " + age1
				+ "\n      |        * Medical condition: " + med1);

	}

	public void laboratoriansHoleQueue() {

		System.out.println("\n          The queue in the clinic for each Laboratorian: ");

		for (int i = 0; i < information.laboratoriansList.size(); i++) {

			String labname = information.laboratoriansList.get(i).getName();
			String labsname = information.laboratoriansList.get(i).getSurname();

			System.out.println(
					"\n     |      " + labname + " " + labsname + "\n     |     has to attent the next animals: "
							+ information.laboratoriansList.get(i).getMyQueue());
		}

	}

	public void laboratoriansQueue(int number) {

		String vetna = information.laboratoriansList.get(number).getName();
		String vetsna = information.laboratoriansList.get(number).getSurname();
		String na = information.laboratoriansList.get(number).getMyQueue().getFirst().getName();
		double age = information.laboratoriansList.get(number).getMyQueue().getFirst().getAge();
		String med = information.laboratoriansList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type = information.laboratoriansList.get(number).getMyQueue().getFirst().getType();

		System.out.println("\n     |        The Laboratorian :\n     |" + "\n     |        " + vetna + " " + vetsna
				+ "\n     |" + "\n     |        At the moment is attending a:\n     |" + "\n     |        Type: " + type
				+ "\n     |" + "\n     |        With next information:" + "\n     |" + "\n     |        * Name: " + na
				+ "\n     |        * Age: " + age + "\n     |        * Medical condition: " + med);

	}

	public void nextlaboratoriansQueue(int number) {

		information.laboratoriansList.get(number).getMyQueue().remove();

		String na1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getName();
		double age1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getAge();
		String med1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getMedicalCondition();
		String type1 = information.laboratoriansList.get(number).getMyQueue().getFirst().getType();

		System.out.println("\n      |       The next animal to attent is a:\n      | " + "\n      |        * Type: "
				+ type1 + "\n      |" + "\n      |        With next information:\n      |  ");
		System.out.println("      |        * Name: " + na1 + "\n      |        * Age: " + age1
				+ "\n      |        * Medical condition: " + med1);

	}

}
