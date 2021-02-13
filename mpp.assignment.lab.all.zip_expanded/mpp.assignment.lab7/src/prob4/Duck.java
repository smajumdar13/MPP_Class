package prob4;

public abstract class Duck implements Flyable,Quackable {
//	private Flyable flyBehavior;
//	private Quackable quackBehavior;	
//	Duck(Flyable flyBehavior,Quackable quackBehavior){
//		this.flyBehavior=flyBehavior;
//		this.quackBehavior=quackBehavior;
//	}
//	public void quack() {
//		quackBehavior.quack();
//	}

	public void swim() {
		System.out.println("Swimming is easy. We all duck swim the same way");
	}

//	public void fly() {
//		flyBehavior.fly();
//	}
	public abstract void display();
}
