import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		sum();

	}
	
	public static void sum (){
		System.out.println(IntStream.iterate(9, n -> n+2).limit(3).sum());
	}
	
//	public static String lengthOfLongerWord(String s, String t) {
////		return Stream.of(s, t).
//	}
}
