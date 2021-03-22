package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Harry", "Sam", "Roger", "Samantha", "Rocky", "Christoph", "Becky", "Alan", "Robbie");
		
		pickName(names, "S");
		System.out.println(status(4.0));
	}
	
	public static void pickName(final List<String> names, final String startingLetter) {
		final Optional<String> foundName = names.stream().filter(name -> name.startsWith(startingLetter)).findAny();
//		System.out.println(String.format("A name starting with %s: %s", startingLetter, foundName.orElse("Name not found")));
		foundName.ifPresent(name -> System.out.println(name));
	}
	
	public static String status(Double d){
		return d<=0 ? "Value is below Zero" : "Value is above Zero";
	}
}
