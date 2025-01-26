package quiz2;

public class Library {
	public static int numberOfBooks = 0;
	public static final int maxBooks;
	private String nameOfBook;
	private int pageOfBook;
	private Colors book;
	private String authorName;
	
	static {
        maxBooks = 100;
    }
	
	public Library(String nameOfBook,int pageOfBook,String authorName) {
		this(nameOfBook,authorName);
		this.pageOfBook = pageOfBook;
		
	}
	public Library(String nameOfBook2,String authorName2) {
		nameOfBook = nameOfBook2;
		authorName = authorName2;
	}
	
	public void addBook() {
		numberOfBooks++;
	}
	
	public void addBook(int books) {
		numberOfBooks=+books;
	}
	
}
