package Constructor_Overloading;

//Constructor Overloading
public class Point {
	
	private float x;
	private float y;
	
	public Point()
	{
		x= 0.0f;
		y = 0.0f;
	}
	
	//para constructor
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
