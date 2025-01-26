package prpoblem1;

public class Restaurant {
	boolean servePizza(CanHavePizza eater){
		eater.eatPizza();
		if(eater instanceof Person) {
			 PersonBank bank = new PersonBank();
			 if(bank.money()>100) {
				 bank.withdraw(100);
				 System.out.println("Спасибо!Приходите еще.");
			 }
			 else {
				 System.out.println("Посуды ждет вас!!!");
			 }
		}
		else if (eater instanceof Cat) {
            System.out.println("Вам конец!");
        }
		return true;
	}
}
