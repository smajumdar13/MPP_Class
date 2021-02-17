package lesson7.labs.prob1.partE.two;

public  interface D extends B , C{
	
	//clash must be resolved, either by making myMethod abstract, or by overriding it in a new default method as is done here
	@Override
	default void myMethod() {
		System.out.println("D");
	}
}
