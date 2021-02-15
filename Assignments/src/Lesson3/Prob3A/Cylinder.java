package Lesson3.Prob3A;

public class Cylinder {
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public Cylinder(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double computeVolume() {
		return computeArea() * height;
	}
	
	public String toString() {
		return String.format("Volume of cylinder is %.2f.", computeVolume());
	}
}