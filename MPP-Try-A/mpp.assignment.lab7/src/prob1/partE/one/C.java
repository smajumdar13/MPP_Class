package prob1.partE.one;

public interface C extends A{
	default void myMethod() {
		System.out.println("C");
	}
}
