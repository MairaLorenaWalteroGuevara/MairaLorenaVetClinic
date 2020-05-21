package Animals;

public class Cattle extends LivestockAnimals {

	// This classes child of the child of the Animals only contain:
	// The constructor to create the instances
	// and the variable type to get what kind of animal is the instance.
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