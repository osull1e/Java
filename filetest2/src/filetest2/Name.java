package filetest2;

public class Name {
	
	private String firstName;
	private String midName;
	private String lastName;
	
	public Name() {
		
		
		
	}
	
	public Name(String f, String m, String l) {
		
		this.firstName = f;
		this.midName = m;
		this.lastName = l;
		
	}
	
	public String toString () {
		
		return(firstName + " " + midName+ " " + lastName);
		
	}

}
