package task1;

public class Chicken extends Birds implements HaveWings,Moveable{
	String name;
	String color;
	Chicken(String name,String color){
		this.name = name;
		this.color = color;
	}
	@Override
	public void fly() {
		System.out.println("try...");
		
	}
	@Override
	public void moveable() {
		System.out.println("Moving");
		
	}
}
