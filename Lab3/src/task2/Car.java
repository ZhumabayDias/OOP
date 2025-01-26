package task2;

public class Car implements Moveable{
	String model;
	String number;
	String direction;
	int velocity;
	Car(String model,String number,String direction,int velocity){
		this.model = model;
		this.number= number;
		this.direction = direction;
		this.velocity = velocity;
	}
	@Override
	public void move() {
		System.out.println("moving");
		
	}
	@Override
	public int velocity() {
		return velocity();
	}
	@Override
	public void viewDirection() {
		System.out.println("Direction is "+direction);
		
	}
	@Override
	public void increaseVelocity(int a) {
		velocity=+a;
	}
}
