package lesson4.labs.probE;

public class CheckingAccount extends Account {
	private String acctId;	
	private double monthlyFee;	
	private double balance;

	/**
	 * @param acctId
	 * @param monthlyFee
	 * @param balance
	 */
	public CheckingAccount(String acctId, double monthlyFee, double balance) {
		
		this.acctId = acctId;
		this.monthlyFee = monthlyFee;
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
		return balance - monthlyFee;
	}

}
