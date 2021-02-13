package prob6;

import java.util.ArrayList;
import java.util.List;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	//To check threadsafe.
	public static int headNullCheckCounter=0;
	
	
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
	public  void add(Object newValue) {
		Node n = new Node();
		if(head == null) {
			head = n;	
			//headNullCheckCounter();
			
		}
		else tail.next = n;
		//tail is always the current value
		tail = n;
		tail.value = newValue;
	}
	public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	public int size() {
		int counter = 0;
		Node currentNode = head;
		while (currentNode != null) {
			counter++;
			currentNode = currentNode.next;
		}
		return counter;
	}
//	 private static void headNullCheckCounter() {
//		headNullCheckCounter++;
//	}
}
