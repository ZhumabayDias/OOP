package task4;

import java.util.Objects;

public class Person {
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Person)) return false;
		Person p = (Person) o;
		return Objects.equals(name,p.name);
	}
	
	public int hashCode() {
		return name.hashCode();
	}
	
	public String toString() {
		return "name is "+name;
	}
	
}
