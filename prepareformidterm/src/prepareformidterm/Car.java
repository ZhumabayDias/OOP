package prepareformidterm;

public class Car {
	private String color;
	public Day day;
	public Car(String color,Day day){
		this.color = color;
		this.day = day;
	}
	
	static{
		System.out.print("Car");
	}
	public boolean holiday() {
		if(day.isHoliday()) {
			return true;
		}
		return false;
	}
}
