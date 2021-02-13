package prob4;

public class RubberDuck extends Duck {

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}
	@Override
	public void quack() {
		System.out.println("I squeak");
	}

	@Override
	public void display() {
		System.out.println("This is rubber duck");
		
	}

}
