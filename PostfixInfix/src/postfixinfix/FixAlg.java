package postfixinfix;
/*
*@author: Eric O'Sullivan
*Date: Feb. 15th
*Purpose: Program 2 CPS 181 Spring 2016
*Approach: Reads in file PostFixInFixList.txt an uses class FixMain and FixAlg. 
*Changes Postfix to Infix from that file, using integers or characters with operators
*Recieved help from Bucky on youtube 
*/
import java.util.Stack;

public class FixAlg {

	private String inputString;
	private Stack s;

	public FixAlg(String iString) {

		inputString = iString;
		s = new Stack();

		String outputString = "";
		boolean firstInput = false;
		for (int i = 0; i < inputString.length(); i++) {
			char curChar = inputString.charAt(i);
			if (!isOperator(curChar)) {
				outputString += Character.toString(curChar);
				if (i == (inputString.length() - 1)) {
					while (!s.empty()) {
						outputString += s.pop();
					}
				}
			} else {
				if (firstInput) {
					if (pMin(curChar) && pMin((Character) s.peek())) {
						outputString += s.pop();
						s.push(curChar);
						if (i == (inputString.length() - 1)) {
							while (!s.empty()) {
								outputString += s.pop();
							}
						}
					} else if (mDiv(curChar) && mDiv((Character) s.peek())) {
						outputString += s.pop();
						s.push(curChar);
						if (i == (inputString.length() - 1)) {
							while (!s.empty()) {
								outputString += s.pop();
							}
						}
					} else if (pMin(curChar) && mDiv((Character) s.peek())) {
						outputString += s.pop();
						s.push(curChar);
						if (i == (inputString.length() - 1)) {
							while (!s.empty()) {
								outputString += s.pop();
							}
						}
					} else if (mDiv(curChar) && pMin((Character) s.peek())) {
						s.push(curChar);
						if (i == (inputString.length() - 1)) {
							while (!s.empty()) {
								outputString += s.pop();
							}
						}
					} else {
						outputString += Character.toString(curChar);
						if (i == (inputString.length() - 1)) {
							while (!s.empty()) {
								outputString += s.pop();
							}
						}
					}
				} else {
					s.push(curChar);
					firstInput = true;
				}
			}
		}
		System.out.println(outputString);
	}

	public boolean isOperator(char op) {
		switch (op) {
		case '+':
			return true;
		case '-':
			return true;
		case '/':
			return true;
		case '*':
			return true;
		case '^':
			return true;
		default:
			return false;
		}
	}

	public boolean pMin(char op) {
		switch (op) {
		case '+':
			return true;
		case '-':
			return true;
		default:
			return false;
		}
	}

	public boolean mDiv(char op) {
		switch (op) {
		case '*':
			return true;
		case '/':
			return true;
		default:
			return false;
		}
	}
}