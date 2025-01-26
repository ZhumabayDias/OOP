package petManagementSystem.copy;

import java.util.Vector;

public class PersonRegistry {
	Vector<Person> people;
	PersonRegistry(){
		people = new Vector<>();
	}
	public void adding(Person p) {
		people.add(p);
	}
	public void removing(Person p) {
		people.remove(p);
	}
	public String peopleWithPets(){
		StringBuilder result = new StringBuilder();
		for(Person p:people) {
			if(p.pet != null) {
				result.append(p.toString()).append("\n");
			}
		}return result.toString();
	}
	public String peopleWithoutPets(){
		StringBuilder result = new StringBuilder();
		for(Person p:people) {
			if(p.pet == null) {
				result.append(p.toString()).append("\n");
			}
		}return result.toString();
	}
	public String toString() {
	    StringBuilder result = new StringBuilder();
	    for (Person p : people) {
	        result.append(p.toString()).append("\n"); // добавляем каждого человека и перевод строки
	    }
	    return result.toString();
	}
}
