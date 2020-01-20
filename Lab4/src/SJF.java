
public class SJF extends UserProcess  {

	public SJF(int pid, int arrTime, int burst, int priority) {
		super(pid, arrTime, burst, priority);
		
	}
	
	@Override
	public int compareTo(UserProcess p) {
		int order = p.getBurst();
		
		if (burst > order)
			return 1;
		else if (burst < order)
			return -1;
		else
			return 0;
	}
	public String toString(){
		
		
		return ( pid + " " + arrTime+ " "+ burst + " " + priority );
	}
	


}
