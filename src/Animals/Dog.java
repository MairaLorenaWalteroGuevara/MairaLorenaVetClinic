package Animals;

public class Dog extends CompanionAnimals {

	private String type = "Dog";
	
	public Dog(String name, int age, String medicalCondition) {
		super(name, age, medicalCondition);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}