package Tries.CustAcctFact;

import java.time.LocalDate;

public class Customer {
	private Account acc;
	private long custID;
	private String name;
	private LocalDate dob;
	
	public Customer(long c, String n, LocalDate d) {
		this.custID = c;
		this.name = n;
		this.dob = d;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public long getCustID() {
		return custID;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public String toString() {
		return "CustomerID: "+ custID + ". Name: " + name + "\nDate of Birth: "+ dob + "\n"
					+acc.toString();  
		
	}
}
