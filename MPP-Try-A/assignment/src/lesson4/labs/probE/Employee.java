package lesson4.labs.probE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	/**
	 * @param name
	 */
	public Employee(String name) {
		
		this.name = name;
		accounts = new ArrayList<Account>();
	}
	private List<Account> accounts;
	public void addAccount(Account account) {
		accounts.add(account);
	}
	public double computeUpdatedBalanceSum() {
		//implement
		double balanceSum=0;
		for(var account: accounts) {
			balanceSum+=account.computeUpdatedBalance();
		}
		return balanceSum;
	}
	public String getName() {
		return name;
	}
}
