package electrical;

public class Parallel extends Circuit{
	private Circuit p1;
	private Circuit p2;
	private double V;
	
	public Parallel(Circuit p1, Circuit p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	public double getResistance() {
		double r1 = p1.getResistance();
        double r2 = p2.getResistance();
        
        return 1 / ((1 / r1) + (1 / r2));
	}

	@Override
	public double getPotentialDiff() {
		return V;
	}

	@Override
	public void applyPotentialDiff(double V) {
		 this.V = V;
	     p1.applyPotentialDiff(V);
	     p2.applyPotentialDiff(V);
	}

}
