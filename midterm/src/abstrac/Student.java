package abstrac;

public class Student extends Animal {
	Student(String vid){
		super(vid);
	}
	public String getVid() {
		return "vid is" + vid;
	}
	
}
