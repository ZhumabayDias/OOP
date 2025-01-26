package petManagementSystem.copy;

public class PhDStudent extends Person{
	private String occupation;
	PhDStudent(String name, int age,String occupation) {
		super(name, age);
		this.occupation = occupation;
	}
	
	public String getOccupation() {
		return occupation;
	}
	public String toString(){
		if(this.pet != null) {
			return super.toString()+" occupation is:" + occupation;
		}
		else
			return super.toString()+" occupation is:" + occupation;
	}
}
