package node1; // using the package node1
import java.util.Scanner;// bringing in the java scanner class

public class Person {//Class name
	String firstname; // creating a variable reference firstname to a string
	String lastname; // creating a variable reference lastname to a string
	int age; // creating a variable reference age to an int
	
	public Person(){ // person constructor
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the first name of the new perosn");
		firstname = kb.next();
		System.out.println("Enter the last name of the new person");
		lastname = kb.next();
		System.out.println("Enter the age of the new person");
		age = kb.nextInt();
	} // closing Person constructor
	public Person(Scanner sc1){
		this.firstname = sc1.next();
		this.lastname = sc1.next();
		this.age = sc1.nextInt();
	}
	public Person(String fn, String ln, int age){
		this.firstname = fn;
		this.lastname = ln;
		this.age = age;
	}
	public String toString(){
		String output;
		output = this.firstname + " " + this.lastname + " " + this.age;
		return output;
	}

} // closing person class
