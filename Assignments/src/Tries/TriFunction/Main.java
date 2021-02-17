package Tries.TriFunction;

public class Main {
	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> f = 
				(x, y, z) -> x+y+z;
				System.out.println(f.apply(2, 3, 4));

	}
}
