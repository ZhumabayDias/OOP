package petManagementSystem;

public class Cat extends Animal{

	Cat(String name, int age) {
		super(name, age);
	}

	public String getSound() {
		return "myau ";
	}

	@Override
	public void canRunAway() {
		System.out.print(getSound());
		super.canRunAway();
	}
}
