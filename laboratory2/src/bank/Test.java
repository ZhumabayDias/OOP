package bank;

public class Test {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Account acc1 = new Account(1001);
		SavingsAccount acc2 = new SavingsAccount(1234, 35);
        CheckingAccount acc3 = new CheckingAccount(3333);
        bank.openAcc(acc1);
        bank.openAcc(acc2);
        bank.openAcc(acc3);
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc2.deposit(1000);
        acc2.withdraw(300);
        acc3.deposit(4400);
        acc3.deposit(442);
        acc3.deposit(441);
        acc3.withdraw(500);
        acc3.withdraw(300);
        acc1.transfer(100, acc3);
        
        bank.displayAccounts();
        
        bank.updateAcc();
        
        bank.displayAccounts();
        
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        
	}

}
