package assignmentPackage;
/**
 * @author Eric O'Sullivan
 * @date 4/27/16
 * @project 5: Binary Search Tree
 */
import java.io.*;
import java.util.*;

public class BSTmain { //Main Class to start program and call others

	public static void main(String[] args) throws IOException {//Starting arg to begin the running of the program
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to find");
		Integer searchNum = scn.nextInt();
		Random ran = new Random();//instantiate java's random number gen
		int myNum; // create the int variable and name it myNum
		boolean found = false; //create the boolean variable and set it to false
		BinTree myTree = new BinTree();// instantiating the BinTree class into memory
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for (int i = 1; i < 1000; i++){//making a for loop to generate 5 random numbers 1,000 needed
			myNum = ran.nextInt(10000) + 1;//having java pick between 0 to 50 randomly 10,000 needed
			System.out.println(myNum);// print out the numbers
			myTree.add(myNum);//adding the random numbers to the binary search tree
			intList.add(myNum);
		}//inding
		found = myTree.search(searchNum);//make the varible for if it is found
		if(found == true){//what to do if it is found
			System.out.println("It is found");// say it is found
		}else{//if not
			System.out.println("Not found");// say not found
		}
		myTree.printTree();//print mytree
		
		for (int i = 0; i < intList.size(); i++ ){// search for the number
			if (intList.get(i) == searchNum){//if you number was found
				System.out.println("Number is in the list at index: " + i);//say where your number was found
			}
		}
		System.out.println("\nThe Array is: ");//print the array list
		for (int i = 0; i < intList.size(); i++ ){//including the whole array
			System.out.println(intList.get(i));//printing the array
		}
	}

}
