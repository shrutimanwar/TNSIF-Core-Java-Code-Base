package Interface;

public interface Bank {
	
	final static float MINBAL= 5000;
	final static float Deposit_Limt = 25000;
	
	public void deposit(float amount);
	public void widthdraw(float amount);
}
