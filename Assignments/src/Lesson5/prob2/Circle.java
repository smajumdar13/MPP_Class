package Lesson5.prob2;

public final class Circle implements Shape {
	private final double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
