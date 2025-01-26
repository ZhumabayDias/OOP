package petManagementSystem;

public class Bird extends Animal{

	Bird(String name, int age) {
		super(name, age);
	}

	public String getSound() {
		return "chirik";
	}

	@Override
	public void canRunAway() {
		System.out.print(getSound());
		super.canRunAway(); 
	}
	
}
