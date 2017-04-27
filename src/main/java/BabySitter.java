
public class BabySitter {

	private int startTime;
	private int hoursWorkedBeforeBedtimeAdjusted;
	private int hoursWorkedAfterBedtime;
	private Object hoursWorkedAfterMidnight;
	
	
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
		if (bedTime >= 5 && bedTime <= 12){
			hoursWorkedAfterBedtime = 12 - bedTime;
			
		}else if (bedTime >=1 && bedTime <=4){
			hoursWorkedAfterBedtime = 0;
		}
		return hoursWorkedAfterBedtime;
	}


	public Object calculateHoursAfterMidnight(int startTime, int endTime) {
		if (startTime>= 5 && startTime <=12 && endTime >= 1){
			hoursWorkedAfterMidnight = endTime;
		}else if(startTime >= 1 && endTime <= 4){
			hoursWorkedAfterMidnight = endTime - startTime;
		}
		return hoursWorkedAfterMidnight ;
		
	}


	public  int calculatePay(int startTime, int bedTime, int endTime) {
		
		return 30;
	}
	

	
	
 

}
