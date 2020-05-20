package Animals;

public class Cat extends CompanionAnimals {

	private String type = "Cat";


	public Cat(String name, int age, String medicalCondition) {
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
