package prob4;

public class DecoyDuck extends Duck {

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}
	@Override
	public void quack() {
		System.out.println("I am mute");
	}

	@Override
	public void display() {
		System.out.println("This is Decoy duck");
		
	}

}
