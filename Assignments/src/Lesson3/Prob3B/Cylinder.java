package Lesson3.Prob3B;


// Using composition to solve Lab3 Prob3

public class Cylinder {
	private Circle circle;
	private double height;
	
	public Cylinder(double r, double h){
		this.circle = new Circle(r);
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeVolume() {
		return circle.computeArea() * height;
	}
	
	public String toString() {
		return String.format("Volume of cylinder is %.2f.", computeVolume());
	}
}
