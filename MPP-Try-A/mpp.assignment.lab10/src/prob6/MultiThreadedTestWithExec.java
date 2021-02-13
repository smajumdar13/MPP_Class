package prob6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MultiThreadedTestWithExec {
	static Queue queue = new Queue();
	private static Executor exec 
	   = Executors.newCachedThreadPool();
	public static void main(String[] args) {	
		for(int i = 0; i < 10; ++i) {
			multipleCalls();
			System.out.println("Number of null check bypass: " 
			       + Queue.headNullCheckCounter);
		}
		
		System.out.println("Number of null check bypass: " 
			       + queue.size());
	}
	public static void multipleCalls() {
		Runnable r = () -> {
			for(int i = 0; i < 500; ++i) {
				queue.add("value" + i);
			}
		};
		for(int i = 0; i < 100; ++i) {
			exec.execute(r);		
		}
		try {
			Thread.sleep(10);
		} catch(InterruptedException e) {}
	}
}
