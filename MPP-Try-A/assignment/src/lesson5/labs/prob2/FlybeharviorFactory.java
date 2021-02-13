package lesson5.labs.prob2;

public class FlybeharviorFactory {
	public static FlyBehavior CreateCannotFlyBehavior() {
		return new CannotFly();
	}
	public static FlyBehavior CreateFlyWithWingsBehavior() {
		return new FlyWithWings();
	}


}
