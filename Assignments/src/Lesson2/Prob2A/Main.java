package Lesson2.Prob2A;

public class Main {

	public static void main(String[] args) {
//		Student st = new Student("Bob");
//		st.getGrade().addGrade("A");
//		System.out.println(st);
		
		Student[] stu = new Student[6];
		stu[0] = new Student("Sam");
		stu[0].getGrade().addGrade("B");
		stu[1] = new Student("Rob");
		stu[1].getGrade().addGrade("A");
		stu[2] = new Student("John");
		stu[2].getGrade().addGrade("B");
		stu[3] = new Student("Rose");
		stu[3].getGrade().addGrade("C");
		stu[4] = new Student("Alan");
		stu[4].getGrade().addGrade("A");
		stu[5] = new Student("Missy");
		stu[5].getGrade().addGrade("A");
		
		for(Student s: stu) {
			System.out.println(s);
		}
	}
}