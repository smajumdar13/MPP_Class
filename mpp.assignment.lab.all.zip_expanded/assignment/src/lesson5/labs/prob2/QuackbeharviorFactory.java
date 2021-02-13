package lesson5.labs.prob2;

public class QuackbeharviorFactory {
	public static QuackBehavior CreateMuteQuackBehavior() {
		return new MuteQuack();
	}
	public static QuackBehavior CreateSqueakBehavior() {
		return new Squeak();
	}
	public static QuackBehavior CreateQuackBehavior() {
		return new Quack();
	}
	
	

}
