package petManagementSystem;

public class Fish extends Animal{

	Fish(String name, int age) {
		super(name, age);
	}

	public String getSound() {
		return "bulk-bulk";
	}

	@Override
	public void canRunAway() {
		System.out.print(getSound());
		super.canRunAway();
	}

}
