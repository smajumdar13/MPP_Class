package edu.miu.cs.cs401.quiz2.bankingapp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer {
	private String customerID;
	private String name;
	private LocalDate dateOfBirth;
	private Account account;
	
	public Customer(String cusID, String n, LocalDate dob, Account ac){
		customerID = cusID;
		name = n;
		dateOfBirth = dob;
		account = ac;
	}
	
	public String getCustomerID() {
		return customerID;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getDOB() {
		return dateOfBirth;
	}
	
	public String toString() {
		return customerID + ", " + name + ", " + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) 
		+", " +  account;
	}
}
