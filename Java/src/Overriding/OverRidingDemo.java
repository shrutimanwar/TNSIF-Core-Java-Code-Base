package Overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		
		//dynamic binding assinging child object to parent reference variable
		
		rbi = new SBI();
		System.out.println(rbi.getRateofInterest());

		rbi = new ICIC();
		System.out.println(rbi.getRateofInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateofInterest());

	}

}
