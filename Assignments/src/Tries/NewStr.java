package Tries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStr {
	public static void main(String args[]) {
		Function<char[], String> myFunc = String::new;
		char[] charArray = {'s', 'p', 'e', 'a', 'k'};
		System.out.println(myFunc.apply(charArray));
		System.out.println(new String(charArray));
		
		
		List<String> list = Arrays.asList("Joe", "Tom", "Abe"); 
		Stream<Stream<Character>> result =  list.stream().map(s -> characterStream(s));
		System.out.println(result.collect(Collectors.toList()));
	}
	
	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>(); for (char c : s.toCharArray()) 
			result.add(c);
			return result.stream();
	}
}
