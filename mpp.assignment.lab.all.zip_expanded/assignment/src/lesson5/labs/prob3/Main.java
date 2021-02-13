package lesson5.labs.prob3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = { new Triangle(4,5),new Rectangle(3,4),new Circle(5)};
		double sumofAreas=0;
		for(Shape shape: shapes) {
			sumofAreas+=shape.computeArea();
		}
		System.out.println("Sum of Areas = "+ String.format("%.2f",sumofAreas));

	}

}
