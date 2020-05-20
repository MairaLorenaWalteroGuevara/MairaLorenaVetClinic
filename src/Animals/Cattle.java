package Animals;

public class Cattle extends LivestockAnimals {

	private String type = "Cattle";
	

	public Cattle(String name, int age, String medicalCondition) {
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