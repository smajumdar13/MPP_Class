package lesson9.labs.prob4.partB;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {

	public void printFirstNPrimes(int i) {
		final Stream<Integer> primes = Stream.iterate(2,PrimeStream::nextPrime );
		primes.limit(i).collect(Collectors.toList()).forEach(System.out::println);
		
	}
	private static int nextPrime(int seed) {
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
