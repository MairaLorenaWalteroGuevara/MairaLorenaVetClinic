package Animals;

public abstract class Animals {

	protected String name;
	protected int age; 
	protected String medicalCondition;
	
	public Animals(String name, int age, String medicalCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}
	
	public String toString() {
		return (name + " "+ age + " "+  medicalCondition);
		
	}
	
	
	public double toint() {
		return age;
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
	public void setAge(int age) {
		this.age = age;
	}
	public String getMedicalCondition() {
		return medicalCondition;
	}
	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	
	
	
	
	

}
