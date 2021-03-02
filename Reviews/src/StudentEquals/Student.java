package StudentEquals;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private String name;
	private double cgpa;
	private LocalDate dateOfAdmission;
	
	Student(String n, double c, LocalDate d){
		this.name = n;
		this.cgpa = c;
		this.dateOfAdmission = d;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student st = (Student) obj;
//		return name.equals(st.name) && cgpa == st.cgpa
//				&& dateOfAdmission.equals(st.dateOfAdmission);
		if(name.equals(st.name) && cgpa == st.cgpa && dateOfAdmission.equals(st.dateOfAdmission))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, cgpa, dateOfAdmission);
	}
	
}
