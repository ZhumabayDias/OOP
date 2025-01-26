package task4;
import java.util.Date;
import java.util.Objects;
public class Employee extends Person implements Comparable<Employee>,Cloneable{
	double salary;
	Date hireDate;
	String insuranceNumber;
	
	public Employee(String name,double salary,Date hireDate,String insuranceNumber){
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Date getHireDate() {
		return hireDate;
	}


	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}


	public String getInsuranceNumber() {
		return insuranceNumber;
	}


	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	public String toString() {
		return "Name is "+name+", salary:"+salary+", started work "+ hireDate+", insurance number is "+ insuranceNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(hireDate, other.hireDate) && Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(salary,hireDate,insuranceNumber);
		}

	@Override
	public int compareTo(Employee o) {
		if(this.salary > o.salary) return 1;
		else if(this.salary < o.salary) return -1;
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.hireDate = (Date) this.hireDate.clone();
		return e;
	}
	
}
