package Lesson9.Part4.B;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {

	public void printFirstNPrimes(long n) {
		final Stream<Integer> primeList = Stream.iterate(2,PrimeStream::prime );
		primeList.limit(n).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	private static int prime(int x) {
		int nextPrime = ++x;
		boolean isPrime = false;
		while(!isPrime) {
			isPrime = true;
			for(int i = 2; i < nextPrime; i++) {
				if(nextPrime % i == 0) {
					isPrime=false;
					nextPrime++;
					break;
				}
			}
		}
		return nextPrime;
	}
}
