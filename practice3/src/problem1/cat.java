package problem1;

public class cat extends animal{
	private String voice_cat;
	public cat() {
		super();
		voice_cat = "myau";
	}
	public cat(String name,String voice) {
		super(name);
		voice_cat = voice;
	}
	public String getVoice() {
		return voice_cat;
	}
	public void setVoice(String voice) {
		voice_cat = voice;
	}
	public String color() {
		return "white";
	}
	public String color(String color) {
		return color;
	}
}
