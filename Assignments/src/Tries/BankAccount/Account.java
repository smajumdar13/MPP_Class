package Tries.BankAccount;

abstract class Account {
	private int accountNr;
	private String name;
	private double currentAmt;
	
//	public Account(int ac, String n, double amt) {
//		this.accountNr = ac;
//		this.name = n;
//		this.currentAmt = amt;
//	}
	
	public int getAccountNr() {
		return accountNr;
	}
	
	public String getName() {
		return name;
	}
	
	public void deposit(double d) {
		currentAmt += d;
	}
	
	public void withdraw(double w) {
		currentAmt -= w;
	}
	
	public void setAccountNr(int i) {
		this.accountNr = i;
	}
	
	public double getAmount() {
		return currentAmt;
	}
	
	abstract void addInterest();
}
