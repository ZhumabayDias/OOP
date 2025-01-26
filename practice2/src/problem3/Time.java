package problem3;

public class Time {
	public int hour;
	public int minute;
	public int second;
	
	public Time(int hour,int minute,int second) {
		SetTime(hour,minute,second);
	}
	public void SetTime(int hour,int minute,int second) {
		if(hour<0 || hour>24) {
			System.out.println("invalid");
		}
		if(minute<0 || minute>60) {
			System.out.println("invalid");
		}
		if(second<0 || second>60) {
			System.out.println("invalid");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public String toUniversal(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public String toStandard() {
		int newHour = hour;
		if(hour>12) {
			newHour = hour - 12;
		}
		String period = "AM";
		if(hour>12) {
			period= "PM";
		}
		return String.format("%02d:%02d:%02d %s",newHour,minute,second,period);
	}
	public Time add(Time t1) {
		int newSecond = t1.second + second;
		int newMinute = t1.minute + minute + newSecond/60;
		int newHour = t1.hour + hour + newMinute/60;
		
		newSecond = newSecond%60;
		newMinute = newMinute%60;
		newHour = newHour%24;
		
		return new Time(newHour,newMinute,newSecond);
		
	}
	
	
}
