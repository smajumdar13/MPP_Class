package Lesson5.prob2;

public class Main {

	public static void main(String[] args) {
		Shape[] shapes = {new Rectangle(4,5), new Circle(3), new Circle(7), new Triangle(3,5), 
							new Triangle(5,6), new Triangle(2, 4), new Rectangle(3,5)};
		
		double sumOfAllShapes = 0.0;
		for(Shape s: shapes) {
			sumOfAllShapes += s.computeArea();
		}
		
		System.out.printf("Sum of Areas = %.2f", sumOfAllShapes);
	}
}
