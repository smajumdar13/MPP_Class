package lesson9.exercise_4;

import java.util.stream.Stream;

public class Main {
	//Use the reduce method to produce a single space-separated String
	public static void main(String[] args) {
//		Stream<String> strings = Stream.of();
		Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
		String sentence = strings.reduce((s1, s2) -> s1 + " " + s2).orElse(""); 
		//Use or else to avoid NullPointerException in empty stream
		System.out.println(sentence);
	}

}
