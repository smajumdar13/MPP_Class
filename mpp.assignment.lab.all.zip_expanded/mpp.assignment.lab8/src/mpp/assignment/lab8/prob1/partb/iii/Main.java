package mpp.assignment.lab8.prob1.partb.iii;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Supplier<Double> s = ()-> MyMath.random();
		System.out.println(s.get());

	}

}
