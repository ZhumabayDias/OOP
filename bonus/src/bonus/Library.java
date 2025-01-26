package bonus;

import java.util.Map;
import java.util.HashMap;
public class Library {
	private static Map <String,Book> books;
	private static  Map<Book,Person> getBook;
	
	public Library() {
		books = new HashMap<String,Book>();
		getBook = new HashMap<Book,Person>();
	}
	
	public void addBook(String name) {
		Book book = new Book(name);
		books.put(name,book);
	}
	
	public String getBook(String name,Person reader) {
		Book book = books.get(name);
		if(book.isAvailable() == false) {
			return "Книга уже выдано:" + getBook.get(book).getName();
		}
		else {
			book.setAvailable(false);
			getBook.put(book, reader);
		}
		return name+ ":взял " + getBook.get(book).getName();
	}
}
