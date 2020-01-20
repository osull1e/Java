package bintree;

import java.util.*;

public class Person {
	String firstName;
	String lastName;
	int age;

	public Person(Scanner sc1) {
		this.firstName = sc1.next();
		this.lastName = sc1.next();
		this.age = sc1.nextInt();
	}

	public String toString() { // allows Person objects to be printed
		return ("\n Name: " + firstName + " " + lastName + "\n Age: " + age);

	}

}
