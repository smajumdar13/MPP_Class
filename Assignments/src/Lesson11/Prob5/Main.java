package Lesson11.Prob5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		
		 List<Manager> emps = Arrays.asList(
					new Manager("Joe", "Davis", 120000),
			        new Manager("John", "Sims", 110000),
			        new Manager("Joe", "Stevens", 200000),
			        new Manager("Andrew", "Reardon", 80000),
			        new Manager("Joe", "Cummings", 760000),
			        new Manager("Steven", "Walters", 135000),
			        new Manager("Thomas", "Blake", 111000),
			        new Manager("Alice", "Richards", 101000),
			        new Manager("Donald", "Trump", 100000));
		 
		 System.out.println(emps);
		  System.out.println(secondSmallest(emps,2));
		  
		  
		  //List of string
		  List<String> strings = Arrays.asList("z","k","a","b");
		  System.out.println(secondSmallest(strings,2));		  
		  
		  
		List<Integer> integers = Arrays.asList(100, 22, 500, 23);
		System.out.println(secondSmallest(integers,2));

	}
	
	 public static <T extends Comparable<? super T>> T secondSmallest(List<T> list,int rank) {
	        T secondSmallest= null;
	        List<T> sortedList = list.stream().sorted(T::compareTo).collect(Collectors.toList());
	        secondSmallest= sortedList.get(rank-1);
	        return secondSmallest;

	    }

}
