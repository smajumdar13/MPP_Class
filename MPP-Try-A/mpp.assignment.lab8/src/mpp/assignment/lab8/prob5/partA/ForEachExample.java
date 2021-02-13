package mpp.assignment.lab8.prob5.partA;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		// Use a lambda expression instead of directly defining a Consumer

		
		list.forEach((w)-> System.out.println(w.toUpperCase()));	
		
	}	
			
	
}

