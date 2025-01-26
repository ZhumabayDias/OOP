package laboratory5;

public class Tester {

	public static void main(String[] args) {
		DragonLaunch dragonLaunch = new DragonLaunch();

        dragonLaunch.kidnap(new Person("A",gender.BOY));   
        dragonLaunch.kidnap(new Person("B",gender.GIRL)); 
        dragonLaunch.kidnap(new Person("C",gender.GIRL));    
        dragonLaunch.kidnap(new Person("E",gender.GIRL)); 

        if (dragonLaunch.willDragonEatOrNot()) {
            System.out.println("Dragon have launch!");
        } else {
            System.out.println("Dragon have not launch.");
        }

	}

}
