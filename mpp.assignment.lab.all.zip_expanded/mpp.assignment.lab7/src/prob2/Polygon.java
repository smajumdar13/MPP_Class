package prob2;

public interface Polygon extends ClosedCurve {
	double[] getSides();
	default double computePerimeter() {
		double sumOfSides=0;
		for(double side:getSides()) {
			sumOfSides+= side;
		}
		return sumOfSides;
	}
}
