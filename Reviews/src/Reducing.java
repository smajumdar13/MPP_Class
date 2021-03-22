import java.util.Arrays;
import java.util.List;

public class Reducing {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,3,4,5,1);
		int sum = ints.stream().reduce(0, (x,y) -> x+y);
		System.out.println(sum);

	}

}
