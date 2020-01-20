
public class FCFS extends UserProcess {

	public FCFS(int pid, int arrTime, int burst, int priority) {
		super(pid, arrTime, burst, priority);
		
	}
	
	@Override
	public int compareTo(UserProcess p) {
		int order = p.getArrTime();
		
		if (arrTime > order)
			return 1;
		else if (arrTime < order)
			return -1;
		else
			return 0;
	}
	public String toString(){
		
		
		return ( pid + " " + arrTime+ " "+ burst + " " + priority );
	}
	

}
