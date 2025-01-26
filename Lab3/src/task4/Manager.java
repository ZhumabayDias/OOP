package task4;


import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Comparable<Employee>,Cloneable{
	int bonus;
	Manager(String name, double salary, Date hireDate, String insuranceNumber,int bonus) {
		super(name, salary, hireDate, insuranceNumber);
		this.bonus = bonus;
	}
	Vector<Employee> employes = new Vector<>();
	
	void add(Employee e) {
		employes.add(e);
	}
	public String toString() {
		return super.toString() + " bonus "+bonus;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!super.equals(o)) return false;
		if(!(o instanceof Manager)) return false;
		Manager m = (Manager) o;
		
		return super.equals(o) && m.bonus == bonus;
	}

	
	public int compareTo(Employee e) {
		if(super.compareTo(e)==0 && e instanceof Manager) {
			Manager men = (Manager) e;
			if(this.bonus>men.bonus) return 1;
			if(this.bonus < men.bonus) return -1;
			return 0;
		}
		return super.compareTo(e);
	}

	public Object clone() throws CloneNotSupportedException {
		Manager cloned = (Manager) super.clone();
		Vector<Employee> cloneEmployees = new Vector<>();
		
		for(Employee e:employes) {
			cloneEmployees.add(e);
		}
		cloned.employes = cloneEmployees;
		
		return cloned;
	}
	
}
 