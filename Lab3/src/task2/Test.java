package task2;

public class Test {

	public static void main(String[] args) {
		Boat b = new Boat("Maria",100,"North");
		Closet c = new Closet(120,"wood",1,"South");
		Car car = new Car("Audi a6","101 AAA 11","North",100);
		People p = new People("Dias",3,"West");
		b.increaseVelocity(2);
		b.setDirection("South");
		System.out.println(b.toString());
		c.move();
		car.move();
		p.canSwim();
		
	}

}
