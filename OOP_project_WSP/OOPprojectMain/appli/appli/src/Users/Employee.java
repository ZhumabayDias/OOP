package Users;

public abstract class Employee extends User{
	private static final long serialVersionUID = 3L;
	private double salary;
	private boolean isPaid = false;

	public Employee(String name, String password) {
		super(name,password);
		this.salary = 150000;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	
	
}
