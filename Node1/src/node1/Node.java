package node1; // using the package node1

public class Node<E> {//Class name
	E element; //
	Node<E>next = null; // assigning a value to reference?
	
	public Node(E e){ // constructor with params
		
		this.element = e; // setting element to be referenced as e
	}// closing Node method

}// closing class
