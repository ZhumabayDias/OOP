package aaaaa;

public class Book {
	String name;
	double price;
	Author[] authors;
	int qty = 0;
	Book(String name,double price,Author[] authors){
		this.name = name;
		this.price = price;
		this.authors=authors;
	}
	Book(String name,double price,Author[] authors,int qty){
		this.name = name;
		this.price = price;
		this.authors=authors;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return "Book[name = "+name+"authors={Author[name
	}
	
	
}

