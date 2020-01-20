package beerBottles;

public class BottlesMain {

	public static void main(String[] args) {
		
		int numBottles = 500;
		String bottles = "Bottles";
		String songChor = "of beer on the wall ";
		String songChor2 = "bottles of beer ";
		String songChor3 = "take one down and pass it around ";

		
		while(numBottles > 0){
			
			if (numBottles == 1){
				bottles = "Bottle";
			}
			System.out.println(numBottles + " " + bottles + " " + songChor 
					+ " " + numBottles + " " + songChor2 + " " + songChor3 +" ");
			numBottles -= 1;
			System.out.println(numBottles + " " + bottles + " " + songChor);
		}
			System.out.println("Done");
	}

}
