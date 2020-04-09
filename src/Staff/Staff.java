package Staff;

public abstract class Staff {

	private String name; 
	private int iD; 
	private double salaryLevel;
	private double payment; 
	
	public double getpayment(double payment) {
		
		this.payment+=payment;
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
	
	

}
