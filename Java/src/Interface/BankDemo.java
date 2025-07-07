package Interface;

public class BankDemo {

	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount("Shruti", "Pune", 123334, 36500);
		
		s1.deposit(23879);
		System.out.println(s1);
		
		s1.widthdraw(10000);
		System.out.println(s1);
		
		s1.widthdraw(1);
		System.out.println(s1);
		
		
		
		

	}

}
