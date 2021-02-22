package Lesson9.Part9;

import java.util.stream.IntStream;

public class NumSquares {

	public static void main(String[] args) {
		printSquares(4);
	}
	
	public static void printSquares(int num) {
		IntStream squares = IntStream.iterate(1, i -> i+1).limit(num);
		squares.forEach(x -> System.out.println(x*x));
	}
}
