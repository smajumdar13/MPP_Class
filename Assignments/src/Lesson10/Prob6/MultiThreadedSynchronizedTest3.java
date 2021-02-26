package Lesson10.Prob6;

import java.util.Random;

public class MultiThreadedSynchronizedTest3 {	
	static QueueSynchronized queue = new QueueSynchronized();
	public static void main(String[] args) {	
		for(int i = 0; i < 10; ++i) {
			multipleCalls();
			System.out.println("Number of null check bypass: " 
				       + Queue.headNullCheckCounter);
		}	
		
	}
	public static void multipleCalls() {
		Runnable r = () -> {
			for(int i = 0; i < 5000; ++i) {
				
				queue.add("value" + i);
				
			}
		};
		for(int i = 0; i < 1000; ++i) {
			new Thread(r).start();	
			
		}
	}
}