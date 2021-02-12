package edu.miu.cs.cs401.quiz2.bankingapp;

import java.time.LocalDate;

import edu.miu.cs.cs401.quiz2.bankingapp.model.Account;
import edu.miu.cs.cs401.quiz2.bankingapp.model.Customer;

public class BankingApp {

	public static void main(String[] args) {
		Customer p1 = new Customer("C19102", "Anna Lynn Smith", LocalDate.of(1977, 1, 31), new Account(2801011119L, 10095.50));
		Customer p2 = new Customer("C24499", "Bob Jones", LocalDate.of(1989, 12, 7), new Account(2911111901L, 5590.35));
		
		Customer[] p = new Customer[2];
		p[0] = p1;
		p[1] = p2;
		
		for(Customer per: p) {
			System.out.println(per);
		}
	}
}