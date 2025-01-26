package bank;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0;
		accNumber = a;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accNumber;
	}
	public void deposit(double sum) {
		balance += sum;
	}
	public void withdraw(double sum) {
		balance -= sum;
	}
	public void transfer(double amount,Account a) {
		balance -= amount;
		a.deposit(amount);
	}
	public String toString() {
		return "Account number is:"+accNumber+",balance:"+balance;
	}
	public final void print() {
		System.out.println(toString());
	}
}
