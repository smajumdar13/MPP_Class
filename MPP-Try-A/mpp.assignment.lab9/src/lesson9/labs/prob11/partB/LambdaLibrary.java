package lesson9.labs.prob11.partB;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, List<String>, Double, String>
		FILTERED_EMPLOYEE = (empList,lastNamefilters,salary)->
		empList.stream()
		.filter(e->e.getSalary()>salary)
		.filter(e->lastNamefilters.contains(Optional.ofNullable(e.lastName).orElse(" ").substring(0,1).toLowerCase()))
        .map(x->x.getFirstName() +" "+ x.lastName)
        .sorted(String::compareToIgnoreCase)
        .collect(Collectors.joining(", "));
	


}
