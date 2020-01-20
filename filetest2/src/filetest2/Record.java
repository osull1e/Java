package filetest2;


public class Record {
	
	private  Name name;
	private int age;
	 
	public Record(String fname, String mname, String lname, int age) {
		 
		name = new Name(fname, mname, lname);
		this.name = name; 
		this.age = age;
	 } 
	
	public String toString(){
		
		return(name.toString()+ "" + age);
	}
	

	

}