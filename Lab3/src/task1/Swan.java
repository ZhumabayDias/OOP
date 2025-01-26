package task1;

public class Swan extends Birds implements HaveWings{
	String name;
	String color;
	Swan(String name,String color){
		this.name = name;
		this.color = color;
	}
	@Override
	public void fly() {
		System.out.println("try...");
		
	}
	
}
