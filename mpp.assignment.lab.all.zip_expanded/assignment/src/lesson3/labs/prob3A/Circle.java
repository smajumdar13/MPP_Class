package lesson3.labs.prob3A;

public class Circle extends Cylinder {
	private double radius;
	public Circle( double radius) {		
		super(0,radius);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
