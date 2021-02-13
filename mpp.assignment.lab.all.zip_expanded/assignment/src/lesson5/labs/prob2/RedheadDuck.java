package lesson5.labs.prob2;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		super(FlybeharviorFactory.CreateFlyWithWingsBehavior(),QuackbeharviorFactory.CreateQuackBehavior());
//		flyBehavior= new FlyWithWings();
//		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("This is Readhead duck");
		
	}

}
