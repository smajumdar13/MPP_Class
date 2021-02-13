package mpp.assignment.lab8.prob1.partb.iii;

import java.util.Random;
import java.util.function.Supplier;

public class MyMath {
	
	public static double random() {
		class randomGenerator implements Supplier<Double>{
			@Override
			public Double get() {
				Random random = new Random();
			    return random.doubles(0.0, 1.0).findFirst().getAsDouble();
				
				
			}
		}
		return new randomGenerator().get();
	}

}
