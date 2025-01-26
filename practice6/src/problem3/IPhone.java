package problem3;

public class IPhone extends Device implements SellableAndPluggable{
	int cost;
	
	IPhone(String name,int cost) {
		super(name);
		this.cost = cost;
	}

	@Override
	public int cost() {
		return cost;
	}

	@Override
	public void showModel() {
		System.out.println("Model is:"+name);
	}

}
