package Lesson4.ProbE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	public Employee(String name) {
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account acct) {
		accounts.add(acct);
	}
	
	public String getName() {
		return name;
	}
	
	public double computeUpdatedBalanceSum() {
		double sum = 0.0;
		for(var account: accounts) {
			sum += account.computeUpdatedBalance();
		}
		return sum;
	}
}
