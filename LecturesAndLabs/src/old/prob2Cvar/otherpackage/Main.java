package old.prob2Cvar.otherpackage;

import java.util.*;

import old.prob2Cvar.Section;
import old.prob2Cvar.Student;
import old.prob2Cvar.StudentSection;

public class Main {

	public static void main(String[] args) {
		Student bob = new Student("1", "Bob");
		
		bob.addSection("bio", 1);
		List<StudentSection> list = bob.getStudentSections();
		System.out.println(list);
		Section section = list.get(0).getSection();
		System.out.println(section.getStudentSections());
		
		//create some sections and add some students
		/*
		Section section1 = new Section("Biology", 1, "11", "Rich");
		section1.addStudent("12", "anne");
		Section section2 = new Section("Math", 1, "11", "Rich");
		section2.addStudent("13", "tom");
		section2.addStudent("14", "phil");
		
		List<Student> allStudents = new ArrayList<>();
		List<StudentSection> studSecs = section1.getStudentSections();
		studSecs.addAll(section2.getStudentSections());
		for(StudentSection ss : studSecs) {
			if(!allStudents.contains(ss.getStudent())) {
				allStudents.add(ss.getStudent());
			}
		}
		System.out.println(allStudents);
		
		
		
		StringBuilder output = new StringBuilder();
		for(Student st : allStudents) {
			List<StudentSection> studSects = st.getStudentSections();
			for(StudentSection sts : studSects) {
				if(sts.getSection().getCourse().equals("Biology") 
					&& sts.getSection().getSectionNum()==1) {
						output.append(st.toString() + "\n");
				}
			}
		}
		System.out.println(output.toString());
		
		
		//find students who are in 
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
		StringBuilder output2 = new StringBuilder();
		for(Student st : students) {
			List<StudentSection> studSects = st.getStudentSections();
			for(StudentSection sts : studSects) {
				if(sts.getSection().getCourse().equals("Biology") 
					&& sts.getSection().getSectionNum()==2) {
						output2.append(st.toString() + "\n");
				}
			}
		}
		System.out.println(output2.toString());
		
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
		
		*/
		
		

	}

}
