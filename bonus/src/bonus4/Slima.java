package bonus4;

public class Slima {
	private int x;
	private int y;
	private int xp;
	
	public Slima(int x,int y,int xp) {
		this.x = x;
		this.y = y;
		this.xp = xp;
	}

	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public int getXp() {
		return xp;
	}
	
	public boolean canReach(int foodX,int foodY) {
		int distance = Math.abs(foodX-x) + Math.abs(foodY-y);
		if(distance>=xp) {
			return true;
		}
		return false;
	}
	
}
