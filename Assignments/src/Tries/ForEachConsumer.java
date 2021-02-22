package Tries;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachConsumer {

	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			}
		};
		
		List<String> list = new ArrayList<String>();
		
		list.add("Rob");
		list.add("Selena");
		list.add("Ron");
		list.add("Gulliver");
		list.add("Hera");
		list.add("Billy");
		
		list.forEach(consumer);

	}

}
