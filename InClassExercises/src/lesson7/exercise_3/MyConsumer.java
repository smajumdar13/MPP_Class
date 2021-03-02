package lesson7.exercise_3;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
	private MyStringList list;
	
	MyConsumer(MyStringList l){
		this.list = l;
	}
	
	@Override
	public void accept(String s) {
		list.add(s);
	}
}
