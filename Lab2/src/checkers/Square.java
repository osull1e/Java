package checkers;

import java.awt.Rectangle;

public class Square extends GeomShape
{
    private int size;
  
    public Square(int i, int j, int k, String color) {
        this.size = i;
        this.xPosition = j;
        this.yPosition = k;
        this.color = color;
        this.draw();
    
    }
    
    public void changeSize(int newSize) {
        erase();
        size = newSize;
        draw();
    }

   //change color
    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    protected void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
    }

    protected void erase() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}

	