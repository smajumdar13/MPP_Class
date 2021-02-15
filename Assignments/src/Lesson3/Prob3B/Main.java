package Lesson3.Prob3B;

public class Main {

	public static void main(String[] args) {
		Circle ci1 = new Circle(3);
		Cylinder cy1 = new Cylinder(3, 6);
		Cylinder cy2 = new Cylinder(5, 8);
		
//		System.out.println(ci1);
//		System.out.println(cy1);
		// Wrong way as they are different objects, but still works
		Object[] o = {cy1, cy2, ci1};
		for(Object obj: o) {
			System.out.println(obj);
		}
	}
}