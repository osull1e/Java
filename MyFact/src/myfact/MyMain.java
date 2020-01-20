package myfact;

public class MyMain {

	public static void main(String[] args) {
		int num = 5;
		if(num >=0 )
		
		System.out.println(fact(5));
		else
			System.out.println( "Get a grip");
		
	}
	
	public static int fact(int n){
		
		if (n >= 0){
			
		
		if(n == 0)
			return 1;
		else 
			return (n * fact(n-1));
		
		}
		return(-1);
	}
}
