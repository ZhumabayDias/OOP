package prpoblem1;

import java.util.Random;

public class PersonBank {
	
	Random rand = new Random();
	
	int haveMoney;
	
	public PersonBank(){
		this.haveMoney = rand.nextInt(1000);
	}
	
	public int money(){
		return haveMoney;
	}
	
	
	public void withdraw(int a) {
		haveMoney = haveMoney - a;
	}
	
	
}
