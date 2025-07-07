package Overriding;

class Colours{

	protected Colours getColours()
	{
		Colours s=new Colours();
		return s;
	}
}
//child class
class Red extends Colours{
	
	@Override
	protected Red getColours()
	{
		Red s=new Red();
		return s;
	}
	
	
}
//child class
class Blue extends Colours{
	
	@Override
	protected Blue getColours()
	{
		Blue s=new Blue();
		return s;
	}
	
	
}

public class Colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}