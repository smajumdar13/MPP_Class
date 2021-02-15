package Tries.CustAcctFact;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		var custList = List.of(
						CustomerFactory.createCustomer(25452, "Jessica Rhodes", 
						LocalDate.of(1977, 8, 22), 532698547625L, 25000.00),
						CustomerFactory.createCustomer(52458, "Rob Thomas", 
						LocalDate.of(1965, 4, 15), 532698563625L, 29757.55));
		
		for(Customer c: custList) {
			System.out.println(c);
			System.out.println();

		}
	}
}
