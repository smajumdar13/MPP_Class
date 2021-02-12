package edu.miu.cs.cs401.quiz2.bankingapp.model;

public class Account {
	private long accountNumber;
	private double balance;
	
	public Account(long a, double b){
		accountNumber = a;
		balance = b;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double bal) {
		this.balance = bal;
	}
	
	public String toString() {
		return accountNumber +", " + balance;
	}

}