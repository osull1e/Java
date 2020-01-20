package programmingAssignment4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author Eric O'Sullivan
 * @date 4/319/16
 * @project 3: Address Book
 */
public class MyMian {

	public static void main(String[] args) throws FileNotFoundException { //main method that begins the program
		File myfi = new File("ListOfName.txt"); // allocating memory for my file object	
		File myfi2 = new File("ListOfName2.txt");
		MyLinkedList alist = new MyLinkedList(); // allocating memory for my linked list obj
		//System.out.println("Would you like to add a person to the list? \n (Y)es or (N)o ");
		Scanner userChoice = new Scanner(System.in);
		
		
		
		alist.addfromfile(myfi);//calling addfromfile function to be run
		alist.printlist();//calling the method to print the alist
		
		}// closing main method

	}// closing MyMain class

