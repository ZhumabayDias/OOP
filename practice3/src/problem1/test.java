package problem1;

public class test {

	public static void main(String[] args) {
		cat Cat = new cat();
		System.out.println(Cat.getVoice());
		animal a = new animal();
		System.out.println(Cat.getName());
		System.out.println(Cat.color("blue"));
		System.out.println(Cat.color());
	}

}
