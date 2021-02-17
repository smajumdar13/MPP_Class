package lesson7.labs.prob1.partE.two;

public interface B extends A {
	default void myMethod() {
		System.out.println("B");
	}
}
