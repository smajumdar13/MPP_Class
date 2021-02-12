package Lesson3.Prob3B;

public class Circle {
	private double radius;
	
	Circle(double r){
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	public double computeArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public String toString() {
		return String.format("Area of circle is %.2f.", computeArea());
	}
}