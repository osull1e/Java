/**
 * CPU scheduling.
 * The process at the front of the ready queue is schedule to run
 * up to "quantum" amount of time. If not finished, it is moved to
 * the end of the queue.
 * Modify the class to include different scheduling algorithms.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;
import java.util.Collections;

public class Scheduler extends Thread {

	final int defaultQuantum = 10;
	protected int quantum, clock;
	public Queue<UserProcess> queue;
	protected UserProcess current;
	Random rdm = new Random(10000);
	protected int turnTime;
	protected int waitTime;
	protected int startTime;
	protected int endTime;
	protected int avgTurn;
	protected int avgWait;
	protected int iteration;
	
	
	public Scheduler() {
		queue = new LinkedList<UserProcess>();
		clock = 0;
		quantum = defaultQuantum;
	}

	public void addUserProcess(UserProcess p) {
		queue.add(p);
	}

	
	protected void executeUserProcess() {
		quantum = current.getBurst(); // simulate different time slices (random here)
		current.execute(quantum);

		if(queue.size() >= 0 ){

			if(queue.size() == 4){
				waitTime=0;
				startTime = current.getArrTime();
				turnTime=current.getBurst() + current.getArrTime();
			
				System.out.println("Process " + current.pid + " wait time is: " + waitTime);
				System.out.println("Process " + current.pid + " turnaround time is: " + turnTime);	
				System.out.println("---------------------------------------------------");
				endTime += current.burst;
			}
			else{
				clock += current.burst;
				waitTime= endTime - current.getArrTime();
				System.out.println("Process " + current.pid + " wait time is: " + waitTime);
				startTime = endTime;
			
				endTime = startTime + current.getBurst();
				turnTime = endTime - current.arrTime;
				System.out.println("Process " + current.pid + " turnaround time is: " + turnTime);
				System.out.println("---------------------------------------------------");
			}
		avgTurn += turnTime;
		avgWait += waitTime;
		iteration++;
		}
		if (queue.size() == 0){
			System.out.println("Average turnaround time is " + (avgTurn/iteration));
			System.out.println("Average wait time is " + (avgWait/iteration));
		}
		
	}

	@Override
	public synchronized void run() {
		Collections.sort((List<UserProcess>) queue); // simulate ordering of the processes in the queue (random here)

		while (!queue.isEmpty()) {
			current = queue.poll();  // remove the process from the queue
			executeUserProcess();
		}
		System.out.println("---------------------------------------------------\n");
		System.out.println("Queue is empty.");
		pause(1000);
		System.out.println("Scheduler shutdown ...");
		pause(1000);

		notify(); // notify the driver that the scheduler has finished.
	}

	private void pause(int n) {
		try {
			Thread.sleep(n);
		}
		catch(InterruptedException ex) { };
	}
	

}