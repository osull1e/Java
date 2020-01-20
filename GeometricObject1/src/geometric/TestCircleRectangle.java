package geometric;

public class TestCircleRectangle {
	
	public static void main(String[] args) {
		
		
		Circle1 circle = new Circle1(1);
		System.out.println("A Circle " + circle.toString());
		System.out.println("The Radius is " + circle.getRadius());
		System.out.println("The Area is " + circle.getArea());
		System.out.println("The Diameter is " + circle.getDiameter());
		
		Rectangle1 rectangle = new Rectangle1 (2, 4);
		System.out.println("\nA Rectangle " + rectangle.toString());
		System.out.println("The Area is " + rectangle.getArea());
		System.out.println("The Perimeter is " + rectangle.getPerimeter());
	}
}
