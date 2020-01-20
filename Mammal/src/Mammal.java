
public abstract class Mammal {
	public int lifeSpan;
	public boolean isUngulate;
	public String gender;
	public String name;
	
	
	public Mammal (){
		  this.lifeSpan = 50;
		  this.isUngulate = false;
		  this.gender = "Male";
		  this.name = "Fred";
		
	}
	
	public Mammal (String gender, int lifeSpan, boolean isUngulate){
		this.lifeSpan = 60;
		this.isUngulate = false;
		this.gender = gender;
		this.name = "Jordan";
		
	}
	
	public Mammal (boolean isUngulate){
		this.lifeSpan = 20;
		this.isUngulate = isUngulate;
		this.gender = "Female";
		this.name = "Sally";
	}
	abstract void Walk();
	public String toString(){
		return Integer.toString(lifeSpan) +"\n" + Boolean.toString(isUngulate) +"\n" + gender+ "\n" + name;
	}
}
