package task2;

public class Vessel implements Swimable{
	String name;
	int velocity;
	String direction;
	@Override
	public void canSwim() {
		System.out.println("Can swim");
		
	}
	public void move() {
		System.out.println("Начал движение");
		
	}
	
	public String toString() {
		return "name is "+name+",direction is "+direction+",velocity = "+velocity;
	}

	@Override
	public int velocity() {
		return velocity;
	}

	
	public void viewDirection() {
		System.out.println("The boat's heading "+ direction);	
	}

	@Override
	public void increaseVelocity(int a) {
		velocity = velocity + a;
	}
	
}
