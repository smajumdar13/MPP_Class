package Lesson5.prob2;

public final class Triangle implements Shape {
	private final double base;
	private final double height;
	
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return 0.5 * base * height;
	}
}
