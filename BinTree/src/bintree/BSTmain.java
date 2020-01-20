package bintree;

import java.io.*;
import java.util.*;

public class BSTmain {

	public static void main(String[] args) throws IOException {

		Random ran = new Random();
		int myNum;
		boolean found = false;
		
		File myfi = new File("people.txt");
		Scanner sc1 = new Scanner(myfi);
		BinTree myTree = new BinTree();
		
		for (int i = 1; i < 8; i++){
			
			myNum = ran.nextInt(10);
			System.out.println(myNum);
			myTree.add(myNum);
		}
		found = myTree.search(5);
		myTree.printTree();
		
	}

}
