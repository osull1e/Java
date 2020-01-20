
public class RR extends UserProcess {
	public RR(int pid, int arrTime, int burst, int priority) {
		super(pid, arrTime, burst, priority);
		
	}
	
	@Override
	public int compareTo(UserProcess p) {
		int order = p.getPriority();
		
		if (priority > order)
			return 1;
		else if (priority < order)
			return -1;
		else
			return 0;
	}
	public String toString(){
		
		
		return ( pid + " " + arrTime+ " "+ burst + " " + priority );
	}

}
