package mypoint;

public class Square extends MyShape {
	private int width;
	
	public Square(int x, int y, int width){
		super(x, y);
		this.width = width;
	}
	
	public Square(int width) {
		super();
		this.width = width;
	}

	@Override
	public float calcPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
