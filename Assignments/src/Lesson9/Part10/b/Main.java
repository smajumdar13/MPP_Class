package Lesson9.Part10.b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> streamString = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(streamString.collect(Collectors.joining(", ")));
	}
}
