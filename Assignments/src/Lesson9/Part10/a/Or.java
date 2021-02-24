package Lesson9.Part10.a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
//		someSimpleIsTrueReduce(list);
//		someSimpleIsTrue(list);
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}
	
	public boolean someSimpleIsTrueReduce(List<Simple> list) {
		return list.stream().map(s -> s.flag).reduce(false, (f1, f2) -> f1 || f2);
	}

}
