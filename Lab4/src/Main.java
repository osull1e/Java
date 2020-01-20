import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Driver of CPU scheduling
 * 
 * 
 * Modify it to include creating processes from information in the data file and
 * algorithm selection that will affect the order in which the processes are
 * entered to the scheduler's queue and the time slice quantum.
 * 
 */

public class Main {

	Scheduler sch;

	public static void main(String[] args) throws FileNotFoundException {
		new Main();
	}

	public Main() throws FileNotFoundException {

		Scanner kb = new Scanner(System.in);
		System.out.println("Select the program you want to run");
		System.out.println("Press '1' for First Come First Serve");
		System.out.println("Press '2' for Shortest Job First");
		System.out.println("Press '3' for Round Robin");
		int choice = kb.nextInt();
		sch = new Scheduler();

		Scanner scn = new Scanner(new File("Lab4time"));
		UserProcess p = null;
		scn.nextLine();
		while (scn.hasNextLine()) {

			int pid = scn.nextInt();
			int arrTime = scn.nextInt();
			int burst = scn.nextInt();
			int priority = scn.nextInt();

			// prompt for what they want, give them choice and then set that
			// var.
			switch (choice) {
			case 1:
				p = new FCFS(pid, arrTime, burst, priority);
				break;
			case 2:
				p = new SJF(pid, arrTime, burst, priority);
				break;
			case 3:
				p = new RR(pid, arrTime, burst, priority);
				break;
			default:
				break;
			}
			sch.addUserProcess(p);
			System.out.println("Adding Process " + p.pid);
			
		}
		System.out.println("");
		sch.start();
		try {
			synchronized (sch) {
				sch.wait(); // wait for CPUScheduler to finish
				CalculateStatistics();
			}
		} catch (Exception e) {

		}
	}

	private void CalculateStatistics() {
		System.out.println("\n---------------------------------------------------\n");
		
		
		System.out.println("Done");
	}

}