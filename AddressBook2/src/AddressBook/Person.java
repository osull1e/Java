package AddressBook;

import java.util.ArrayList;

public class Person {
	
	private String fName;
	private String lName;
	private int id;
	
	public Person(String fName, String lName, int id){
		
		this.fName = fName;
		this.lName = lName;
		this.id = id;
		
	}
	
	

	public Person(ArrayList<String> person, int i) {
		// TODO Auto-generated constructor stub
	}



	public String toString() {
		return(fName + " " + lName + " " + id);
	}
	
	public int getID(){
		return id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

}
