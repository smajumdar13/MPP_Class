package Tries;

import java.util.ArrayList;
import java.util.List;

public class WrongUse {

	public static void main(String[] args) {
//		List<Integer> ints = new ArrayList<>();
//		ints.add(3);
//		ints.add(7);
		
//		List<Number> nums = ints;
//		nums.add(4.55);
			
//		System.out.println(nums);
		
		Integer[] ints = new Integer[] {1,2,3};
		Number[] arrs = ints;
		
	}

}
