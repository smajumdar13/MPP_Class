package Lesson10.Prob6;

public class SingleThreadedTest1 {

	public static void main(String[] args) {
		 Queue queue = new Queue();
		for(int i = 0; i < 10; ++i) {
			queue.add("value" + i);		
			
		}
		System.out.println(Queue.headNullCheckCounter);
	}
	
}
