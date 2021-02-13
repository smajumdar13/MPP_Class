package prob2;

public final class EquilateralTriangle implements Polygon {
	final private double side1;
	final private double side2;
	final private double side3;

	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public EquilateralTriangle(double side1, double side2, double side3) {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		double[] sides = new double[] { side1, side2, side3 };
		return sides;
	}

}
