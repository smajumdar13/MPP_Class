package lesson3.labs.prob4;

public class Address {
	private String street;
	public Address(String street, String city, String state, String zip) {		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	private String city;
	private String state;
	private String zip;
}
