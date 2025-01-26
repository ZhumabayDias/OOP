package problem2;

public class Student extends Person implements CanHaveRetake,CanHaveParty,Movable,CanHavePizza{
	int money;
	int velocity;
	{
		velocity = 5;
	}
	
	
	Student(int money,String name){
		super(name);
		this.money = money;
	}
	@Override
	public void ServePizza() {
		System.out.println("Please,give me a pizza");
		
	}

	@Override
	public void move() {
		System.out.println("I am moving");
		
	}

	@Override
	public void dance() {
		System.out.println("I am dancing");
		
	}

	@Override
	public int showMyMoney() {
		return money;
		
	}
	@Override
	public int move(int a) {
		return velocity+a;
	}
	
}
