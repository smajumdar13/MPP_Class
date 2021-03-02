package lesson7.exercise_5;
import java.util.*;

//Why doesn't this equals method work?
public class Person {
	private String name;
	// added S@rv
	private int age;
	
	Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
//	Original equals *Uncomment below lines*
//	public boolean equals(Person p) {
//		if(p == null) return false; 
////		we haven't checked if p is an instance of object Person
////		so we need to implement the instanceOf strategy or the 
////		same-class strategy like below
////		*uncomment below line*		
////		if(!(p instanceof Person)) return false;
//		Person q = (Person)p;
//		boolean isEqual = this.name.equals(q.name);
//		return isEqual;
//	}
	@Override
	public boolean equals(Object p) {
		if(p == null) return false;
		if(!(p instanceof Person)) return false;
		Person q = (Person) p;
		return (name.equals(q.name) && age==q.age);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Joe", 24);
		Person p2 = new Person("Joe", 24);
		System.out.println(p1.equals(p2));
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Person))
//			return false;
//		Person other = (Person) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}
	
	
}
