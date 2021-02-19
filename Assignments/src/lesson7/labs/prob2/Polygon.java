package lesson7.labs.prob2;

public interface Polygon extends ClosedCurve{
	public double[] getLengths();
	
	default double computePerimeter() {
		double[] lengths = getLengths();
		double sum = 0.0;
		for(double len: lengths) {
			sum += len;
		}
		System.out.println("Using polygon method: ");
		return sum;
	}
}
