package lesson5.labs.prob2;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;	
	Duck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
		this.flyBehavior=flyBehavior;
		this.quackBehavior=quackBehavior;
	}
	public void quack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("Swimming is easy. We all duck swim the same way");
	}

	public void fly() {
		flyBehavior.fly();
	}
	public abstract void display();
}
