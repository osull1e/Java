package astack;

import java.util.ArrayList;

public class Stack {
	private ArrayList<Integer> list = new ArrayList<Integer>();

	
	public void push(Integer num){
		list.add(num);
		
	}
	
	public String toSting(){
		String retval;
		retval = list.toString();
		return(retval);
	}
	
	public boolean ismt(){
		
		boolean retval = true;
		if(list.size() > 0)
			retval = false;
		return(retval);
	}
	
	public Integer top(){
		
		Integer num;
		num = list.get(list.size() -1);
		return(num);
	}
	
	public Integer pop(){
		
		Integer num;
		num = list.get(list.size() -1);
		list.remove(list.size()-1);
		return(num);
	}
}
