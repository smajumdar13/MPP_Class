package Lesson4.ProbE;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String acctId, double interestRate, double balance) {
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = balance;
	}
	
	public String getAccountID() {
		return acctId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double computeUpdatedBalance() {
		return balance + (interestRate * balance);
	}
}
