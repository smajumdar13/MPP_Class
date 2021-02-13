package lesson5.labs.prob3;

public final class Rectangle implements Shape {
	private final double width;
	public double getWidth() {
		return width;
	}
	public double getheight() {
		return height;
	}
	private double height;
	public Rectangle(double width, double height) {
		this.width=width;
		this.height =height;
	}
	@Override
	public double computeArea() {
		return width * height;
	}
}
