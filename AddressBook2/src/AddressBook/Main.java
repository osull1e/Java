package AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File fi1 = new File("Person.txt");
		Scanner scnFile = new Scanner(fi1);
		Scanner scnSystem = new Scanner(System.in);

		// instantiate address book
		AddressBook adbook = new AddressBook();

		while (scnFile.hasNextLine()) {
			String[] array = new String[3];
			array[0] = scnFile.next();
			array[1] = scnFile.next();
			array[2] = scnFile.next();
			Person p = new Person(array[0], array[1], Integer.parseInt(array[2]));
			adbook.add(p);
			
			//Keep for testing
			// System.out.println(array[2] + array[1] + array[0]);
		}
		//char choice;
		int result = menu();
		System.out.println("You chose " + result);
		while(result <= 5 && !scnFile.hasNextLine()){
			if(result == 1){
			Person p;
			String[] array = new String[3];
			System.out.println("Enter, the contact's first name ");
			array[0] = scnSystem.next();
			System.out.println("Enter the contacts's last name ");
			array[1] = scnSystem.next();
			int id = adbook.getLastID();
			p = new Person(array[0], array[1], (++id));
			adbook.add(p);
			FileWriter writer = null;
			try {
				writer = new FileWriter("Person.txt", true);
				writer.append("\n" + p.toString());
			} catch (IOException e) {
				System.err.println("The file doesn't exist!");
				writer.close();
				System.exit(1);
			}
			finally {
				writer.close();	
			}
			menu();
			
			}

		if(result == 2){
			int choice;
			System.out.println("Enter the User's id that you want to delete: ");
			//choice = scnSystem.nextInt();
			choice = scnSystem.nextInt();
			result = adbook.searchId(choice);
			
			if(result == choice){
				adbook.delete(result);
			}else 
				System.out.println("No user found ");
			menu();
		}

		if(result==3){

			Person per;
			System.out.println("What is the User's Id? ");
			int searchId = scnSystem.nextInt();
			per = adbook.search(searchId);
			if (per != null) {
				System.out.println(per.getfName());
			} else {
			System.out.println("Person not found. ");
			}
			menu();
		}
		else{
			System.exit(0);
		}
	}
		//System.out.println(adbook.toString());

		scnSystem.close();
		}
	
	public static int menu(){
		Scanner kb = new Scanner(System.in);
		int retval = -9;
		System.out.println("Choose\n 1) Add contact \n 2) Delete Contact \n 3) Search Contact \n 4) Exit Program ");
		retval = kb.nextInt();
		return retval;
	}

}
