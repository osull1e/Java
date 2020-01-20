import java.lang.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Eric O'Sullivan
 * The purpose of this lab is to familiarize ourselves with how page tables determine the page 
 * number and the offset based on a given address
 */

public class Main {
	//Creating an ArrayList to story the incoming addresses
	static ArrayList<Integer> addressList = new ArrayList<>();
	//Giving the addresses a static variable so it can be used thoughout the class
	static int address;
	//I didnt really need to make this static and put it here, but it worked out.
	static int i;
	//eventually I needed to increment throught the list. I decided to create an 
	//incrementor variable so that this program would be able to adjust regardless of how large the file size of 
	//addresses were coming in. (I mean the list size.)
	static int incrementor = 0;

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		//creating scanner object and using it to read in data
		PrintWriter writer = new PrintWriter("lab5.txt", "UTF-8");
		Scanner scn = new Scanner(new File("Data"));
		while (scn.hasNextLine()) {
			address = scn.nextInt();
			addressList.add(address);
		}
		//begining the output with equal formatting
		writer.printf("%-22s%-22s%-22s%-22s\n", "Address", "Page Number", "Offset", "Remarks");
		writer.println("--------------------------------------------------------------------------");
		System.out.printf("%-22s%-22s%-22s%-22s\n", "Address", "Page Number", "Offset", "Remarks");
		System.out.println("--------------------------------------------------------------------------");
		//Use my accessAddress method to do all the heavey lifting
		accessAddress(addressList);

	}
	//This method determines how to create the page table.
	public static void accessAddress(ArrayList<Integer> addressList) throws FileNotFoundException, UnsupportedEncodingException {
		//Here I make sure to iterate through the entirety of my list
		for (i = addressList.size(); i > 0; i--) {
			//My increment was set as global so it would be changed again down here
			int try1 = addressList.get(incrementor);
			//
			PrintWriter writer = new PrintWriter("lab5.txt", "UTF-8");
			incrementor++;
			
			int x = try1;
			
			int y = 64;
			
			int z = 0;
			
			z = x >> 4;
			
			x = ((z << 4) ^ x);
			
			if (try1 > 131072) {
				writer.printf("%-22s%-22s%-22s%-22s\n", try1 + " (0x" + Integer.toHexString(try1), " ", "",
					"Invalid");
			System.out.printf("%-22s%-22s%-22s%-22s\n", try1 + " (0x" + Integer.toHexString(try1), " ", "",
					"Invalid");
				//if the address is not out of bounds then go ahead and print it out
			} else {
				writer.printf("%-22s%-22s%-22s%-22s\n", try1 + " (0x" + Integer.toHexString(try1) + ")",
						z + " (0x" + Integer.toHexString(z) + ")", x + " (0x" + Integer.toHexString(x) + ")", "");
				System.out.printf("%-22s%-22s%-22s%-22s\n", try1 + " (0x" + Integer.toHexString(try1) + ")",
						z + " (0x" + Integer.toHexString(z) + ")", x + " (0x" + Integer.toHexString(x) + ")", "");

			}
		}
	}
	//Method to be able to take an integer and make it into a hex
	private static int toHexString(int try1) {
		return 0;
	}
}
