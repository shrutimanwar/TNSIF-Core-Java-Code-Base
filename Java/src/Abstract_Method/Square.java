package Abstract_Method;

public class Square extends Shape  {
	
	float side;
	
	public Square() {
		side = 4.8f;
	}
	public Square (float side) {
		
		this.side = side;
	}
	
	public void calArea() {
		 this.area = side*side;
	}
	

}
