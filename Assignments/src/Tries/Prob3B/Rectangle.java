package Tries.Prob3B;

public class Rectangle {
	private double side1;
	private double side2;
	
	public Rectangle(double s1, double s2) {
		this.side1 = s1;
		this.side2 = s2;
	}
	
	public double getArea() {
		return side1*side2;
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public String toString() {
		return "Area of Rectangle: " + getArea();
	}
}
