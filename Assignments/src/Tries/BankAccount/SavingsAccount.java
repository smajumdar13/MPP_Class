package Tries.BankAccount;

public class SavingsAccount extends Account {
	private double interestRate = 0.03;
	
	public void addInterest() {
		deposit(interestRate*getAmount());
	}
}
