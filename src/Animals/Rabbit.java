package Animals;

public class Rabbit extends CompanionAnimals {

	private String type = "Rabbit";
	
	public Rabbit(String name, int age, String medicalCondition) {
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
