package hash;

public class Test {

	public static void main(String[] args) {
		Car car = new Car("fssdf");
		Car car2 = new Car("fssdf");
		System.out.println(car.equals(car2));
		System.out.println(car.hashCode() == car2.hashCode());

	}

}
