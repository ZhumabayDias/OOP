package petManagementSystem;

public class Dog extends Animal{

	Dog(String name, int age) {
		super(name, age);
	}

	public String getSound() {
		return "Gav gav ";
	}

	@Override
	public void canRunAway() {
		System.out.print(getSound());
		super.canRunAway();
		
		
	}

}
