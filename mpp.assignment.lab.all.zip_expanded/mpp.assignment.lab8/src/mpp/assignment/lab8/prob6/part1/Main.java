package mpp.assignment.lab8.prob6.part1;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class Main {

	public static void main(String[] args) {

		// prob6.partA.

		Function<Employee, String> getName1 = e -> e.getName();
		// Method reference type: Class::instanceMethod
		Function<Employee, String> getName2 = Employee::getName;

		// prob6.partB.
		BiConsumer<Employee, String> setName1 = (e, s) -> e.setName(s);
		// Method reference type: Class::instanceMethod
		BiConsumer<Employee, String> setName2 = Employee::setName;

		// prob6.partC
		Comparator<String> compareTo1 = (String s1, String s2) -> s1.compareTo(s2);
		// Method reference type: Class::instanceMethod
		Comparator<String> compareTo2 = String::compareTo;

		// prob6.partD
		ToDoubleBiFunction<Integer, Integer> pow1 = (Integer x, Integer y) -> Math.pow(x, y);
		// Method reference type: Class::staticMethod
		ToDoubleBiFunction<Integer, Integer> pow2 = Math::pow;

		// prob6.partE
		ToDoubleFunction<Apple> getWeight1 = a -> a.getWeight();
		// Method reference type: Class::instanceMethod
		ToDoubleFunction<Apple> getWeight2 = Apple::getWeight;

		// prob6.partF
		ToIntFunction<String> parseInt1 = (String x) -> Integer.parseInt(x);
		// Method reference type: Class::staticMethod
		ToIntFunction<String> parseInt2 = Integer::parseInt;

		// prob6.partG
		
		EmployeeNameComparator comp = new EmployeeNameComparator();
		Comparator<Employee> compare1 =  (e1, e2) -> comp.compare(e1,e2);
		// Method reference type: object::instanceMethod
		Comparator<Employee> compare2 =  comp::compare;

	}

}
