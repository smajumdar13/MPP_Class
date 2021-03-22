package LambdaTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lambda1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sam", "Roger", "Harry", "Larry", "Mini", "John", "Bravo", "Susan", "Homer", "Harriet");
		
//		List<String> out = list.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
		
		Function<String, String> upperCase = (String x) -> x.toUpperCase();
//		System.out.println(upperCase);
		
		System.out.println(output(list, "H"));
		
		
	}
	
	static List<String> output(List<String> list, String s){
		return list.stream().filter(n -> n.startsWith(s)).collect(Collectors.toList());
	}

}
