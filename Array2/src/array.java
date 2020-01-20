import java.util.Scanner;
public class ListSchools {

	public static void main(String[] args) 
	{
		String [] teamNames = {"Akron","Ball State","Bowling Green",
				"Buffalo","Central Michigan","Eastern Michigan",
				"Kent State","Miami","Northern Illinois","Ohio",
				"Toledo","UMass","Western Michigan"};
		// the folowing data is random
		int [] enrollment = 
			{10000,15000,12000,25000,13000,8000,20000,
			12500,22000,15000,23000,18000,32000,
			};
		

		String team;
		char letter;
		String sLetter;
		Scanner sc=new Scanner(System.in);

		System.out.println("Original List: ");
		for (int i=0; i<teamNames.length; ++i)
		{
			team=teamNames[i];
			System.out.println(team);
		}
		
		System.out.print("Enter a letter: ");
		letter=sc.next().charAt(0);
		
		sLetter=""+letter;

		System.out.println("\nFiltered List with teams with letter "+sLetter+" and backwards");
		for (int i=0; i<teamNames.length; ++i)
		{
			team=teamNames[i];
			//System.out.println(team.substring(0, 4));
			//if (team.contains(sLetter))
			if (team.contains(""+letter))
			{
				System.out.printf("%20s|",team);
				for (int j=team.length()-1;j>=0;--j)
					System.out.print(team.charAt(j));
				System.out.println();
			}
		}

		int length;
		
		System.out.print("Enter a length: ");
		length=sc.nextInt();
		
		System.out.println("\nFiltered List with team name length less than or equal to "+length);
		for (int i=0; i<teamNames.length; ++i)
		{
			team=teamNames[i];
			//System.out.println(team.substring(0, 4));
			//if (team.contains(sLetter))
			if (team.length()<=length)
			{
				System.out.printf("%20s%8d%n",team,enrollment[i]);
			}
		}
		
		// find the max enrollment and the min enrollment
		// MAX
		int max;
		int index=0;
		max=enrollment[0];  // or max=-999;
		for (int i=1; i<enrollment.length;++i)
		{
			if (enrollment[i]>max)
			{
				max=enrollment[i];
				index=i;
			}
		}
		System.out.println("Team with most students: "
				+teamNames[index]+ " with "+ enrollment[index]+ " students");
		
		// MAX
				int min;
				index=0;
				min=enrollment[0];  
				for (int i=1; i<enrollment.length;++i)
				{
					if (enrollment[i]<min)
					{
						min=enrollment[i];
						index=i;
					}
				}
				System.out.printf("Team with least students: %s with %d ",
						teamNames[index],enrollment[index]);
				
	}
}