package prob1.partE.one;

public interface B extends A {
	default void myMethod() {
		System.out.println("B");
	}
}
