package Lesson2.Prob2A;
import java.util.*;

public class GradeReport {
	private Student student;
	private String grade;
	
	public GradeReport(String grade) {
		this.grade = grade;
	}
	
	public void addGrade(String gr) {
		this.grade = gr;
	}
	
	GradeReport(Student st) {
		this.student = st;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student st) {
		this.student = st;
	}
	
	public String toString() {
		return grade;
	}
}