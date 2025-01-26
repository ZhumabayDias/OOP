package practice2;

public class Student {
	private String name;
	private int id;
	private int yearofstudent;
	
	public Student(String name,int id){
		this.name = name;
		this.id = id;
		this.yearofstudent = 1;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getyear() {
		return yearofstudent;
    }

    public void incrementYearOfStudy() {
       yearofstudent++;
    }
	
    public static void main(String[] args) {
        Student student1 = new Student("Dias", 12345);
        Student student2 = new Student("Dias", 12345);
        Student student3 = new Student("Dias", 12345);
        Student student4 = new Student("Dias", 12345);
        Student student5 = new Student("Dias", 12345);
        Student student6 = new Student("Dias", 12345);
        Student student7 = new Student("Dias", 12345);
        Student student8 = new Student("Dias", 12345);
        Student student9 = new Student("Dias", 12345);
        System.out.println("Name: " + student1.getName()); 
        System.out.println("ID: " + student1.getId());      
        System.out.println("Year of study: " + student1.getyear());  

        student1.incrementYearOfStudy();
        System.out.println("Year of study after increment: " + student1.getyear());  
    }
}
