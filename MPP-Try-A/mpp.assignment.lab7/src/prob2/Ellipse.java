package prob2;

public class Ellipse implements ClosedCurve {
	private double semiMajorAxis;
	private double ellipticIntegral;

	/**
	 * @param semiMajorAxis
	 * @param ellipticIntegral
	 */
	public Ellipse(double semiMajorAxis, double ellipticIntegral) {
	
		this.semiMajorAxis = semiMajorAxis;
		this.ellipticIntegral = ellipticIntegral;
	}

	public Ellipse() {

	}

	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * ellipticIntegral;
	}

}
