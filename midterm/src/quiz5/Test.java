package quiz5;

public class Test {

	public static void main(String[] args) {
		DragonLaunch launch = new DragonLaunch();
		launch.kidnap(new Person("A",Gender.BOY));   
	    launch.kidnap(new Person("B",Gender.GIRL)); 
	    launch.kidnap(new Person("C",Gender.GIRL));    
	    launch.kidnap(new Person("E",Gender.GIRL)); 
	    System.out.println(launch.willDragonEatOrNot());
		
	}

}
