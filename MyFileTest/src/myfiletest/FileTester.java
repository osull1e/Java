package myfiletest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTester {

	public static void main(String[] args) throws FileNotFoundException {
		File fi = new File("Infile.txt");
		Scanner sc = new Scanner(fi);
		ArrayList<AnimalClass> mylist = new ArrayList<AnimalClass>();
		AnimalClass ani;
		
		
		String input;
		int number;
		while(sc.hasNext()){
			ani = new AnimalClass();
			input = sc.next();
			ani.type =input;
			number = sc.nextInt();
			ani.number = number;
			System.out.println(input + " " + number);
			mylist.add(ani);

		}
		mylist.remove(2);
		for (int i = 0; i < mylist.size(); i++){
			System.out.println("\n" +mylist.get(i).toString()+" \n");

		}
		
	}

}
