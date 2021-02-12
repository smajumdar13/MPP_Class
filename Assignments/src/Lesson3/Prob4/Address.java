package Lesson3.Prob4;

public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address(String str, String ct, String st, int z) {
		street = str;
		city = ct;
		state = st;
		zip = z;
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
	
	public int getZip() {
		return zip;
	}
	
	public String getAddress() {
		return street + " " + city + " " + state + " " + zip;
	}
	
	public String toString() {
		return getAddress();
	}
}