
public class BabySitter {

	private int startTime;
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
			
	
	
	
	public int setStartTime(int startTime) {
		this.startTime = startTime;
				return startTime;
	}

	
	public int setEndTime(int endTime) {
		
		return endTime; 
	}

	
	public int setBedTime(int bedTime) {
		
		return bedTime;
	}

	
	public int calculateHoursBeforeBedtime(int bedTime, int startTime) {
		
		if (bedTime >= minStartTime && bedTime <= midnight){
			 hoursWorkedBeforeBedtimeAdjusted = bedTime-startTime;
			
		}else if (bedTime >= hourAfterMidnight && bedTime <= maxEndTime){
			 hoursWorkedBeforeBedtimeAdjusted = midnight-startTime;	
		}
		return  hoursWorkedBeforeBedtimeAdjusted;	
	}

	
	public int calculateHoursAfterBedtimeButBeforeMidnight(int bedTime, int EndTime) {
		if (bedTime >= minStartTime && bedTime <= midnight){
			hoursWorkedAfterBedtime = midnight - bedTime;
			
		}else if (bedTime >= hourAfterMidnight && bedTime <= maxEndTime){
			hoursWorkedAfterBedtime = 0;
		}
		return hoursWorkedAfterBedtime;
	}


	public int calculateHoursAfterMidnight(int startTime, int endTime) {
		if (startTime >= minStartTime && startTime <= midnight && endTime >= hourAfterMidnight && endTime <= maxEndTime){
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
