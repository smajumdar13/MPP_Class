package Tries.EmpSal;

public class Address {
	private String street; private String city; private String state; 	private int zip;
	
	public Address(String str, String ct, String st, int z) {
		this.street = str; this.city = ct; this.state = st; this.zip = z;
	}

	public String getStreet() {return street;}

	public String getCity() {return city;}

	public String getState() {return state;}

	public int getZip() {return zip;}	
}