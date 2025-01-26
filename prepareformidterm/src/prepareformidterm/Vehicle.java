package prepareformidterm;

public class Vehicle {
	int speed;
	Vehicle(int speed){
		this.speed = speed;
	}
	
	public int move() {
		return speed*speed;
	}
}
