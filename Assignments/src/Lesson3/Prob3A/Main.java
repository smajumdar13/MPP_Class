package Lesson3.Prob3A;

public class Main {

	public static void main(String[] args) {
		Circle ci1 = new Circle(3);
		Cylinder cy1 = new Cylinder(3, 6);
		
		System.out.println(ci1);
		System.out.println(cy1);
		
		/* Here in this problem, it does not seem right as Circle inherits from Cylinder
		 * since it should be the other way round. Circle and cylinder have radius, and area
		 * in common, and cylinder has height and volume added to its attribute and behavior
		 * because of which cylinder should inherit from circle instead. Moreover, to call 
		 * computeArea() in circle, it is required to create a different constructor in
		 * cylinder.
		 */
	}
}