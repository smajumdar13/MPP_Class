package Lesson2.Prob2A;

public class Student {
	private String name;
	private GradeReport report;
	
	public Student(String name) {
		this.name = name;
		report = new GradeReport(this);	
	}
	
	public String getName() {
		return name;
	}
	
	public GradeReport getGrade() {
		return report;
	}

	@Override
	public String toString() {
		return "Name: " + name + ". Grade: " + report;
	}
}