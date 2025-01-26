package task1;

public class Mercedes extends Car{

	int maxSpeed;
	int speed;
	{
		speed = 0;
	}
	Mercedes(String model, String color,int maxSpeed) {
		super(model, color);
		this.maxSpeed = maxSpeed;
	}

	@Override
	void CanMove() {
		System.out.println("Dont moving");
		
	}

	@Override
	void increaseVelocity() {
		speed=+0;
		
	}

	@Override
	void showVelocity() {
		System.out.println("Speed is " + speed);
		
	}

}
