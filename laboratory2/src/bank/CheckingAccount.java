package bank;

public class CheckingAccount extends Account{
	private  int numberOfTransaction ;
	private static final int freeTransactions = 3 ;
	public CheckingAccount(int accNumber) {
		super(accNumber);
		numberOfTransaction = 0;
	}
	public void deposit(double amount) {
		super.deposit(amount);
		numberOfTransaction++;
	}
	public void withdraw(double amount) {
		super.withdraw(amount);
		numberOfTransaction++;
	}
	public void deductFee() {
		while (numberOfTransaction > freeTransactions) {
			super.withdraw(0.02);
			numberOfTransaction--;
		}
		numberOfTransaction = 0;
	}
	public String toString() {
		return super.toString()+",numberOfTransaction:"+numberOfTransaction;
	}
}
