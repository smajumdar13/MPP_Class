package lesson5.labs.prob2;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super(FlybeharviorFactory.CreateCannotFlyBehavior(),QuackbeharviorFactory.CreateMuteQuackBehavior());
		
//		flyBehavior= new CannotFly();
//		quackBehavior = new MuteQuack();
		
		
		
		
	}

	@Override
	public void display() {
		System.out.println("This is Decoy duck");
		
	}

}
