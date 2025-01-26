package task1;

public class Audi extends Car{
	int maxSpeed;
	int speed;
	{
		speed = 10;
	}
	Audi(String model, String color,int maxSpeed) {
		super(model, color);
		this.maxSpeed = maxSpeed;
	}

	@Override
	void CanMove() {
		System.out.println("moving");
		
	}

	@Override
	void increaseVelocity() {
		speed =+10;
	}

	@Override
	void showVelocity() {
		System.out.println("speed is "+speed);
	}

}
