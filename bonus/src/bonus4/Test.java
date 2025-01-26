package bonus4;

public class Test {

	public static void main(String[] args) {
		World w = new World();
		Slima s = new Slima(10,10,25);
		Food f = new Food(25,25);
		
		if(s.canReach(f.getX(), f.getY())) {
			System.out.println("Slime can.");
		}
		else System.out.println("Slime cant.");

	}

}
