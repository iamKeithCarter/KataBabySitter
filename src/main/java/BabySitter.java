
public class BabySitter {

	
	private int hoursWorkedBeforeBedtimeAdjusted;
	private int hoursWorkedAfterBedtime;
	private int hoursWorkedAfterMidnight;
	private int babySitterPayment;
	private int minStartTime = 5;
	private int maxEndTime = 4;
	private int hourAfterMidnight = 1;
	private int midnight = 12;
	private int beforeBedtimePay = 12;
	private int afterBedtimePay = 8;
	private int afterMidnightPay = 16;
			
	
	private boolean afterMidnight(int bedTime) {
		return bedTime >= hourAfterMidnight && bedTime <= maxEndTime;
	}


	private boolean beforeMidnight(int bedTime) {
		return bedTime >= minStartTime && bedTime <= midnight;
	}
	
	
	public int setStartTime(int startTime) {
		
				return startTime;
	}

	
	public int setEndTime(int endTime) {
		
		return endTime; 
	}

	
	public int setBedTime(int bedTime) {
		
		return bedTime;
	}

	
	public int calculateHoursBeforeBedtime(int bedTime, int startTime) {
		
		if (beforeMidnight(bedTime)){
			 hoursWorkedBeforeBedtimeAdjusted = bedTime-startTime;
			
		}else if (afterMidnight(bedTime)){
			 hoursWorkedBeforeBedtimeAdjusted = midnight-startTime;	
		}
		return  hoursWorkedBeforeBedtimeAdjusted;	
	}

	
	public int calculateHoursAfterBedtimeButBeforeMidnight(int bedTime, int EndTime) {
		if (beforeMidnight(bedTime)){
			hoursWorkedAfterBedtime = midnight - bedTime;
			
		}else if (afterMidnight(bedTime)){
			hoursWorkedAfterBedtime = 0;
		}
		return hoursWorkedAfterBedtime;
	}


	public int calculateHoursAfterMidnight(int startTime, int endTime) {
		if (beforeMidnight(startTime) && endTime >= hourAfterMidnight && endTime <= maxEndTime){
			hoursWorkedAfterMidnight = endTime;
		}else if(startTime >= hourAfterMidnight && endTime <= maxEndTime){
			hoursWorkedAfterMidnight = endTime - startTime;
		}
		return hoursWorkedAfterMidnight ;
	}


	public  int calculatePay(int startTime, int bedTime, int endTime) {
	
		 babySitterPayment = calculateHoursAfterBedtimeButBeforeMidnight(bedTime,endTime) * afterBedtimePay + calculateHoursAfterMidnight(startTime, endTime)* afterMidnightPay  + calculateHoursBeforeBedtime (bedTime,  startTime) * beforeBedtimePay; 

	 return babySitterPayment;
	}
	

}
