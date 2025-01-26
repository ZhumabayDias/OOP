package petManagementSystem;

import java.util.Vector;

public class PersonRegistry implements Cloneable{
	Vector<Person> people;
	PersonRegistry(){
		people = new Vector<Person>();
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
	public void sortPeople() {
	for(int i=0;i<people.size();i++) {
		for(int j=i+1;j<people.size();j++) {
			if(people.elementAt(i).compareTo(people.elementAt(j))==1) {
					Person p = people.elementAt(i);
					people.set(i, people.elementAt(j));
					people.set(j, p);
				}
			}
		}
	}
//	public int size() {
//		return people.size();
//	}
	
}
