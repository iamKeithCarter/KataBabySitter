
public class BabySitter {

	private int startTime;
	private int hoursWorkedBeforeBedtimeAdjusted;
	
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
		
		if (bedTime >= 5 && bedTime <= 12){
			 hoursWorkedBeforeBedtimeAdjusted = bedTime-startTime;
			
		}else if (bedTime >=1 && bedTime <=4){
			 hoursWorkedBeforeBedtimeAdjusted = 12-startTime;	
		}
		return  hoursWorkedBeforeBedtimeAdjusted;	
	}

	public int calculateHoursAfterBedtimeButBeforeMidnight(int bedTime, int EndTime) {
		
		return 4;
	}
	

	
	
 

}
