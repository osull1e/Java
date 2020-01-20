/**
 * This is x,y
 * @author Eric O'Sullivan
 * 
 */
package mypoint;
public class MyPoint {	// Data attributes (members)
	//Set instance variable
	private float X;
	private float Y;
	//Constructor with params
	public MyPoint(float X, float Y) {	
		this.X = X;
		this.Y = Y;
	}
	//Default constructor
	public MyPoint (){
		this.X = 0;
		this.Y = 0;
	}
	//getter for x
	public float getPointX(){
		return this.X;
	}
	//getter for y
	public float getPointY(){
		return this.Y;
	}
	
	
	public void setX(float x) {
		X = x;
	}

	public void setY(float y) {
		Y = y;
	}
	public float distanceTo(MyPoint p){
		float distance = (float) Math.sqrt(Math.pow(this.X - p.getPointX(), 2) + Math.pow(this.Y - p.getPointY(), 2));
		return distance;
	}

}
