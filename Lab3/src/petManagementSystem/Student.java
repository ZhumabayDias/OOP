package petManagementSystem;

public class Student extends Person{
	String work;
	Student(String name, int age,String work) {
		super(name, age);
		this.work = work;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getOccupation() {
		return work;
	}
	public String toString(){
		if(this.pet != null) {
			return super.toString()+" work is:" + work;
		}
		else
			return super.toString()+" work is:" + work;
	}
}
