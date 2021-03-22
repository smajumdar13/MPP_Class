package finalexam.part2q1.streampipelineops;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import finalexam.part2q1.model.Customer;
import finalexam.part2q1.model.CustomerAccountPair;
import finalexam.part2q1.model.CustomerTestData;
import finalexam.part2q1.model.Transaction;

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
	
	// Print all Names of Customers whose address is in
	// the state of California, "CA" and whose City is NOT "Santa Monica"
	public static void prob1() {
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
		List<String> notFromSM = customers.stream().filter(e -> (e.getAddress().getState().equals("CA")
				&& !e.getAddress().getCity().equals("Santa Monica"))).map(name -> name.getName())
				.collect(Collectors.toList());
		System.out.println(notFromSM);
	}
	
	// Create a stream pipeline that obtains a list of
	// all customer/account pairs extracted from the list of Customers
	// for which there is at least one transaction in the account.
	// Print the list in descending order of Customer names.
	public static void prob2() {
		//use this list 
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
		List<CustomerAccountPair> custAccPairs = customers.stream().filter(e -> e.getAccount().getTrxns().size()>=1)
				.map(e -> new CustomerAccountPair(e.getName(), e.getAccount().getAccountNumber()))
				.sorted(Comparator.comparing((CustomerAccountPair p) -> p.getCustomerName(), Comparator.reverseOrder()))
				.collect(Collectors.toList());
		System.out.println(custAccPairs);
	}
	
	// Create a stream pipeline to print all the transactions for all
	// the customers' accounts, displaying them in order from the oldest
	// to the most recent and then by descending order of the transaction amounts.
	// (Note: there is an instance variable "amount" in Transaction)
	public static void prob3() {
		//use this list	
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
	
		System.out.println(customers.stream().flatMap(a->a.getAccount().getTrxns().stream())
		        .sorted(Comparator.comparing((Transaction t)->t.getDate()).thenComparing(t->t.getAmount()).reversed())
		        .collect(Collectors.toList())
		        );
	}	
	
	//Create a stream pipeline to find all transactions done after year 2000
	//and sort them by amount (from small to high), and print to console.
	//(Note: there is an instance variable "amount" in Transaction)
	public static void prob4() {
		//use this list	
		List<Customer> customers = CustomerTestData.getCustomers();
		// Implement your code here
		List<Transaction> allTranx = customers.stream().flatMap(e -> e.getAccount().getTrxns().stream())
				.filter(e -> e.getDate().getYear()>2000)
				.sorted(Comparator.comparing((Transaction t)->t.getAmount()))
				.collect(Collectors.toList());
		System.out.println(allTranx);
	}
	
	// Create a stream pipeline to find all Accounts with balance, 
	// bigger than $1000 and having at least 1 transaction which was
	// done after the year, 2000.
	// And print the result to console.
	public static void prob5() {
		//Use this list
		List<Customer> customers = CustomerTestData.getCustomers();  
		// Implement your code here
		System.out.println(customers.stream().filter(e -> e.getAccount().getBalance()>1000).flatMap(e -> e.getAccount().getTrxns().stream())
				.filter(e -> e.getDate().getYear()>2000).collect(Collectors.toList()));
	}
}
