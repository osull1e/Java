package tester;

import java.util.ArrayList;

public class Stack implements StackInterface<Person> {
	//Implement StackInterface
	public ArrayList<Person> people;
	
	public Stack(){
		
		this.people = new ArrayList<Person>();
	}

	@Override
	public void push(Person item) {
		this.people.add(item);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person pop() {
		
		return this.people.remove(this.people.size()-1);
	}

	@Override
	public Person top() {
		// TODO Auto-generated method stub
		return this.people.get(this.people.size()-1);
	}

	@Override
	public boolean isempty() {
		// TODO Auto-generated method stub
		return this.people.size() == 0;
	}

}
