package ConsumerTest;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
	private MyStringList list;
	
	MyConsumer(MyStringList l){
		list = l;
	}
	
	@Override
	public void accept(String item) {
		list.add(item);
	}
}
