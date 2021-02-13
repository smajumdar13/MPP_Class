package lesson3.labs.prob3A.copy;

public class Cylinder {
	private double height;
	private double radius;
	public double getRadius() {
		return radius;
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
	public double computeArea() {
		return 2* Math.PI * radius * height + 2 * Math.PI * radius * 2;
	}

}
