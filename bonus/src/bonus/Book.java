package bonus;

public class Book {
	private String name;
	private boolean available = true;
	
	
	public Book(String name) {
		this.name = name;
		this.available = true;
	}


	public String getName() {
		return name;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}
