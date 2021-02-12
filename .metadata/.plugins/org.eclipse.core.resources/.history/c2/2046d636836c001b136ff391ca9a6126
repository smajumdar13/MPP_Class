package Lesson3.Prob2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Apartment[] a1 = {new Apartment(300), new Apartment(350), new Apartment(375), new Apartment(435)};
		Apartment[] a2 = {new Apartment(325), new Apartment(415), new Apartment(350), new Apartment(525)};
		Apartment[] a3 = {new Apartment(455), new Apartment(585), new Apartment(499), new Apartment(679)};
		
		Building[] b = { new Building(Arrays.asList(a1), 400), new Building(Arrays.asList(a2), 499), new Building(Arrays.asList(a3), 535)};
		
		LandlordInfo l = new LandlordInfo(Arrays.asList(b));
		
		System.out.println("Total profit is: " + l.totalProfit());
	}
}