package lesson4.labs.probE;

public class SavingsAccount extends Account {
	private String acctId;
	private double interestRate;
	private double balance;

	/**
	 * @param acctId
	 * @param interestRate
	 * @param balance
	 */
	public SavingsAccount(String acctId, double interestRate, double balance) {
		
		this.acctId = acctId;
		this.interestRate = interestRate;
		this.balance = balance;
	}

	@Override
	public String getAccountId() {
		// TODO Auto-generated method stub
		return acctId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance + (interestRate * balance);
	}

}
