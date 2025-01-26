package task1;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Audi audi = new Audi("a6","black",210);
		Mercedes merc = new Mercedes("s","white",180);
		Swan swan = new Swan("Beautiful","white");
		Chicken chic = new Chicken("Big","black");
		
		Birds birds = new Birds();
		birds.canFly(chic);
		birds.canFly(swan);
		merc.needRepair();
		audi.showVelocity();
		audi.increaseVelocity();
		

	}

}
