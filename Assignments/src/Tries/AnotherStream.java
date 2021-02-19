package Tries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AnotherStream {

	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,3}, {0}, {4,5,9}};
//		System.out.println(flattenArray(arr));
//		
//		int[] newArray = Stream.of(arr)
//							   .flatMapToInt(IntStream::of)
//							   .toArray();
//
//		System.out.println("[ ");
//		for(int i: newArray) {
//			System.out.print(i+" ");
//		}
//		System.out.println("]");
		
		System.out.println(Arrays.toString(flattenArray1(arr)));
		System.out.println(Arrays.toString(flattenArray2(arr)));
		
	}
	
//	static ArrayList<Integer> flattenArray(int[][] array){
//		ArrayList<Integer> temp = new ArrayList<>();
//		for(int i=0; i<array.length; i++)
//			for(int j=0; j<array[i].length; j++) {
//				temp.add(array[i][j]);
//			}
//		return temp;	
//	}
	
	public static int[] flattenArray1(int[][] array) {
		int size = 0;
		for(int[] i: array) {
			size += i.length;
		}
		int[] newArr = new int[size];
		size = 0;
		for(int[] i: array) {
			for(int j: i) {
				newArr[size++] = j;
			}
		}
		return newArr;	
	}

	public static int[] flattenArray2(int[][] array) {
		return Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).toArray();
	}
}
