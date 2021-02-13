package lesson5.labs.prob3;

public final class Circle implements Shape {
	private final double radius;
	public double getRadius() {
		return radius;
	}
	/**
	 * @param radius
	 */
	public Circle(double radius) {
		
		this.radius = radius;
	}
	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
