package node1; //using the package node1

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyLinkedList {//Class name
	public static int size;	// creating variable size as an int
	Node<Person>lprintNode;// creating a method to print an array
	Node<Person>lnewNode;// create a new node to add to the array <person>
	Node<Person>listhead;  // creating a node for the array called listhead
	Node<Person>listtail;  // creating a node for the array called listtail
	Person p;
	public MyLinkedList(){  //Creating the default constructor (no params)
	listhead = null; // creating the varaible listhead
	listtail = null;	// creating the variable lasttail
	}// closing constructor
	public void addNode(){ //method addNode begin
		p = new Person();// create object reference for person
		lnewNode = new Node<Person>(p); // creating object to reference Node<Person>
		if(listhead == null){//checking to see if listhead is there
			listhead = lnewNode;//pointing the listhead to lnewNode
			listtail = listhead;// pointing the listtail to the listhead
		}else {//determining what is to be done withthe alternative
			listtail.next = lnewNode;//make the next node in line be the new node
			listtail = lnewNode;//change the newNode back into listtail so it is ready to add another node
		}
		size++;// increase the size by 1
	}// method addNode end
	public void addfromfile(File myfi) throws FileNotFoundException{// method to add from file
		Scanner sc1 = new Scanner (myfi);//instantiate a scanner to read file
		
		while(sc1.hasNext()){ //while there is another line to scan it will be scanned
			p = new Person(sc1); // instantiating a new person p
			lnewNode = new Node<Person>(p); //instantiating a new node in array person
			if(listhead == null){ // check to see if there is a 
				listhead = lnewNode;// make the list head point to the newNode
				listtail = listhead;// since the list is empty, the new node will be the listhead and listtail
			}else{
				listtail.next = lnewNode;//moving the list tail
				listtail = lnewNode;//setting the list tail
			}
			size++;//increasing the size
		}
	}
	public void printlist(){
		System.out.println("\n The list is: ");
		lprintNode = listhead;
		for (int i = 1; i <= size; i++){
			System.out.println(lprintNode.element.toString());
			lprintNode = lprintNode.next;
		}
	}
	public void delete(){
		//make tail null, if tail is null tail.next is tail
	}
	public void addToFront(){//method to add to the front of the linked list
		if (listhead == null){//check for what is at the list head
			listhead = new Node<Person>(p);//instantiate new Node for person.
		}else{// if the head is empty
			Node n = new Node(p);//instantiate node
			n.next = listhead;//make the new node the lesthead
			listhead = n; //create varialbe
		}
	}
}
	//
//	public void removeNode(){ //method to remove a node
//		if(listhead == null){//check to see if anything is in the list
//			return;//return if there is
//		}else{ //if it is not empty do this stuff.
//			listtail.next = listtail;
//			while(listtail != listhead)
//				listtail = listtail.next;
//			after.next = newNode;	
//			}
	//}
		//after.next = newNode;

 // closing MyLinkedList class
