package electrical;

public class Resistor extends Circuit {
	private double r;
	private double v;
	public Resistor(double r) {
		this.r = r;
	}
	@Override
	public double getResistance() {
		return r;
	}

	@Override
	public double getPotentialDiff() {
		return v;
	}

	@Override
	public void applyPotentialDiff(double V) {
		this.v = V;
	}
}
