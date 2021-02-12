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
	
	/* Here in this problem, it does not seem right as Circle inherits from Cylinder
	 * since it should be the other way round. Circle and cylinder have radius, and area
	 * in common, and cylinder has height and volume added to its attribute and behavior
	 * because of which cylinder should inherit from circle instead. Moreover, to call 
	 * computeArea() in circle, it is required to create a different constructor in
	 * cylinder.
	 */
}