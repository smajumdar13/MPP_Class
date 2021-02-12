package old.prob2Cvar;
import java.util.*;
public class Section {
	String course;
	public String getCourse() {
		return course;
	}
	public int getSectionNum() {
		return sectionNum;
	}
	public List<StudentSection> getStudentSections() {
		return studentSections;
	}
	int sectionNum;
	List<StudentSection> studentSections = new ArrayList<>();
	//Ensures the "1" in 1..*
	public Section(String course, int secNum, String id, String name) {
		this.course = course;
		this.sectionNum = secNum;
		addStudent(id, name);
	}
	//This constructor is only for use within this package
	//It is used by the Student method addSectionWeak 
	//but should not be (and now cannot be) called from outside
	Section(String course, int secNum) {
		this.course = course;
		this.sectionNum = secNum;
	}
	public void addStudent(String id, String name) {
		Student s = new Student(id, name);
		studentSections.add(new StudentSection(s, this));
		//this ensures that when a new student is added, a new studentsection
		//is added to the student
		s.addSectionWeak(this.course, this.sectionNum);
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
