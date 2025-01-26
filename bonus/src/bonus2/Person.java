package bonus2;

import java.util.Random;

public class Person {
	String name;
	Person(String name){
		this.name = name;
	}
	Random rand = new Random();
	public int generateRandom() {
		int generation = rand.nextInt()%10;
		return generation;
	}
	public String getName() {
		return name;
	}
}
