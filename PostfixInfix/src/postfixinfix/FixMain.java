/*
	*@author: Eric O'Sullivan
	*Date: Feb. 15th
	*Purpose: Program 2 CPS 181 Spring 2016
	*Approach: Reads in file PostFixInFixList.txt an uses class FixMain and FixAlg. 
	*Changes Postfix to Infix from that file, using integers or characters with operators
	*Recieved help from Bucky on youtube 
*/
package postfixinfix;
import java.util.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FixMain {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner to read from file and declaring a String to be userIn
		File fi1 = new File("PostFixInFixList.txt");
		Scanner scn1 = new Scanner(fi1);
		String userIn;
		

		while (scn1.hasNext()) {
		// This is the way I originally reading in a String before changing it to read from a file
			
			//Scanner scn = new Scanner(System.in);
			//System.out.println("Input Infix to Postfix");
			//String userIn = scn1.nextLine();
			userIn = scn1.next();
			FixAlg alg = new FixAlg(userIn);
		}
		scn1.close();
	}
}
