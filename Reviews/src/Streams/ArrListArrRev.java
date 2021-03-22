package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrListArrRev {
	public static void main(String args[]) {
		List<Integer> arrList = Arrays.asList(1,2,3,4,5);
		List<int[]> arr = arrList.stream().map(int[]::new).collect(Collectors.toList());
		List<String> newArrList = arr.stream().map(Arrays::toString).collect(Collectors.toList());
		
		System.out.println(arrList);
		System.out.println(arr);
		System.out.println(newArrList);
	}
}
