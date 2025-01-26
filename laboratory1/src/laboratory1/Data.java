package laboratory1;

public class Data {
	private double max;
	private double sum;
	private int count;
	
	public Data(){
		max =0;
		sum =0;
		count = 0 ;
		}
	
	public void add(double value){
		sum = sum + value;
		if(value>max) {
			max = value;
		}count++;
	}
	public double getAverage() {
		if(count == 0) {
			return 0;
		}else {
			return sum/count;
		}
	}
	public double getMax() {
		if(count == 0) {
			return 0;
		}else {
			return max;
		}
	}

}
