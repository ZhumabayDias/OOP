package task2;

public class Boat implements Swimable{
	String name;
	int velocity;
	String direction;
	
	Boat(String name,int velocity,String direction){
		this.name = name;
		this.velocity = velocity;
		this.direction = direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	@Override
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
	@Override
	public void canSwim() {
		System.out.println("Can swim");
		
	}

}
