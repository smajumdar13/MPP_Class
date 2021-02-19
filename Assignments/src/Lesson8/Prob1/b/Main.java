package Lesson8.Prob1.b;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

//		i.	() -> Math.random();

//		ii. Implementation into code:
			Supplier<Double> random = () -> Math.random();
			System.out.println(random.get());

	}
}
