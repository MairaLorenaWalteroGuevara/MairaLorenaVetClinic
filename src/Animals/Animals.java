package Animals;

public abstract class Animals {

	private String name;
	private double age; 
	private String medicalCondition;
	
	public Animals(String name, double age, String medicalCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	
	
	
	
	

}
