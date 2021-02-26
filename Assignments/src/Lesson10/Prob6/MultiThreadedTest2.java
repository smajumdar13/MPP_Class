package Lesson10.Prob6;



public class MultiThreadedTest2 {	
	static Queue queue = new Queue();
	public static void main(String[] args) {	
		for(int i = 0; i < 10; ++i) {
			multipleCalls();
			
		}
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		System.out.println("Number of null check bypass: " 
			       + queue.size());
		
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