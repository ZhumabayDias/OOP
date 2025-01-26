package practice4;

public abstract class Shape {
	int position;
	String color;
	 public Shape(int position, String asciiCode) {
		this.position = position;
		this.color = asciiCode;
	}
	public abstract String draw();
}
