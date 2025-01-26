package petManagementSystem.copy;

public class Test {

	public static void main(String[] args) {
		Person john = new Employee("John", 30, "Engineer");
		Person alice = new PhDStudent("Alice", 26, "Comp. Science");
		Person dias = new PhDStudent("dias", 22, "Comp. Science");
		Dog rex = new Dog("Rex", 2);
		Animal murka = new Cat("Murka", 5);
		john.assignPet(rex);
		john.assignPet(murka); // John owns Rex
		alice.assignPet(murka);
		PersonRegistry registry = new PersonRegistry();
		registry.adding(john);
		registry.adding(alice);
		registry.adding(dias);
		// John goes on vacation and leaves Rex with Alice
		john.leavePetWith(alice);
		alice.leavePetWith(dias);
		alice.leavePetWith(john);
		// Registry reflects that Alice is taking care of Rex
		System.out.println(registry);
		// John returns from vacation and retrieves Rex
		john.retrievePerFrom(alice);
		alice.retrievePerFrom(dias);
		// Registry reflects that John has his dog back
		System.out.println(registry);
		
		
		System.out.println(registry.peopleWithPets());
		System.out.println(registry.peopleWithoutPets());
		
	}
}
