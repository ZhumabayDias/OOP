package prepareformidterm;

public class Car2 extends Vehicle {
	int acceleration;
	
	Car2(int speed,int acceleration) {
		super(speed);
		this.acceleration = acceleration;
	}
	public int move() {
		return super.speed*acceleration;
	}
}
