package petManagementSystem.copy;

public class Employee extends Person{
	String work;
	Employee(String name, int age,String work) {
		super(name, age);
		this.work = work;
	}
	public String getOccupation() {
		return work;
	}
	public String toString(){
		if(this.pet != null) {
			return super.toString()+",work is:" + work;
		}
		else
			return super.toString()+",work is:" + work;
	}

}
