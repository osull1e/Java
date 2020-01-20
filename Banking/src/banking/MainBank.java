package banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainBank {
	
	

	public static void main(String[] args) throws FileNotFoundException {
	
		File fi1 = new File("Users");
		Scanner scn = new Scanner(fi1);
		MyList depositlist = new MyList();
		
		
		Person p = null;
		String name;
		String userID;
		int pin;
		
		
	while(scn.hasNext()){
		
		name = scn.next();
		userID = scn.next();
		pin = scn.nextInt();
		//System.out.println(name + " " + userID + " " + pin);
		p = new Person( name, userID, pin);
		depositlist.addOne(p);
		
		}
	
	checkList(depositlist, p);
	
	scn.close();
	
	}

//this is where it broke
	public static boolean checkList(MyList p, Person v){
		Scanner scn1 = new Scanner(System.in);
		
		System.out.println("enter an integer");
		String name = scn1.next();
		v.getName(p);
		//Person John = p.getPerson(0);
		
		System.out.println(v.getName(p));
		
		return false;
		
	}

}
