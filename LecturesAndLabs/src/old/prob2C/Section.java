package old.prob2C;
import java.util.*;
public class Section {
	String course;
	int sectionNum;
	public String getCourse() {
		return course;
	}
	public int getSectionNum() {
		return sectionNum;
	}
	public List<StudentSection> getStudentSections() {
		return studentSections;
	}
	
	List<StudentSection> studentSections = new ArrayList<>();
	//Ensures the "1" in 1..*
	Section(String course, int secNum, String id, String name) {
		this.course = course;
		this.sectionNum = secNum;
		addStudent(id, name);
	}
	public void addStudent(String id, String name) {
		studentSections.add(new StudentSection(new Student(id, name), this));
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Section sect = (Section)ob;
		return sect.course.equals(course) && sect.sectionNum == sectionNum;
	}
	@Override
	public String toString() {
		return "[" + course + ", " + sectionNum +"]";
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("1", "Pam");
		Student s2 = new Student("1", "Pam");
		s1.addSection("Bio", 1);
		s2.addSection("Bio", 1);
		StudentSection ss1 = s1.getStudentSections().iterator().next();
		StudentSection ss2 = s2.getStudentSections().iterator().next();
		System.out.println(ss1.equals(ss2));
		
	}
}
