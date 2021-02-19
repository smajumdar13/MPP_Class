package Lesson8.Prob1.b;

import java.util.function.Supplier;

public class Eq2 {

	public static void main(String[] args) {
		System.out.println(new Supplier<Double>() {
			@Override
			public Double get() {
				return Math.random();
			}
		}
//		.get()
		);
	}
}
