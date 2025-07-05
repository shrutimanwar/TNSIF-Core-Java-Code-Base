package Static_Method;

public class Employee {
	
	//declare instance variable
	private String name;
	private int id;
	
	//Declare a static companyName with data type String
	static String companyname = "TNSIF";
	
	//para constructor
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	//toString
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", companyname = "+ companyname +"]";
	}
	
	
	
	
}
