package assignmentPackage;

import java.io.*;
import java.util.*;

public class BinTree { // 
	private BSTNode<MyInt> root;//create your root privare
	BSTNode<MyInt> newINode;//instantiate new node
	MyInt anInt;//anInt variable
	int level = 0;// variable int initialized

	public BinTree() {//constructor
		root = null;//set the root
	}
	public BSTNode<MyInt> insert(BSTNode<MyInt> myroot, BSTNode<MyInt> newN) { //InOrder
		if (myroot == null) {//check the root
			myroot = newN;// if it is new, make a new one
		} else {// if not null
			if (myroot.element.anInt > newN.element.anInt) {//check value
//				System.out.println(" going left");
				myroot.leftTree = insert(myroot.leftTree, newN);//if new number is smaller go left
			} else {
//				System.out.println(" going right");
				myroot.rightTree = insert(myroot.rightTree, newN);//if new number is larger go right
			}
		}
		return myroot;// return what the new root is
	}

	public void printTree() {//print out the tree
		System.out.println(" \n The Tree \n");// start the printing
		if (root == null) {//check the tree
			System.out.println(" The tree is empty");//print this if empty
		} else {// if not then
			printTreeInOrder(root);// print this
		}
	}

	public void printTreeInOrder(BSTNode<MyInt> myroot) {// in order levels printed
		
		if (myroot != null) {// do while you have something in root
			level++;//increase the level
			printTreeInOrder(myroot.leftTree);//print the number
			System.out.println(myroot.element.toString() + "  Level: " + level); // print the level
			printTreeInOrder(myroot.rightTree);//print the number
			level--;//decrease the level or else it gets crazy
		}
	}

	public void add(int ran) {// make your random number
		MyInt num = new MyInt(ran);//instatiate
		newINode = new BSTNode<MyInt>(num);// instantiate
		if (root == null){// check if it is empty
			root = newINode;// if it is change the root
		}
		else{//if not
			insert(root, newINode);//insert the new noded
		}
	}

	public boolean search(int value) {
		boolean retval = false;
		if (root == null){
			retval = false;
		}
		else{
			retval = searchTree(root, value);
		}
		return retval;
	}

	private boolean searchTree(BSTNode<MyInt> myroot, int value) {
		boolean retval = false;
		if (myroot == null){
			retval = false;
		}
		else{
			if (myroot.element.anInt == value){
				retval = true;
			}
			else{
				if (value < myroot.element.anInt){
					retval = searchTree(myroot.leftTree, value);
				}
				else{
					retval = searchTree(myroot.rightTree, value);
				}
			}
		}
		return retval;
	}

}