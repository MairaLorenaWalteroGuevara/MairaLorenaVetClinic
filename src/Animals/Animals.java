package Animals;

public abstract class Animals {
	
	//It is the super class for Animals, 
	//This class is abstract so you can not use this class to create instances, 
	//but you can use this class to construct the base for the subclasses and inherit the base
	// in addition this class make easier to create a base for other classes. 
	
	
	// In here you can find the attributes required for each animal 
	//and some attributes necessary for the Queue 
	

	protected String name;
	protected int age; 
	protected String medicalCondition;
	private Animals next;
	private String type; 
	
	
// The constructor that is necessary to create the instances of subclasses of the Animals
	public Animals(String name, int age, String medicalCondition) {
		super();
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}
	
	// to String necessary to print the instances and the format how they are going to be printed: 
	// Example : Mia 14.0  Tubercolosis 
	public String toString() {
		return (name + " "+ age + " "+  medicalCondition);
		
	}
	
	// FROM HERE START THE GETTERS AND SETTERS 
	// methods that help to set and get the attributes from others classes
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
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Animals getNext() {
		return next;
	}

	public void setNext(Animals next) {
		this.next = next;
	}
	
	
	

}
