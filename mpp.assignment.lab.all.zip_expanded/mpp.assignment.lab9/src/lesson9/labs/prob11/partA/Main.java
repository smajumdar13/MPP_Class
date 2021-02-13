package lesson9.labs.prob11.partA;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		
		List<String> alphabet = Arrays.asList("nopqrstuvwxyz".split(""));
		
//        List<Predicate<Employee>> allPredicates = new ArrayList<>();
//        for(String al: alphabet) {
//            allPredicates.add(str->str.lastName.toLowerCase().startsWith(al));
//        }
//
//        System.out.println(emps.stream()
//                .filter(e->e.getSalary()>100000)
//                .filter(allPredicates.stream()
//                        .reduce(x->false, Predicate::or))
//                .map(x->x.getFirstName() +" "+ x.lastName)
//                .sorted(String::compareToIgnoreCase)
//                .collect(Collectors.joining(", ")));
				               
		 System.out.println(emps.stream()
	                .filter(e->e.getSalary()>100000)
	                .filter(e->alphabet.contains(Optional.ofNullable(e.lastName).orElse(" ").substring(0,1).toLowerCase()))
	                .map(x->x.getFirstName() +" "+ x.lastName)
	                .sorted(String::compareToIgnoreCase)
	                .collect(Collectors.joining(", ")));

		               

	}
	
	
	

}
