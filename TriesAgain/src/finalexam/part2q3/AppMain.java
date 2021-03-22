package finalexam.part2q3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import finalexam.part2q3.model.Account;

public class AppMain {

    public static void main(String[] args) {
        List<Long> numbers = Arrays.asList(9810231946L, 1734530935L, 8744511009L);
        System.out.printf("The smallest of the numbers, %s is: %d\n", numbers,findSmallest(numbers));

        List<String> names = Arrays.asList("Joseph", "Zachariah", "Hernandez");
        System.out.printf("The smallest of the names, %s is: %s\n", names,findSmallest(names));

        List<LocalDate> dates = Arrays.asList(
            LocalDate.of(1974,1,31),
            LocalDate.of(1945,12,18),
            LocalDate.of(1945,6,24)
        );
        System.out.printf("The smallest of the dates, %s is: %s\n", dates,findSmallest(dates));

        List<Account> accounts = Arrays.asList(
            new Account(101L, 9875400.52),
            new Account(102L, 10399840.18),
            new Account(103L, 54098005.01)
        );
        
//      added these few lines, because the method code was not working *trying
//        List<Double> balances = null;
//        for(Account a: accounts) {
//        	balances = List.of(a.getBalance());
//        }
        
        
//        System.out.printf("The account with the smallest balance is: %s\n", findSmallest((List<T>) accounts));
        
        
        
    }

    //INSTRUCTIONS: Implement code here for a method named, findSmallest,
    // which takes as input, a list of objects of any type, T, and
    // it finds and returns the smallest item in the list.
    // Then, uncomment the code provided in the main method above and
    // execute it to test your implementation of the findSmallest.
    // Expected output is the following:
    //The smallest of the numbers, [9810231946, 1734530935, 8744511009] is: 1734530935
    //The smallest of the names, [Joseph, Zachariah, Hernandez] is: Hernandez
    //The smallest of the dates, [1974-01-31, 1945-12-18, 1945-06-24] is: 1945-06-24
    //The account with the smallest balance is: {accountNumber=101, balance=9875400.52}
    
    public static <T extends Comparable<? super T>> T findSmallest(List<T> list) {
    
    	
    	T smallest = list.get(0);
		
		for(int i=1; i<list.size(); i++) {
			if(list.get(i).compareTo(smallest)<0) {
				smallest = list.get(i);
			}
		}
		return smallest;
    	
    }

}
