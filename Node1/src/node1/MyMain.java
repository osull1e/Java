package node1; // using the package node1

import java.io.File;
import java.io.FileNotFoundException;

public class MyMain {//Class name

	public static void main(String[] args) throws FileNotFoundException { //main method that begins the program
		File myfi = new File("people.txt"); // allocating memory for my file object
		
		MyLinkedList alist = new MyLinkedList(); // allocating memory for my linked list obj
		alist.addNode();//adding a node to alist
		alist.addfromfile(myfi);//adding to alist from a file (alist being an array)
		alist.printlist();//calling the method to print the alist
		alist.delete();
		MyLinkedList blist = new MyLinkedList(); // allocating memory for my linked list obj
		blist.addNode();//adding a node to alist
		blist.addfromfile(myfi);//adding to alist from a file (alist being an array)
		blist.printlist();//calling the method to print the alist
		blist.delete();
	}// closing main method

}// closing MyMain class
