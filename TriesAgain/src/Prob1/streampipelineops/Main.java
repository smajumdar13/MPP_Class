package Prob1.streampipelineops;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Prob1.model.Customer;
import Prob1.model.CustomerAccountPair;
import Prob1.model.CustomerTestData;
import Prob1.model.Transaction;

/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS GIVEN HERE */
public class Main {
	
	public static void main(String[] args) {
		System.out.println("Start...");
				
		prob1();
		prob2();
		prob3();
		prob4();
		prob5();
	}
	
	/* Create a stream pipeline that does the following: */
	
	// Print all Names of Customers whose address is NOT in
	// the state of Iowa, "IA"
	public static void prob1() {
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
		List<String> custNotInIowa = customers.stream().filter(x -> !x.getAddress().getState().equals("IA"))
				.map(name -> name.getName()).collect(Collectors.toList());
		System.out.println(custNotInIowa);
	}
	
	// Create a stream pipeline that obtains a list of
	// all customer/account pairs extracted from the list of Customers
	// for which there is at most one transaction in the account.
	// Print the list in descending order of Customer names.
	public static void prob2() {
		//use this list 
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here	
//		List<String> list1 = customers.stream().filter(e -> e.getAccount().getTrxns().size()<=1)
//				.sorted(Comparator.comparing(Customer::getName, Comparator.reverseOrder()))
//				.map(e -> ("("+e.getName()+", "+e.getAccount().getAccountNumber()+")"))
//				.collect(Collectors.toList());
		List<CustomerAccountPair> list1 = customers.stream().filter(e -> e.getAccount().getTrxns().size()<=1)
				.map(e -> new CustomerAccountPair(e.getName(), e.getAccount().getAccountNumber()))
				.sorted(Comparator.comparing((CustomerAccountPair p) -> p.getCustomerName(), Comparator.reverseOrder()))
				.collect(Collectors.toList());
		
		System.out.println(list1);
	}
	
	// Create a stream pipeline to print all the transactions for all
	// the customers' accounts, displaying them in order from the most recent
	// to the oldest and then by descending order of the transaction amounts.
	// (Note: there is an instance variable "amount" in Transaction)
	public static void prob3() {
		//use this list	
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
		System.out.println(customers.stream().flatMap(a->a.getAccount().getTrxns().stream())
        .sorted(Comparator.comparing((Transaction t)->t.getDate()).thenComparing(t->t.getAmount()).reversed())
        .collect(Collectors.toList()));
	}	
	
	//Create a stream pipeline to find all transactions done before year 2000
	//and sort them by amount (from small to high), and print to console.
	//(Note: there is an instance variable "amount" in Transaction)
	public static void prob4() {
		//use this list	
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
		 System.out.println(customers.stream().flatMap(t->t.getAccount().getTrxns().stream())
				 .filter(a->a.getDate().getYear()<2000)
			     .sorted(Comparator.comparing((Transaction t)->t.getAmount()))
			     .collect(Collectors.toList()));
	}
	
	// Create a stream pipeline to find all Accounts with balance, 
	// less than $5000 and having at least 1 transaction which was
	// done after the year, 2000.
	// And print the result to console.
	public static void prob5() {
		//Use this list
		List<Customer> customers = CustomerTestData.getCustomers();  
		// Implement your code here
		System.out.println();
//		System.out.println(customers.stream().flatMap(f -> f.getAccount().getTrxns().stream())
//				.filter(e -> e.getDate()<=2000 && e.getDate()));
		System.out.println(customers.stream().filter(a->a.getAccount().getBalance()<5000)
                .flatMap(a->a.getAccount().getTrxns().stream()).filter(a->a.getDate().getYear()>2000)
                .collect(Collectors.toList()));
	}
}
