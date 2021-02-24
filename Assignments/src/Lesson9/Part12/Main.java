package Lesson9.Part12;

public class Main {

	public static void main(String[] args) {
		
		for(int i=1;i<500000;i++) {
			MySingletonLazy.getInstance();
		}
		System.out.println(MySingletonLazy.getCounter());
	}

}
