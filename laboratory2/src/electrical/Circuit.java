package electrical;

public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	public double getPower() {
		double r = getResistance();
		double v = getPotentialDiff();
		return v*v/r;
	}
	public double getCurrent() {
		double r = getResistance();
		double v = getPotentialDiff();
		return v/r;
	}
}
