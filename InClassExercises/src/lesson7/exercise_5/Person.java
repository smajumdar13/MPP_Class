package lesson7.exercise_5;
import java.util.*;

//Why doesn't this equals method work?
public class Person {
	private String name;
	Person(String n) {
		this.name = n;	
	}
	
	public boolean equals(Person p) {
		if(p == null) return false; 
//		we haven't checked if p is an instance of object Person
//		so we need to implement the instanceOf strategy or the 
//		same-class strategy like below
//		*uncomment below line*		
//		if(!(p instanceof Person)) return false;
		Person q = (Person)p;
		boolean isEqual = this.name.equals(q.name);
		return isEqual;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Joe");
		Person p2 = new Person("Joe");
		System.out.println(p1.equals(p2));
	}
	
	
}
