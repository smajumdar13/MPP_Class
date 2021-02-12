package lesson3.labs.prob1;

public class PersonWithJob extends Person {
	
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPersonWithJob) {
		if(aPersonWithJob == null) return false; 
		if(!(aPersonWithJob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPersonWithJob;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		// while comparing p1 with p2, the boolean function isEqual 
		// compares the name and salary of both objects, where p2 doesnot
		// have a salary, and thus returns false
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		// while comparing p2 with p1, equals function compares the names
		// of the objects, where both return equal, and thus print true
	}


}
