package problem1;

public class Student {
	public String name;
	public int id;
	public int year_of_study;
	
	public Student(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void inc_year() {
		year_of_study++;
	}
	public int getYear() {
		return year_of_study;
	}
	
}
