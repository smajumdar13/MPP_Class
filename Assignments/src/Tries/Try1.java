package Tries;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Try1 {
	
	public static void main(String[] args) {
//		Student s1 = new Student("000-11-0919", "Anna");
//		Student s2 = new Student("000-11-0919", "Anna");
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		
//		String s = "Hello.";
//		int i = s.indexOf('e');
//		System.out.println(i);
		
		int sum = 0;
		var nums = Arrays.asList(1,2,3);
//		nums.forEach(n -> {
//			sum = 0;
//			sum += n;
//			System.out.println(sum);
//			return sum;
//		});
//		System.out.println(sum);
		
		var sum1 = IntStream.of(1,2,3).sum();
		System.out.println(sum1);
		
	}
}
