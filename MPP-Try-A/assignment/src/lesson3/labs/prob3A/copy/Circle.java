package lesson3.labs.prob3A.copy;

public class Circle extends Cylinder {
	
	public Circle( double radius) {		
		super(0,radius);
		
	}
	@Override
	public double computeArea() {
		return Math.PI * getRadius() * getRadius();
	}

}
