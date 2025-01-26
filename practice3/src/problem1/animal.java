package problem1;

public class animal {
	private String name;
	public animal() {
		name = "no_name_yet";
	}
	public animal(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String color(String color) {
		String col = "Black";
		return col;
	}
	public String color() {
		return "No";
	}
}
