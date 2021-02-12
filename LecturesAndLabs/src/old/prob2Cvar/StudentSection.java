package old.prob2Cvar;

public class StudentSection {
	Attendance attendance;
	Student student;
	Section section;
	public StudentSection(Student st, Section sec) {
		student = st;
		section = sec;
	}
	public void setAttendance(Attendance a) {
		attendance = a;
	}
	public Attendance getAttendance() {
		return attendance;
	}
	public Student getStudent() {
		return student;
	}
	public Section getSection() {
		return section;
	}
	
	@Override
	public String toString() {
		return "<" + student + ":" + section + " -- attendance:" + attendance + ">";
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		StudentSection ss = (StudentSection)ob;
		return ss.student.equals(student) && ss.section.equals(section);
	}
	
}
