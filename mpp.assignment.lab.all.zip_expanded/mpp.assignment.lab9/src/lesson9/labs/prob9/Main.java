package lesson9.labs.prob9;
import java.util.stream.IntStream;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
	}
	public static void printSquares(int num) {
		IntStream ints = IntStream.iterate(1, n->n+1).limit(num);
		ints.forEach(x->System.out.println(x*x));
		
	}


}
