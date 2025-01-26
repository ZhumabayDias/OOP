package practice4;

public class Circle extends Shape{
	int radius;
	public Circle(int position, Color color) {
		super(position, color);
	}

	@Override
	public String draw() {
			return (char)9679 + "";
		
	}

}
