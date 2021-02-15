package Tries.CustAcctFact;

public class Account {
	private Customer customer;
	private long accNo;
	private double balance;
	
	public Account(long a, double b) {
		this.accNo = a;
		this.balance = b;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Account: "+accNo+" Balance: "+balance;
	}
	
}
