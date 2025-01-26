package laboratory3;

public class Temperature {
	private double tempvalue;
	private char scale;
	
	public Temperature(){
		this.tempvalue = 0;
		this.scale = 'C';
	}
	public Temperature(double tempvalue , char scale) {
		this.tempvalue = tempvalue;
		this.scale = scale;
	}
	public Temperature(double tempvalue) {
		this.tempvalue = tempvalue;
		this.scale = 'C';
	}
	public Temperature(char scale) {
		this.tempvalue = 0;
		this.scale = scale;
	}
	
	
	public double getCelcius() {
		if(scale == 'C') {
			return tempvalue;
		}
		else {
			return 5*(tempvalue-32)/9;
		}
	}
	public double getFahrenheit() {
		if(scale == 'F') {
			return tempvalue;
		}else {
			return (9*(tempvalue/5))+32;
		}
	}
	public void setTempvalue(double tempvalue) {
		this.tempvalue = tempvalue;
	}
	public void setScale(char scale) {
		this.scale = scale;
	}
	public void setBoth(double tempvalue,char scale) {
		this.tempvalue = tempvalue;
		this.scale = scale;
	}
	public char getScale() {
		return scale;
	}
	

}
























