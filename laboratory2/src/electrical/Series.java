package electrical;

public class Series extends Circuit{
	private Circuit c1;
	private Circuit c2;
	private double V;
	
	public Series(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public double getResistance() {
		return c1.getResistance() + c2.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return V;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.V = V;
		c1.applyPotentialDiff(c1.getResistance()/getResistance()*V);
		c2.applyPotentialDiff(c2.getResistance()/getResistance()*V);
	}

}
