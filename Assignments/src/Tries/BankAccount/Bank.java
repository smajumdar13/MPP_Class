package Tries.BankAccount;

import java.util.List;

public class Bank {
	private List<Account> accounts;
	
	public Bank(List<Account> l) {
		this.accounts = l;
	}
	
	public void addInterest_all_accounts() {
		for(Account a: accounts) {
			a.addInterest();
		}
	}
	
//	public void addAccount(int accountNr, )
}
