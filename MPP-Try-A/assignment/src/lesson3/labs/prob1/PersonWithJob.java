package lesson3.labs.prob1;


public class PersonWithJob  {
	private Person person;
	public Person getPerson() {
		return person;
	}
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		//super(n);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 	
		/* commented the original solution to test other things
		if(aPerson instanceof PersonWithJob) {
			PersonWithJob p = (PersonWithJob) aPerson;
			boolean isEqual = this.person.getName().equals(p.person.getName()) &&
					this.getSalary()==p.getSalary();
			return isEqual;
		}else if(aPerson instanceof Person) {
			var p = (Person) aPerson;
			return this.person.getName().equals(p.getName());
		}
		return false;*/
		if(!(aPerson instanceof PersonWithJob)) return false;
		System.out.println("hi");
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	private String getName() {
		// TODO Auto-generated method stub
		return person.getName();
	}
	public static void main(String[] args) {
		var p1 = new PersonWithJob("Joe",3000);
		var p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
