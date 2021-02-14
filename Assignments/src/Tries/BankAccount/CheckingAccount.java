package Tries.BankAccount;

public class CheckingAccount extends Account{
	private double interestRate = 0.01;
	
//	public CheckingAccount(int ac, String n, double amt) {
//		super(ac, n, amt);
//		
//	}
	
	public void addInterest() {
		deposit(interestRate*getAmount());
	}
}
