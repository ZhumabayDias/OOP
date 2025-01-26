package bonus;

public class Test {

	public static void main(String[] args) {
		Library library = new Library();
		library.addBook("Harry Potter");
		library.addBook("Habbits");
		library.addBook("Java");
		Person student1 = new Person("Dias");
		Person student2 = new Person("Genius");
		System.out.println(library.getBook("Harry Potter", student2));
		System.out.println(library.getBook("Harry Potter", student1));
	}

}
