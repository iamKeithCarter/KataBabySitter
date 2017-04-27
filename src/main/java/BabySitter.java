
public class BabySitter {

	private int startTime;
	
	public int setStartTime(int startTime) {
		this.startTime =startTime;
				return startTime;
	}

	public int setEndTime(int endTime) {
		
		return endTime; 
	}

	public int setBedTime(int bedTime) {
		
		return bedTime;
	}

	public int calculateHoursBeforeBedtime(int bedTime, int startTime) {
		int hoursWorkedBeforeBedtime = bedTime-startTime;
		
		return hoursWorkedBeforeBedtime;
	}

	
	

	
	
 

}
