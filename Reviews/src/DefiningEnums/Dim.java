package DefiningEnums;

public enum Dim {
	LENGTH(2.0),
	WIDTH(1.5),
	HEIGHT(2.2);
	double val;

	Dim(double d) {
		val = d;
	}
	
	public double val() {
		return val;
	}
	
}
