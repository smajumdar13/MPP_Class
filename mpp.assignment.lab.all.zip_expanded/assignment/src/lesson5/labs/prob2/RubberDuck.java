package lesson5.labs.prob2;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(FlybeharviorFactory.CreateCannotFlyBehavior(), QuackbeharviorFactory.CreateSqueakBehavior());
//		flyBehavior= new CannotFly();
//		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("This is rubber duck");
		
	}

}
