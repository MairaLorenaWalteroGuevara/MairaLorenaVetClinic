package Staff;

public abstract class Staff {

	
	protected String surname;
	protected String name;
	protected int iD;
	protected double salaryLevel;
	protected double payment;

	
	
	

	public Staff(String name, String surname, int iD) {
		
		this.surname = surname;
		this.name = name;
		this.iD = iD;
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
		return (name +" "+ surname +" "+ iD);
		
	}

}
