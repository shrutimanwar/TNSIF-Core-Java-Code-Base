package Interface;

public class SavingAccount extends Customer implements Bank
{

	
	private int accNo;
	private float balance;
	
	//parameter constructor
	public SavingAccount(String name, String city, int accNo, float balance) {
		
		super(name,city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	

	//getter and setter
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}



	@Override
	public void deposit(float amount) {
		
		if(amount < 0 || amount > Deposit_Limt)
		{
			System.out.println("Please deposit valid Amount");
		}
		else 
		{
			balance += amount ; //balance = balance + amount
			System.out.println("Rs : "+ amount + "is deposited successfully");
		}
	}

	@Override
	public void widthdraw(float amount) {
		
		if(amount <= balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Rs : "+ amount + "widthdraw");
		}
		else
		{
			System.out.println("Insufficent Balance");
		}
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	

}
