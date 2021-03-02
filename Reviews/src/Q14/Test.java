package Q14;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		
		var product = Arrays.stream(arr).reduce(1, (a,b) -> a*b);
		System.out.println(product);
		
//		var pr = IntStream.of(arr).reduce(1, (a,b) -> a*b);
//		System.out.println(pr);
		
		Consumer<Integer> print = (e) -> System.out.println(e);
		print.accept(arr[2]);
	}
}
