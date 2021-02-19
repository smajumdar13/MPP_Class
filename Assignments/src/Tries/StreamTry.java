package Tries;

import java.util.stream.Stream;

public class StreamTry {
	public static void main(String args[]) {
		Integer[] arrOfInt = {1,2,3,4};
		Stream<Integer> strOfInt = Stream.of(arrOfInt);
		
		// not applicable on int
//		int[] arrOfInt1 = {1,3,5,7};
//		Stream<int[]> strOfInt1 = Stream.of(arrOfInt);
		
		Stream<Double> randoms = Stream.generate(Math::random);
		
		
	}
}
