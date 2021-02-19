package lesson7.labs.prob1.partE.two;

public  interface D extends B , C{
	
	// if D is an interface, both B and C cannot be classes
	@Override
	default void myMethod() {
		System.out.println("D");
	}
}
