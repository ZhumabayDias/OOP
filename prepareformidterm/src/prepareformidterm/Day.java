package prepareformidterm;

public enum Day {
	MONDAY,TUESDAT,SUNDAY;
	
	public boolean isHoliday() {
		return this==SUNDAY;
	}
}
