package geometric;

public class Circle1 extends GeoMetricMain {
	
	private double radius;
	
	public Circle1() {
		
	}
	public Circle1 (double radius){
		
		super();
		this.radius = radius;
		
	}

	public Circle1(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
		
	}
	//returns radius
	public double getRadius() {
		return radius;
	}
	//sets a new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// return area
	public double getArea (){
		return radius * radius * Math.PI;
	}
	// return diameter
	public double getDiameter(){
		return 2 * radius;
		
	}
	//return perimeter
	public double getPerimeter(){
		return 2 * radius * Math.PI;
		
	}
	//print cirlce information
	public void printCircle(){
		System.out.println(toString() + " The Circle is created " + getDateCreated() 
		+ " and the radius is " + radius);
	}
	public String toString(){
		return "Circle  " + getColor() + " "+ super.toString();
		
	}
}
