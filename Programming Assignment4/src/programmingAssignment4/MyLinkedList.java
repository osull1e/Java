package programmingAssignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class MyLinkedList {// Class name
	public static int size = 0; // creating variable size as an int
	Node<Person> lprintNode;// creating a method to print an array
	Node<Person> lnewNode;// create a new node to add to the array <person>
	Node<Person> listhead; // creating a node for the array called listhead
	Node<Person> listtail; // creating a node for the array called listtail
	Person p;//
	Node<Person> movingPointer;//creating a moving pointer to be able to traverse the nodes

	public MyLinkedList() { // Creating the default constructor (no params)
		listhead = null; // creating the varaible listhead
		listtail = null; // creating the variable lasttail
	}// closing constructor

	public void addfromfile(File myfi) throws FileNotFoundException {// method
															
		Scanner sc1 = new Scanner(myfi);// instantiate a scanner to read file
		while (sc1.hasNext()) { // while there is another line to scan it will
			p = new Person(sc1); // instantiating a new person p
			lnewNode = new Node<Person>(p); // instantiating a new node in array
			
			if (listhead == null) { // check to see if there is a
				listhead = lnewNode;// make the list head point to the newNode
				listtail = listhead;// since the list is empty, the new node
			} else {
				movingPointer = listhead;
				while(movingPointer != null) {
					if(movingPointer.element.compareTo(lnewNode.element) == 0) {
						break;
					}
					movingPointer = movingPointer.next;
				}
				if(movingPointer == null) {
					listtail.next = lnewNode;
					listtail = lnewNode;
					size++;
				}
			}
			
			
		}
	}

	public void printlist() throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("NewFile.txt");
		System.out.println("\nThe list is: ");
		pw.write("The list is:\n");
		lprintNode = listhead;
		movingPointer = listhead;
		while (movingPointer != null) {
			System.out.println(lprintNode.element.toString());
			pw.write(lprintNode.element.toString() + "\n");
			lprintNode = lprintNode.next;
			movingPointer= movingPointer.next;
		}
		pw.close();
	}

	public void addToFront() {// method to add to the front of the linked list
		
		if (listhead == null) {// check for what is at the list head
			listhead = new Node<Person>(p);// instantiate new Node for person.
		} else {// if the head is empty
			Node n = new Node(p);// instantiate node
			n.next = listhead;// make the new node the lesthead
			listhead = n; // create varialbe
		}
	}
		
		private void addinorder(Node<Person> lnewNode) {
			// the empty list is complete before this
			int theCase = 0;
			movingPointer = listhead;

			while (movingPointer != null && theCase <= 0) {
				if (lnewNode.element.lastname.compareTo(listhead.element.lastname) < 0) {
					theCase = 1;
				} else if (movingPointer.next == null) {
					theCase = 2;
				} else if (movingPointer.next.element.lastname.compareTo(lnewNode.element.lastname) > 0) {
					theCase = 3;
				} else {
					movingPointer = movingPointer.next;
				}
			}
			if (theCase == 1) {
				lnewNode.next = listhead;
				listhead = lnewNode;
			} else if (theCase == 2) {
				listtail.next = lnewNode;
				listtail = lnewNode;
			} else if (theCase == 3) {
				lnewNode.next = movingPointer.next;
				movingPointer.next = lnewNode;
			}


	}
}
