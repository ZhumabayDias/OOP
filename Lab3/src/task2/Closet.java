package task2;

public class Closet implements Moveable{
	int weight;
	String material;
	int velocity;
	String direction;
	Closet(int weight,String material,int velocity,String direction){
		this.weight = weight;
		this.material = material;
		this.velocity = velocity;
		this.direction = direction;
	}
	@Override
	public void move() {
		if(weight<100) {
		System.out.println("Moving...");}
		else {
		System.out.println("We cant move.Call the robots.");
		}
		
	}
	
	public String toString() {
		return "Weight = "+weight+",material is "+material+",velocity = "+velocity;
	}
	
	@Override
	public int velocity() {
		return velocity;
	}
	public void viewDirection() {
		System.out.println("the boat's heading "+ direction);	
	}

	@Override
	public void increaseVelocity(int a) {
		velocity = velocity + a;
	}

}
