package Lesson3.Prob4;

public class Driver {

	public static void main(String[] args) {

		Object[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
		
//		Object[] objects1 = { new House(9000, new Address("Sotherby Rd.", "Austin", "Texas", 77324)), 
//							  new Condo(2, new Address("Eighth St.", "Houston", "Texas", 77458)), 
//							  new Trailer(new Address("City Square", "Fairfield", "Iowa", 55424)) };
//		
//		double totalRent1 = Admin.computeTotalRent(objects1);
//		System.out.println(totalRent1);
	}
}