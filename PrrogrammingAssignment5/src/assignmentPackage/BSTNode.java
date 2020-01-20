package assignmentPackage;


public class BSTNode<E> {//Binary Search Tree Node Class start
	public E element; // creating public Element
	BSTNode<E> leftTree = null;// creating the left node on the tree
	BSTNode<E> rightTree = null;// creating the right node on the tree
	
	public BSTNode(E e){//constructor for BSTNode with params
		this.element = e; // setting elements in BSTNode to e
	}//closing constructor
}//closing class
