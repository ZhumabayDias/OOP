package practice4;

public class Triangle extends Shape{
	int height;
	public Triangle(int position, String asciiCode) {
		super(position, asciiCode);
	}

	@Override
	public String draw() {
		return (char)9650 + "";
	}

}
