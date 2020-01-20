package checkers;

public class CheckerBoard {
	// Put your data attributes here
    
		/**
		 * Eric O'Sullivan
		 * Lab 2
		 * 
		 */
		public static void main(String[] args) {
			
			CheckerBoard board = new CheckerBoard();

	        board.create();
		}
		
		public CheckerBoard() {
			// Instantiate or initialize attributes here
			
		}
	    /**
	     * Creates the checker board. This method currently just draws 2 squares as an example.
	     * Use this as a starting point in this assignment.
	     *
	     */
		private void create() {
			Canvas.getCanvas();
			// Make a stairstep pattern of squares
			final int NUMROWS = 8;
			GeomShape[][] pattern = new GeomShape[NUMROWS][];
			String color;
			for(int i = 0; i < pattern.length; i++) {
				pattern[i] = new GeomShape[i + 1];
				for(int j = 0; j <= i; j++) {
					if((i + j) % 2 == 0) {
						color = "blue";
						pattern[i][j] = new Square(20, j * 20 + 30, i * 20 + 30, color);
					}
					else {
						color = "black";
						pattern[i][j] = new Circle(20, j * 20 + 30, i * 20 + 30, color);
					}
					
					pattern[i][j].makeVisible();
				}
			}
		}
		

	}


