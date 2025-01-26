package prepareformidterm;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void SetAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "Name is:"+name;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Person)) return false;
		
		Person human = (Person)o;
		return Objects.equals(name, human.name)&&age==human.age;
	}
	public int hashCode() {
		return Objects.hash(name,age);
	}
}
