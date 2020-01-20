package programmingAssignment4;

import java.util.Scanner;// bringing in the java scanner class


public class Person {// Class name
	String firstname; // creating a variable reference firstname to a string
	String lastname; // creating a variable reference lastname to a string
	int age; // creating a variable reference age to an int

	public Person(Scanner sc1) {
		this.firstname = sc1.next();
		this.lastname = sc1.next();
		this.age = sc1.nextInt();
	}

	public Person(String fn, String ln, int age) {
		this.firstname = fn;
		this.lastname = ln;
		this.age = age;
	}

	public String toString() {
		String output;
		output = this.firstname + " " + this.lastname + " " + this.age;
		return output;
	}

	public int compareTo(Person p) {
		if (this.firstname.compareTo(p.firstname) == 0) {
			if (this.lastname.compareTo(p.lastname) == 0) {
				if (this.age == p.age) {
					return 0;
				}
				else if(this.age > p.age) {
					return 1;
				}
				else {
					return -1;
				}
			}
			return this.lastname.compareTo(p.lastname);
		}
		return this.firstname.compareTo(p.firstname);
	}

} // closing person class
