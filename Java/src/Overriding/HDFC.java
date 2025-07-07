package Overriding;

public class HDFC extends RBI {
	
	//@override
		public float getRateofInterest()
		{
			System.out.println("Base Rate of Interest of home Loan");
			return 7.0f;
		}
}
