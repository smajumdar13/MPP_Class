package lesson3.labs.prob4;

public abstract class Property {
	protected Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public abstract double computeRent();
}
