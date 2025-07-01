package Jump_Statements;

public class Switch_Demo {

	public static void main(String[] args) {
		
		int userInput = 2;
		
		switch(userInput)
		{
		
		case 1 : System.out.println("Current Recharge details ");
		break;
		
		case 2 : System.out.println("Current Recharge Expiry ");
		break;
		
		case 3 : System.out.println("New Offers ");
		break;
		
		case 4 : System.out.println("Talk to our Customer Support Person ");
		break;
		
		default : 
			System.out.println(userInput + " is not a valid input given by you");
		
		
		
		}
	}

}
