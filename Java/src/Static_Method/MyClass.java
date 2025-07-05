package Static_Method;

public class MyClass {
	
	private int section;   //non static variable or instance variable
	
	private static int srNo;  //static or class variable
	
	//static block
	
	static
	{
		System.out.println("-------With in Static block------");
		srNo = 1000;
		
		//section = 101
	}
	
	//default constructor
	public MyClass()
	{
		System.out.println("----With in Default constructor");
		srNo++;
		section++;
	}
	
	//toString
	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
		
	}
	
	//static method
	static void display()
	{
		//System.out.println("Section : "+ section);
		
		System.out.println("Serial No : "+ srNo);
	}
	
	

}
