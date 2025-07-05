package Final_Method;

public class FinalMethodClass {

	//default constructor
	public FinalMethodClass ()
	{
		System.out.println("---Default ");
	}
	
	final int a= 50;
	//final method
	final void show()
	{
		System.out.println("Value of a: "+ a);
	}
}
