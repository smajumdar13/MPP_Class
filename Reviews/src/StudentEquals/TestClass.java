package StudentEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		Student s1 = new Student("Sam", 3.4, LocalDate.of(2020, 0, 11));
		Student s2 = new Student("Sam", 3.4, LocalDate.of(2020, 10, 11));
		
		List<Student> st = new ArrayList<>();
		st.add(s1);
		st.add(s2);
		
		System.out.println(s1.equals(s2));

	}

}
