package lesson7.labs.prob1.partE.one;

public  class D implements B , C{
	
	// D must override the method. if C was an abstract method, D would inherit from default method B.
	// need to use super.method();
	
	@Override
	public void myMethod() {
		System.out.println("D");
		B.super.myMethod();
	}
}
