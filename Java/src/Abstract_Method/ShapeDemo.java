package Abstract_Method;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape s;
		
		s = new Square();
		s.calArea();
		s.show();
		
		//default
		s = new Rectangular();
		s.calArea();
		s.show();

		//parameter
		s = new Rectangular(23.4f, 64.94f);
		s.calArea();
		s.show();
		

	}

}
