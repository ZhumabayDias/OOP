package problem4;

public class Student implements Comparable{
	double gpa;
	String name;
	Student(String name,double gpa){
		this.gpa = gpa;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if(o==null) return 1;
		if(!(o instanceof Student)) return 1;
		Student s = (Student) o;
		if(this.gpa > s.gpa) {
			return 1;
		}
		else if(this.gpa < s.gpa) {
			return -1;
		}
		return 0;
	}
	
	double returnGpa(){
		return gpa;
	}
	
	public String toString() {
		return "name:" + name + ",gpa =" + gpa;
	}
	String returnName() {
		return name;
	}
}
