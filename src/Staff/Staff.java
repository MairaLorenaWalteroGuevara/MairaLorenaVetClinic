package Staff;

public abstract class Staff {

	private String fullName;
	private String surname;
	private String name;
	private int iD;
	private double salaryLevel;
	private double payment;

	
	
	

	public String getFullName() {
		this.fullName = this.name + this.surname;
		return fullName;
	}

	public Staff(String name, String surname) {
		this.surname = surname;
		this.name = name;
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
	
	public String toString() {
		return fullName;
		
	}

}
