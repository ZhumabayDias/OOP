package problem2;

public class Cat extends Animal implements CanHavePizza{

	Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void ServePizza() {
		System.out.println("myau-myau(Please give me a pizza!)");
		
	}

}
