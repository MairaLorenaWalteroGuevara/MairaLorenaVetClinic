package Staff;

public abstract class Staff {

	// YOU ACTUALLY DON'T NEED THIS VARIABLE.
	// I LEFT IT THERE, BUT YOU CAN REMOVE IT.
	private String fullName;
	
	
	private String surname;
	private String name;
	private int iD;
	private double salaryLevel;
	private double payment;

	
	public Staff(String name, String surname) {
		this.surname = surname;
		this.name = name;
	}
	

	public String getFullName() {
		// YOU SEE? THIS THING IS NEVER RUNNING, BECAUSE
		// WE NEVER CALLED THIS METHOD
		this.fullName = this.name + this.surname;
		return fullName;
	}



	public void setFullName(String name, String surname) {
		this.fullName = name + surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getpayment(double payment) {

		this.payment += payment;
		return payment;

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
	
	// THIS METHOD WAS ORIGINALLY PRINTING THE FULLNAME VARIABLE
	// BUT THAT VARIABLE HAS ALWAYS BEEN NULL...
	public String toString() {
		//return fullName;
		return name + " " + surname;
	}

}
