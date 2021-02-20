package Tries;

import java.util.*;
import java.util.stream.Collectors;

public class Try2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<24; i++) {
			list.add(i);
		}
		list.forEach(System.out::print);
		System.out.println("\n");
		System.out.print("Odd numbers from the Arraylist: ");
		System.out.println(list.stream().filter(x -> x%2!=0).collect(Collectors.toList()));
		System.out.print("Even numbers from the Arraylist: ");
		System.out.println(list.stream().filter(x -> x%2==0).collect(Collectors.toList()));
		System.out.print("Numbers from the Arraylist divisible by 4: ");
		System.out.println(list.stream().filter(x -> x%4==0).collect(Collectors.toList()));
	}

}
