package FlattenArrays;
import java.util.Arrays;

public class FlattenArray {

	public static void main(String[] args) {
		int[][] ints = {{1,3}, {0}, {4,5,9}};
		System.out.println(Arrays.toString(flattenArrayFunc(ints)));
		System.out.println(Arrays.toString(flattenArrayImp(ints)));
	}
	
	public static int[] flattenArrayFunc(int[][] ints){
		return Arrays.stream(ints).flatMapToInt(x -> Arrays.stream(x)).toArray();
	}

	public static int[] flattenArrayImp(int[][] ints){
		int size =0;
		for(int[] i: ints){
			size += i.length;
		}
		int[] newArr = new int[size];
		size = 0;
		for(int[] arr: ints){
			for(int i: arr){
				newArr[size++] = i;
			}
		}
		return newArr;
	}
}
