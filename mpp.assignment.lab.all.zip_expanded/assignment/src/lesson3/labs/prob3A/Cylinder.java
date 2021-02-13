package lesson3.labs.prob3A;

public class Cylinder {
	private double height;
	private double radius;
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Cylinder(double height, double radius) {
			
		this.height = height;		
		
	}

	public double getHeight() {
		return height;
	}
	public double computeVolume() {
		return  Math.PI * radius * radius * 	height;
	}

}
