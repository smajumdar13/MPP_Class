package lesson5.labs.prob2;

public class MallardDuck extends Duck {

	
	public MallardDuck() {
		super(FlybeharviorFactory.CreateFlyWithWingsBehavior(),QuackbeharviorFactory.CreateMuteQuackBehavior());
		
//		flyBehavior= new CannotFly();
//		quackBehavior = new MuteQuack();
		
		
		
		
	}
	

	@Override
	public void display() {
		System.out.println("This is Mallard duck");
		
	}

}
