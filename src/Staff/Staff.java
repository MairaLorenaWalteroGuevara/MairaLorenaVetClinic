package Staff;

public abstract class Staff {

	// It is the super class for Staff
	// This class is abstract so you can not use this class to create instances,
	// but you can use this class to construct the base for the subclasses and
	// inherit the base
	// in addition this class make easier to create a base for other classes.
	
	// The instances of the Tasks for the staff are creating 
	//because I used them to create the task of the administrative staff 
	//but in the end I changed the task for an attribute, 
	// I thought in generate tasks for medical staff as well but in the end I did not do it. 

	// In here you can find the attributes required for each staff
	protected String surname;
	protected String name;
	protected int iD;
	protected double salaryLevel;

	// The constructor that is necessary to create the instances of subclasses of
	// the Staff
	public Staff(String name, String surname, int iD) {

		this.surname = surname;
		this.name = name;
		this.iD = iD;
	}

	// FROM HERE START THE GETTERS AND SETTERS
	// methods that help to set and get the attributes from others classes
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public double getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(double salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	// to String necessary for print the instances and it give the format how they
	// are going to be printed:
	// Maira Waltero 111
	public String toString() {

		return (name + " " + surname + " " + iD);
	}

}
