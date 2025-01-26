package petManagementSystem.copy;

import java.util.Objects;

public abstract class Person {
	private String name;
	private int age;
	Animal pet;
	Person(String name,int age){

		this.name = name;
		this.age = age;
	}
	public void assignPet(Animal pet) {
		if(this instanceof PhDStudent && pet instanceof Dog) {
			System.out.println("Не может иметь этого питомца");
		}
		else if(this.pet != null) {
			System.out.println(name+ " owns " + this.pet);
		}
		else
			this.pet = pet;
	}
	public void removePet() {
		this.pet = null;
	}
	public String hasPet(){
		if(this.pet == null) {
			return "Потомец нет";
		}
		else return "Питомец есть";
	}
	public abstract String getOccupation();
	
	public String toString(){
		if(this.pet != null) {
			return "name is:" + name + ", age:"+age+",pet is:"+ pet;
		}
		else
			return "name is:" + name + ", age:"+age;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(pet, other.pet);
	}
	
	public void leavePetWith(Person p) {
		if(this.pet!=null) {
			if(p instanceof PhDStudent && pet instanceof Dog) {
				System.out.println("Не может иметь этого питомца");
				}
			else {
				p.assignPet(pet);
				this.removePet();
			}
			}
		else System.out.println("У вас нет питомца");
	}
	public void retrievePerFrom(Person p) {
		this.assignPet(p.pet);
		p.removePet();
	}
	
	
	
	
	
	
	
}
