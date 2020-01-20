package banking;

public class Person {
	
	private static String name;
	private String userID;
	private int pin;
	
	
	//Class person, person has a String, String, and an Int
	public Person(String name, String userID, int pin ){
		this.userID = userID;
		this.name = name;	
		this.pin = pin;
	}
	
	public String getName(MyList p) {
		return name;
		
	}

}
