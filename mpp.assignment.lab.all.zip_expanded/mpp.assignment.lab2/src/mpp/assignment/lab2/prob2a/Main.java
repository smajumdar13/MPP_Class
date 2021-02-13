package mpp.assignment.lab2.prob2a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  var student = new Student("arjun");
	  var grade = student.getGradeReport();
	  grade.setGrade("A");
	  System.out.println(student.getName() + " has grade " + student.getGradeReport().getGrade());
	}

}
