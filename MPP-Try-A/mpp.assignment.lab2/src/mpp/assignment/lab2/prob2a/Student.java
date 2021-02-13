package mpp.assignment.lab2.prob2a;

public class Student {
	private String name;
	private GradeReport gradeReport;
	public Student(String name){
		this.name = name;
		gradeReport = new GradeReport(this);
	}
	public GradeReport getGradeReport() {
		return gradeReport;
	}
	public String getName() {
		return name;
	}
}
