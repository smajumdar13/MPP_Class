package DefiningEnums;

public class TestCase {

	public static void main(String[] args) {
		System.out.println("Height: " + Dim.HEIGHT.val);
		System.out.println("Width: " + Dim.WIDTH.val);
		System.out.println("Length: " + Dim.LENGTH.val);
		System.out.printf("Area: %.2f\n",  Dim.LENGTH.val*Dim.WIDTH.val);
		System.out.printf("Volume: %.2f\n", Dim.WIDTH.val*Dim.HEIGHT.val*Dim.LENGTH.val);
		
	}

}
