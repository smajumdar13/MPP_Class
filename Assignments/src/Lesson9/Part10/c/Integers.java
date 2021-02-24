package Lesson9.Part10.c;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Integers {
	
	public static void main(String[] args) {
		Stream<Integer> myIntStream = Arrays.asList(1,2,3).stream();
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(x -> x));
		System.out.println("max = " + summary.getMax() + "\nmin = " + summary.getMin());
		
	}
}
