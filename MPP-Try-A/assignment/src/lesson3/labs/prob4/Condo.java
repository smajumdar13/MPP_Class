package lesson3.labs.prob4;

public class Condo extends Property {
	private double numOfFloors;
	private double rent;
	public Condo(double numOfFloors) {
		
		this.numOfFloors = numOfFloors;
	}
	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		rent= numOfFloors * 400;;
		return rent;
	}

}
