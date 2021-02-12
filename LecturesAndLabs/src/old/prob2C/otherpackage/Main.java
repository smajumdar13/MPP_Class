package old.prob2C.otherpackage;



import java.util.*;

import old.prob2C.Attendance;
import old.prob2C.Section;
import old.prob2C.Student;
import old.prob2C.StudentSection;

public class Main {

	public static void main(String[] args) {
		
		//create some students and add some sections
		Student bob = new Student("1", "Bob");
		bob.addSection("Biology", 2);
		bob.addSection("Math", 1);
		
		Student rich = new Student("2", "Rich");
		rich.addSection("Biology", 2);
		rich.addSection("English", 1);
		
		Student pam = new Student("3", "Pam");
		pam.addSection("English", 1);
		pam.addSection("Math", 1);
		pam.addSection("Biology", 2);
		
		Student sam = new Student("3", "Sam");
		sam.addSection("English", 1);
		sam.addSection("Math", 1);
		
		
		List<Student> students = Arrays.asList(bob, rich, pam, sam);
		
		//display all students who are taking 2nd section of Biology
		StringBuilder output = new StringBuilder();
		for(Student st : students) {
			List<StudentSection> studSects = st.getStudentSections();
			for(StudentSection sts : studSects) {
				if(sts.getSection().getCourse().equals("Biology") 
					&& sts.getSection().getSectionNum()==2) {
						output.append(st.toString() + "\n");
				}
			}
		}
		System.out.println(output.toString());
		
		//set attendance for bob, rich, sam, pam
		for(StudentSection s : bob.getStudentSections()) {
			s.setAttendance(Attendance.GOOD);
		}
		for(StudentSection s : rich.getStudentSections()) {
			s.setAttendance(Attendance.OK);
		}
		for(StudentSection s : sam.getStudentSections()) {
			s.setAttendance(Attendance.GOOD);
		}
		for(StudentSection s : pam.getStudentSections()) {
			s.setAttendance(Attendance.POOR);
		}
		//print attendance record
		for(Student st : students) {
			List<StudentSection> theSections = st.getStudentSections();
			System.out.println(st.getId() + ":" + st.getName() + ":");
			System.out.println("  " + theSections);
		}
		
		//print all sections 
		List<Section> allSections = new ArrayList<>();
		for(Student st: students) {
			for(StudentSection ss : st.getStudentSections()) {
				Section next = ss.getSection();
				if(!allSections.contains(next))
					allSections.add(next);
			}
		}
		System.out.println(allSections);
		
		//print all sections in which Bob is enrolled
		for(Section sec: allSections) {
			for(StudentSection ss: sec.getStudentSections()) {
				if(ss.getStudent().getName().equals("Bob")) {
					System.out.println(ss.getSection());
				}
			}
		}
		
		
		
		

	}

}
