package Final_Method;

public final class FinalClassDemo {
	
	void show()
	{
		System.out.println("Final class cannot be inherited");
	}

	//class Student extends FinalClassDemo
	//{
		
	//}
	
	public class FinalClass
	{
		public static void main(String[]arg)
		{
			//by creating an object we can use that class
			FinalClassDemo f = new FinalClassDemo();
		}
	}
}
