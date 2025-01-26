package laboratory5;

public class Person {
	public String name;
	public gender gender ;
	
	public Person(String name,gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public gender getGender() {
		return gender;
	}
	public String toString() {
		return "name: "+name;
	}
}
