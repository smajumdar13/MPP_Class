package Q04;

import java.util.stream.IntStream;

public class FirstNSquares {

	public static void main(String[] args) {
		
		int t = 5;
//		int sumOfSquares = IntStream.iterate(1, n -> n + 1).map(n -> n*n).limit(t).sum();
		System.out.println(sumOfFirstNSquares(t));
	}
	
	public static int sumOfFirstNSquares(int i) {
		return IntStream.iterate(1, n -> n + 1).map(n -> n*n).limit(i).sum();
	}

}
