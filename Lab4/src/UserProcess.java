/**
 * User process
 * 
 * In each time slot allocated to the process, it "runs" (sleep in simulation)
 * for the given quantum.
 * 
 * Modify this class to include more features of a user process, such as
 * arrival time, burst time, waiting time, turnaround time, etc. Also need to
 * change how the processes are compared to determine their ordering.
 *
 */

public class UserProcess implements Comparable<UserProcess> { 
	
	protected int pid;
	protected int arrTime;
	protected int burst;
	protected int priority;

	
	public UserProcess(int pid, int arrTime, int burst, int priority){
		setProcessId(pid);
		setArrTime(arrTime);
		setBurst(burst);
		setPriority(priority);
		
	}
	public UserProcess(int i) {
		this.pid = i;
	}
	public void setProcessId(int pid) {
		this.pid = pid;
	}
	public int getProcessId() {
		return pid;
	}
	public int getArrTime() {
		return arrTime;
	}
	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	public int getBurst() {
		return burst;
	}
	public void setBurst(int burst) {
		this.burst = burst;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void execute(int quantum) {
		System.out.printf("Running process %d ...\n", pid);
		try {
			Thread.sleep(quantum);
		}
		catch(InterruptedException ex) { };
	}
	
	/**
	 * Implement the method of the Comparable interface.
	 */
	@Override
	public int compareTo(UserProcess p) {
		int order = p.getProcessId();
		
		if (pid > order)
			return 1;
		else if (pid < order)
			return -1;
		else
			return 0;
	}

}