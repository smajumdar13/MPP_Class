package Lesson8.Prob5;

import java.util.Arrays;
import java.util.List;

public class LambdaExp {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
			
				
		list.forEach((w)-> System.out.println(w.toUpperCase()));

	}
}
