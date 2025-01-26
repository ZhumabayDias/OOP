package task1;


public class Birds {
	
	boolean canFly(HaveWings bird) {
		bird.fly();
		if(bird instanceof Swan) {
			System.out.println("I can fly");
		}
		else System.out.println("I cant fly");
		
		return true;
	}
	
}
