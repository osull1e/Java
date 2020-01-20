package checkers;

import java.awt.geom.Ellipse2D;

public class Circle extends GeomShape {
	
	protected int diameter;

	public Circle(int i, int j, int k, String color) {
        this.diameter = i;
        this.xPosition = j;
        this.yPosition = k;
        this.color = color;
        this.draw();
    
	}
	@Override
	protected void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Ellipse2D.Double(xPosition, yPosition, diameter, diameter));
            canvas.wait(10);
        }
       }

	@Override
	protected void erase() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changeSize(int newSize) {
		// TODO Auto-generated method stub
		
	}

}