package lesson3.labs.prob4;

public class House extends Property {
	private int lotSize;
	private double rent;
	public House(int lotSize) {		
		this.lotSize = lotSize;
	}
	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		 rent = 0.1 * lotSize;;
		return rent;
	}
	
}
