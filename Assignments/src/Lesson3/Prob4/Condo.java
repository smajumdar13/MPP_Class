package Lesson3.Prob4;

public class Condo extends Property {
	private double numberOfFloors;
	private Address address;
	
	Condo(double floors){
		numberOfFloors = floors;
	}
	
	Condo(double floors, Address add) {
		address = add;
		numberOfFloors = floors;
	}
	
	public double getNumberOfFloors() {
		return numberOfFloors;
	}

	double computeRent() {
		return 400 * numberOfFloors;
	}

	public Address getAddress() {
		return address;
	}
}