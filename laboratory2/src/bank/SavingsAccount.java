package bank;

public class SavingsAccount extends Account{
	private double procent;
	public SavingsAccount(int a,double procent) {
		super(a);
		this.procent = procent;
	}
	public void deposit() {
		double afterProcent = getBalance() * (procent/100);
		deposit(afterProcent);
	}
	public String toString() {
		return super.toString()+",procent:"+procent;
	}
}
