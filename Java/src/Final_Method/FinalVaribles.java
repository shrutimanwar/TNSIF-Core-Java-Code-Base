package Final_Method;

public class FinalVaribles {
	
	//final int a; //final instance variable must be initialize
	
	final int x=100;
	
	//Declare a static blank final variable
	final static int y;
	
	final static int z = 10;
	
	//instance method
	void change()
	{
		//x = 30; final variable can not be change
		//z = 50; or re assign
	}

	//toString
	@Override
	public String toString() {
		return "FinalVaribles [x=" + x + ", y=" + y + "]";
	}
	
	//Declare static block
	static 
	{
		y = 20;
		//z = 80; once initialize can not be change
	}
	
	
	
	
	
}
