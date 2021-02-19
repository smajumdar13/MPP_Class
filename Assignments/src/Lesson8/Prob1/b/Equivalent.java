package Lesson8.Prob1.b;

import java.util.Random;
import java.util.function.Supplier;

public class Equivalent {

	public static void main(String[] args) {
//		Supplier<Double> random = () -> Equivalent.random();
		
		
		// Inner class implementation in the Main method
		class RandomNumber implements Supplier<Double> {
			public Double get() {
				return Math.random();
			}
		}
				
		// calling method random() to generate random number
		RandomNumber random = new RandomNumber();
		System.out.println(random.get());
//		System.out.println(random.get());
		
		
		
	}
	
	// inner class in method random()
//	public static double random() {
//		class randomNumber implements Supplier<Double> {
//			public Double get() {
//				Random random = new Random();
//				return random.nextDouble();
//			}
//		}
//		return new randomNumber().get();
//	}
}
