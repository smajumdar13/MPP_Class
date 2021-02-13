package lesson9.labs.prob10.partc;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<Integer> myIntStream = Stream.of(1,2,5,7,9,2,1,5,68);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(x->x));
		System.out.println(summary.getMax());
		System.out.println(summary.getMin());
	}

}
