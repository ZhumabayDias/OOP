package quiz5;

public class Person {
	public Gender gender;
	private String name;
	public String toString() {
		return name;
	}
	public Person(String name,Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	public Gender getGender() {
		return gender;
	}
}
