package Tries.CustAcctFact;

import java.time.LocalDate;

public class CustomerFactory {
	public static Customer createCustomer(int cusID, String name, LocalDate dob, long acctNo, double bal) {
		
		Customer cus = new Customer(cusID, name, dob);
		Account acct = new Account(acctNo, bal);
		
		cus.setAcc(acct);
		acct.setCustomer(cus);
		return cus;
		
	}
}
