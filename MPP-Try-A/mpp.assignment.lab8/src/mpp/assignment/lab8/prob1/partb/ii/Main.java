package mpp.assignment.lab8.prob1.partb.ii;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Supplier<Double> s = () -> Math.random();
		System.out.println(s.get());
	 
	}

}
