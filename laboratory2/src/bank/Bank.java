package bank;

import java.util.Vector;

public class Bank {
		private Vector<Account> account;
		Bank(){
			account = new Vector<>();
		}
		public void openAcc(Account a) {
			account.add(a);
		}
		public void closeAcc(Account a) {
			account.remove(a);
		}
		public void updateAcc() {
			for(Account a:account) {
				if(a instanceof SavingsAccount) {
					((SavingsAccount) a).deposit();
				}
				else if(a instanceof CheckingAccount) {
					((CheckingAccount) a).deductFee();
				}
			}
		}
		 public void displayAccounts() {
		        for (Account acc : account) {
		            System.out.println(acc);
		        }
		    }
	}
