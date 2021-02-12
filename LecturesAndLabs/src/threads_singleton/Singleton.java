package threads_singleton;

public class Singleton {
	private static Singleton instance;
	public static int counter = 0;
	private Singleton() {
		//do nothing
	}
	public static Singleton getInstance() { 
		if(instance == null) {
			instance = new Singleton();
			counter++;
		}
		return instance;
	}
}
