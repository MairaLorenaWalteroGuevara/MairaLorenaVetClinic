package Staff;

public class LargeAnimalsVet extends Medical {

	// This classes child of the child of the staff only contain:
	// The constructor to create the instances
	// and the variable salaryLevel to get what salary the instance is going to
	// have.

	// The variable double to set the salary
	// In here you can find the attribute salaryLevel set in a specific number.
	protected double salaryLevel = 100000.0;

	public LargeAnimalsVet(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub
	}

	// the getter and setter for the attribute
	public double getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(double salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

}
