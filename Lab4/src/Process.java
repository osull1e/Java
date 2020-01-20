
public class Process {
	
	private int pid;
	private int arrTime;
	private int burst;
	private int priority;
	
	public Process(int pid, int arrTime, int burst, int priority){
		setPid(pid);
		setArrTime(arrTime);
		setBurst(burst);
		setPriority(priority);
		
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	
	public String toString(){
		
		
		return ( pid + " " + arrTime+ " "+ burst + " " + priority );
	}
	

}
