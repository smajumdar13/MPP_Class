package Lesson8.Prob5;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
			
		list.replaceAll(String::toUpperCase);		
		list.forEach(System.out::println);
		
	}
}
