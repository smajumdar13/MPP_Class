import java.util.Arrays;
import java.util.List;

public class we {

	public static void main(String[] args) {
		Product p1 = new Product("Ovaltine");
		Product p2 = new Product("Milo");
		Product p3 = new Product("Rilo");
				
		Product[] lst = new Product[] {p1, p2, p3};
		List<Product> lst2 = Arrays.asList(p1, p2, p3);
		System.out.println(isInList(lst2, lst[2]));

	}
	
	public static boolean isInList
	(List<Product> lst, Product target) {
		boolean res = false;
		for(Product p: lst) {
			if(p.equals(target)) {
				res = p.equals(target);
				break;
			}
		}
		return res;
	}
}
