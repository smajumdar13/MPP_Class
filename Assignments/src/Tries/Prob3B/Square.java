package Tries.Prob3B;

public class Square {
	public Rectangle rect;
	
	public Square(double side) {
		this.rect = new Rectangle(side, side);
	}
	
	public double getArea() {
		return rect.getArea();
	}
	public void print() {
		System.out.println(this);
	}
	
	public String toString() {
		return "Area of Square: " + getArea();
	}
}
