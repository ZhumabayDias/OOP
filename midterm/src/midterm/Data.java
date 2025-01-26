package midterm;

public class Data {
	private double value;
	private double sum;
	private int count;
	
	public Data() {
		
	}
	public void add(double value) {
		sum+=value;
		count++;
		if(value>this.value) {
			this.value = value;
		}
	}
	
	public double getAverage() {
		if(count==0) {
			return 0;
		}
		return sum/count;
	}
	public double getMax() {
		if(count==0){
			return 0;
		}
		return value;
	}
}
