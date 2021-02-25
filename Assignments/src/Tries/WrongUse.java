package Tries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrongUse {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(7);
		
//		List<Number> nums = ints; //cannot allocate directly, but can use wildcard
//		nums.add(4.55);
		
		
		List<? extends Number> nums = ints;
		
		List<Double> dbls = new ArrayList<>();
		dbls.add(2.4);
		dbls.add(3.5);
//		
//		nums.addAll(dbls);
		
		System.out.println(nums);
		
		
		List<Number> num = new ArrayList<>();
		num.add(2);
		num.add(4);
		
		List<Integer> intg = new ArrayList<>();
		intg.add(3);
		intg.add(7);
		
		List<Double> dou = new ArrayList<>();
		dou.add(3.4);
		dou.add(9.2);
		
		num.addAll(dou);
		num.addAll(intg);
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
//		Integer[] ints = new Integer[] {1,2,3};
//		Number[] arrs = ints;
		
	}

}
