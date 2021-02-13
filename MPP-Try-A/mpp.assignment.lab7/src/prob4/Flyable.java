package prob4;

interface Flyable {
	
	default void fly() {
		System.out.println("I can fly");
	}
	
}
