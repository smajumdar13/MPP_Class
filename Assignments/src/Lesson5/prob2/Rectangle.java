package Lesson5.prob2;

public final class Rectangle implements Shape {
	private final double length;
	private final double width;
	
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double computeArea() {
		return length * width;
	}
}
