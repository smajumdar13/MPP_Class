package Lesson3.Prob4;

public class Trailer extends Property {
	private final int rent = 500;
	private Address address;
	
	Trailer(){
		
	}
	
	Trailer(Address add) {
		address = add;
	}

	public double computeRent() {
		return rent;
	}

	public Address getAddress() {
		return address;
	}
}