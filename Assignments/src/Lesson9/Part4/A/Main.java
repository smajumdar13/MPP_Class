package Lesson9.Part4.A;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		
		final Stream<Integer> primes = Stream.iterate(2,Main::nextPrime );

		primes.limit(20).collect(Collectors.toList()).forEach(System.out::println);
		//primes.limit(5).collect(Collectors.toList()).forEach(System.out::println);

	}
	public static int nextPrime(int seed) {
		int nextPrime=++seed;
		boolean isPrime =false;
		while(!isPrime) {
			isPrime =true;
			for(int i=2;i<nextPrime;i++) {
				if(nextPrime%i==0) {
					isPrime=false;
					nextPrime++;
					break;
				}
			}
		}
		return nextPrime;
	}
}
