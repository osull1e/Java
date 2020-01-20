/**
 * Class to rep. all shapes
 * @author Eric O'Sullivan
 */
package mypoint;


public abstract class MyShape {
	//"has-a" relationship
	private MyPoint origin;
	private String color;
	
	public MyShape(int x, int y){
		origin.setX(x);
		origin.setY(y);
	}
	
	//perimeter behavior (abstract method
	public abstract float calcPerimeter();
	
	//area behavior (abstract method)
	public abstract float calcArea();
	
	//color getter
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		
	}

}
