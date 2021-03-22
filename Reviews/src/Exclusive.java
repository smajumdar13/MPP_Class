import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exclusive {

	public static void main(String[] args) {
		List<Integer> int1 = Arrays.asList(1,2,3,4,8,9,10);
		List<Integer> int2 = Arrays.asList(2,4,6,7,5,9,10);
		
		List<Integer> exclusive = int1.stream().filter(e -> !int2.contains(e)).collect(Collectors.toList());
		exclusive.addAll(int2.stream().filter(e -> !int1.contains(e)).collect(Collectors.toList()));
		System.out.println(exclusive);

	}

}
