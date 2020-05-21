package Staff;

public class Administrative extends Staff {

	// The subclass of the Animal contain the constructor to allow us to create instances of this class. 
	// in addition this class help to organized and divided the other subclasses when I am creating the instances.
		
	//In this case the Administrative class can help us to add a attribute and inherited this only to administrative subclasses
	protected String task;

	public Administrative(String surname, String name, int iD) {
		super(surname, name, iD);
		// TODO Auto-generated constructor stub

	}

	//GETTERS AND SETTERS FOR THE ATTRIBUTE 
	// methods that help to set and get the attributes from others classes
	public String getTask() {
		return task;
	}

	// In this case The setter is receiving a Administrative staff and a string 
	//with this information is going to create the task. 
	public void setTask(Administrative staff, String task) {
		this.task = staff + task;
	}

}
