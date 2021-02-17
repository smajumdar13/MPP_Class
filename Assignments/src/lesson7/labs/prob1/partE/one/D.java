package lesson7.labs.prob1.partE.one;

public  class D implements B , C{
	
	//D must override the method (or declare it as an abstract method)
	@Override
	public void myMethod() {
		System.out.println("D");
		B.super.myMethod();
	}
}
