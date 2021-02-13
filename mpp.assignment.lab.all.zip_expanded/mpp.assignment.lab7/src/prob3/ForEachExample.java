package prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format

		Consumer<String> myConsumer = new Consumer<String>() {
			@Override
			public void accept(String value) {
				System.out.println(value.toUpperCase());
			}
		};
		list.forEach(myConsumer);

	}

	// implement a Consumer
	public static void toUppercase(String word) {
		System.out.println(word.toUpperCase());
	}

}
