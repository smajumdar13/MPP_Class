package Lesson8.Prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		BiFunction<Double, Double, List<Double>> biFunction = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};
		System.out.println(biFunction.apply(2.0, 3.0));
		
		BiFunction<Double, Double, Double> add = (x, y) -> {
			return (x + y);
			};
		System.out.println(add.apply(2.0, 3.0));
		
		List<Integer> list = Stream.iterate(1,n->n+2).skip(4).limit(4).collect(Collectors.toList());
		System.out.println(list);
		
		IntStream.of(1,3,5,7,9).sorted().forEach(System.out::println);
		Double sum = (double) IntStream.of(2,5,8,6,4).sum();
		System.out.println(sum);
		
		List<Integer> squaresOfFirstNNums = Stream.iterate(1, n -> n+1).limit(6).map(n -> n*n).collect(Collectors.toList());
		System.out.println(squaresOfFirstNNums);
		
		List<Integer> oddNaturalNNums = Stream.iterate(1, n -> n+2).limit(6).collect(Collectors.toList());
		System.out.println(oddNaturalNNums);
	}

}
