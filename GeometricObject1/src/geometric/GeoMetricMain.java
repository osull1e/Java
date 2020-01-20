package geometric;

public class GeoMetricMain {
	
	//Default information about geometric objects
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeoMetricMain(){
		dateCreated = new java.util.Date();
		
		
	}
	/** Construct a default geometric object */
//this will be the default constructor. to give basic information about all geometric shapes
	public GeoMetricMain(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	//return color
	public String getColor() {
		return color;
	}
	//Set a new color
	public void setColor(String color) {
		this.color = color;
	}
	//Return filled. Since filled is boolean, its get method is named
	//isFilled
	public boolean isFilled() {
		return filled;
	}
	//setting a new filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//get the date created, note that is not a set for this,
	//that is so the user cannot set their own date created
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	//Retrun a string representation of this object
	public String toString(){
		return "created on " + dateCreated + " \ncolor: " + color + " and filled: " + filled;
		
	}
}
