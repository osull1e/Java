
public class RRschedule extends Scheduler {
	
	public RRschedule() {
		super();
		
	}

	@Override
	protected void executeUserProcess() {
		int timeRemain;
		
		quantum = defaultQuantum; // simulate different time slices (random here)
		current.execute(quantum);
		if(queue.size() >= 0 ){
			
			if(queue.size() == (queue.size()-1)){
				waitTime=0;
				startTime = current.getArrTime();
				timeRemain = quantum - current.burst;
				
			}
			
			

		}
	}	
}
