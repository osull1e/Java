package bintree;

import java.io.*;
import java.util.*;

public class BinTree {
	private BSTNode<MyInt> root;
	BSTNode<Person> newTNode;
	BSTNode<MyInt> newINode;
	Person p;
	MyInt anInt;
	int level = 0;

	public BinTree() {
		root = null;
	}

//	public void addFromFile(File myfi) throws IOException {
//		Scanner sc1 = new Scanner(myfi);
//
//		while (sc1.hasNext()) {
//			p = new Person(sc1);
//			newNode = new BSTNode<Person>(p);
//			if (root == null) {
//				root = newNode;
//			} else {
//				insert(root, newNode);
//			}
//		}
//	}

	public BSTNode<MyInt> insert(BSTNode<MyInt> myroot, BSTNode<MyInt> newN) {
		if (myroot == null) {
			myroot = newN;
		} else {
			if (myroot.element.anInt > newN.element.anInt) {
//				System.out.println(" going left");
				myroot.leftTree = insert(myroot.leftTree, newN);
			} else {
//				System.out.println(" going right");
				myroot.rightTree = insert(myroot.rightTree, newN);
			}
		}
		return myroot;

	}

	public void printTree() {
		System.out.println(" \n The Tree \n");
		if (root == null) {
			System.out.println(" The tree is empty");
		} else {
			printTreeInOrder(root);
		}
	}

	public void printTreeInOrder(BSTNode<MyInt> myroot) {
		level++;
		if (myroot != null) {
			printTreeInOrder(myroot.leftTree);
			System.out.println(myroot.element.toString() + "  Level: " + level);
			printTreeInOrder(myroot.rightTree);
			level--;
		}
		
	}

	public void add(int ran) {
		MyInt num = new MyInt(ran);
		newINode = new BSTNode<MyInt>(num);
		if (root == null){
			root = newINode;
		}
		else{
			insert(root, newINode);
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
