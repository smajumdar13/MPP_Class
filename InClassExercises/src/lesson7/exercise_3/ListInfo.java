package lesson7.exercise_3;

import java.util.ArrayList;
import java.util.List;

public class ListInfo {
	List<String> list = new ArrayList<>();
	MyStringList strList = new MyStringList();
	public static void main(String[] args) {
		ListInfo li = new ListInfo();
		li.process();
	}
	
	public void process() {
		list.add("A");
		list.add("W");
		list.add("K");
		list.add("C");
		
		//use java8 foreach to copy all list elements into strList
		// using void method for stream
//		list.forEach(e -> System.out.println(e));
		
		// using Consumer
		MyConsumer c = new MyConsumer(strList);
		list.forEach(c);
		System.out.println(strList);
	}
}
