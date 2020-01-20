/**
 * Starting point and Driver 
 * @author Eric O'Sullivan
 * 
 */
package mypoint;

public class Driver {

	public static void main(String[] args) {
		Driver myDriver = new Driver();
		myDriver.run();
	}
	private void run(){
		MyPoint p1 = new MyPoint(30, 40);
		MyPoint p2 = new MyPoint(20,50);
		System.out.println(p1.distanceTo(p2));
		
	}

}
