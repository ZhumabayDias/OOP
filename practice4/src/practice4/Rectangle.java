package practice4;

public class Rectangle extends Shape{
	int a;
	int b;
	public Rectangle(int position, Color color, int a, int b) {
		super(position, color);
		this.a = a;
		this.b = b;
	}
	@Override
	public String draw() {
		return (char)9679 + "";
		
	}

}
