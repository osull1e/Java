package astack;

import java.util.Stack;

public class MyMain {

	public static void main(String[] args) {
	
		Stack astack = new Stack(); // default constructor
		astack.push(5);
		astack.push(7);
		astack.push(11);
		System.out.println(astack.ismt());
		//astack.top();
		astack.pop();
		System.out.println(astack.pop());
		astack.push(13);
		System.out.println(astack.toString());

	}

}
