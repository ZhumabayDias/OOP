package quiz3;

public class Temperature {
	private double temperature;
	private char scale;
	
	public Temperature(char scale){
		temperature = 0;
		this.scale = scale;
	}
	public Temperature(double temperature) {
		this.temperature = temperature;
		scale = 'C';
	}
	Temperature(double temperature,char scale){
		this.temperature = temperature;
		this.scale = scale;
	}
	Temperature(){
		scale = 'C';
		temperature = 0;
	}
	
	public double getTemperatureCelcius() {
		if(scale == 'C') {
			return temperature;
		}
		else
			return 5*(temperature-32)/9;
	}
	public double getTemperatureFahrenheit() {
		if(scale=='F') {
			return temperature;
		}
		else
			return 9*(temperature-5)+32;
	}
	public char getScale(){
		return scale;
	}
	public void setValue(double temperature) {
		this.temperature = temperature;
	}
	public void setScale(char scale) {
		this.scale = scale;
	}
	public void SetBoth(double temperature,char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
}	
