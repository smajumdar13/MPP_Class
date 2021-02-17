package Lesson4.ProbE;

public class CheckingAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String acctId;

	public CheckingAccount(String acctId, double monthlyFee, double balance) {
		this.acctId = acctId;
		this.monthlyFee = monthlyFee;
		this.balance = balance;
	}
	
	public String getAccountID() {
		return acctId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double computeUpdatedBalance() {
		return balance - monthlyFee;
	}
}
