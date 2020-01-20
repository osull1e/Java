package filetest2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MymainInt {

	public static void main(String[] args) throws IOException {
		File fi1 = new File("infile.txt");
	
		Scanner scn1 = new Scanner(fi1);
	
		PrintWriter prw = new PrintWriter("outfile.txt");
		Record[] myArray = new Record[10];
		int logSize = 0;
		//Record person = new Record();
		
		String fname;
		String mname;
		String lname;
		int age;
		String major;
		
		while(scn1.hasNext())
		{
			
			fname = scn1.next();
			mname = scn1.next();
			lname = scn1.next();
			age = scn1.nextInt();

			System.out.println(fname + " " + mname + " " + lname + " " + age);
			//Record person = new Record(fname,mname,lname);
			
			logSize = logSize + 1;
			prw.println(fname + " " + mname + " " + lname + " " + age);
//			System.out.println(name + " " + age );
		}
		
	//	for(int count = 0; count <logSize; count++)
		{
		//	System.out.println(myArray[count].getName() + " " + myArray[count].getAge());
		}
		scn1.close();
		scn2.close();
		prw.close();
	}
	
	
	
	
	
	//public static void change(Record rec){
	//	rec.setAge(16);
		//return;
	//}

		
	

}
