package old.prob2C;

import java.util.ArrayList;
import java.util.List;



public class Student {
	private String id;
	private String name;
	private List<StudentSection> studentSections = new ArrayList<>();
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		
	}
	public void addSection(String course, int sectionNum){
		studentSections.add(
			new StudentSection(this, new Section(course, sectionNum, id, name)));
	}
	
	@Override
	public String toString() {
		return "(" + id + ":" + name + ")";
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Student st = (Student)ob;
		return st.id.equals(id) && st.name.equals(name);
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<StudentSection> getStudentSections() {
		return studentSections;
	}
}
