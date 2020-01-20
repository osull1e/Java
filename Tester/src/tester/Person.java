package tester;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 

public class Person implements Comparable<Person> {
	
	String name;
	int age;
	int test;
	
	Person (String name, int age, int test){
		this.name = name;
		this.age = age;
		this.test = test;
	}
	
	public static void main(String args[]) {
		ArrayList<Person> list = new ArrayList<Person>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File("person.txt"));
		}
		catch(FileNotFoundException e) {
			System.out.println("Couldn't find the file, try again");
			System.exit(0);
		}
		while(sc.hasNext()){
			Person p = new Person(sc.next(), sc.nextInt(), sc.nextInt());
			list.add(p);
		}
		for(Person p : list) {
			System.out.println(p.name + ".\nAge: " + p.age + ".\nTest: " + p.test + ".");
		}
		System.out.println();
		Collections.sort(list);
		for(Person p : list) {
			System.out.println(p.name + ".\nAge: " + p.age + ".\nTest: " + p.test + ".");
		}
		System.out.println();
		Person newPerson = listContainsJohn(list);
		if(newPerson != null) {
			System.out.println(newPerson.name + ".\nAge: " + newPerson.age + ".\nTest: " + newPerson.test + ".");
		}
		else {
			System.err.println("John isn't present. My apologies");
		}
	}

	@Override
	public int compareTo(Person p) {
		if(this.age > p.age) {
			return 1;
		} else if (this.age < p.age) {
			return -1;
		}
		return 0;
	}
	
	/**
	 * @author Eric O'Sullivan
	 * @param list A list of Person objects that may or may not contain John
	 * @return John if found, null otherwise
	 */
	public static Person listContainsJohn(ArrayList<Person> list) {
		for(Person p : list) {
			if(p.name.equals("John")) {
				return p;
			}
		}
		return null;
	}

}
