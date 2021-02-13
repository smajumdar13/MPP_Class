package mpp.assignment.lab8.prob6.part2;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class Examples {
	void evaluator() {

		/// test your other method references

		// prob6.partA.
		
		// Method reference type: Class::instanceMethod
		Function<Employee, String> getName2 = Employee::getName;
		
		System.out.println(getName2.apply(new Employee("Steve", 100000)));

		// prob6.partB.
		
		// Method reference type: Class::instanceMethod
		BiConsumer<Employee, String> setName2 = Employee::setName;

		Employee emp1  = new Employee("Steve", 100000);
		setName2.accept(emp1, "New Steve");
		System.out.println(emp1.getName());
		
		// prob6.partC
		
		// Method reference type: Class::instanceMethod
		Comparator<String> compareTo2 = String::compareTo;
		System.out.println(compareTo2.compare("Steve", "Job"));

		// prob6.partD
		
		// Method reference type: Class::staticMethod
		ToDoubleBiFunction<Integer, Integer> pow = Math::pow;
		System.out.println(pow.applyAsDouble(3, 3));

		// prob6.partE
		
		// Method reference type: Class::instanceMethod
		ToDoubleFunction<Apple> getWeight2 = Apple::getWeight;
		
		System.out.println(getWeight2.applyAsDouble(new Apple(3.0)));

		// prob6.partF
		
		// Method reference type: Class::staticMethod
		ToIntFunction<String> parseInt2 = Integer::parseInt;
		System.out.println(parseInt2.applyAsInt("3"));
		
		
		// prob6.partG

		EmployeeNameComparator comp = new EmployeeNameComparator();
		
		// Method reference type: object::instanceMethod
		Employee emp2  = new Employee("Steve", 1000);
		Employee emp3  = new Employee("Steve", 1000);
		Comparator<Employee> compare2 = comp::compare;
		System.out.println(compare2.compare(emp2, emp3));
	}
}
