package lesson3.labs.prob3B;

public class Cylinder {
	private double height;
	private Circle circle;
	//private double radius;

	public Cylinder(double height, double radius) {

		this.height = height;
		this.circle = new Circle(radius);
	}

	public double getHeight() {
		return height;
	}
	public double computeVolume() {
		return circle.computeArea() * 	height;
	}

}
