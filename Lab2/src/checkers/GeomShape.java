package checkers;

public abstract class GeomShape {
	protected int xPosition;
	protected int yPosition;
	protected String color;
	protected boolean isVisible;
	
	
	public GeomShape()
    {
		xPosition = 60;
		yPosition = 50;
		color = "red";
		isVisible = false;
    }
	
	// Parameterized constructor
    public GeomShape(int x, int y, String color) {
    	xPosition = x;
    	yPosition = y;
    	this.color = color;
    	isVisible = false;
    }
    
	/**
	 * Make this square visible. If it was already visible, do nothing.
	 */
	public void makeVisible()
	{
		isVisible = true;
		draw();
	}
	
	/**
	 * Make this square invisible. If it was already invisible, do nothing.
	 */
	public void makeInvisible()
	{
		erase();
		isVisible = false;
	}
	
    /**
     * Move the square a few pixels to the right.
     */
    public void moveRight()
    {
		moveHorizontal(20);
    }

    /**
     * Move the square a few pixels to the left.
     */
    public void moveLeft()
    {
		moveHorizontal(-20);
    }

    /**
     * Move the square a few pixels up.
     */
    public void moveUp()
    {
		moveVertical(-20);
    }

    /**
     * Move the square a few pixels down.
     */
    public void moveDown()
    {
		moveVertical(20);
    }

    /**
     * Move the square horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
		erase();
		xPosition += distance;
		draw();
    }

    /**
     * Move the square vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
		erase();
		yPosition += distance;
		draw();
    }

    /**
     * Slowly move the square horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
		int delta;

		if(distance < 0) 
		{
			delta = -1;
			distance = -distance;
		}
		else 
		{
			delta = 1;
		}

		for(int i = 0; i < distance; i++)
		{
			xPosition += delta;
			draw();
		}
    }

    /**
     * Slowly move the square vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
		int delta;

		if(distance < 0) 
		{
			delta = -1;
			distance = -distance;
		}
		else 
		{
			delta = 1;
		}

		for(int i = 0; i < distance; i++)
		{
			yPosition += delta;
			draw();
		}
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
	 * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
		color = newColor;
		draw();
    }
    
    public abstract void changeSize(int newSize);
    protected abstract void draw();
    protected abstract void erase();
}


