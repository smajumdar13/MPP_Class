package lesson9.labs.prob10.partb;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> strings = Stream.of("Bill","Thomas",  "Mary");		
		System.out.println(strings.collect(Collectors.joining(", ")));
	   

	}

}
