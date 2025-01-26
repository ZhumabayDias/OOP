package Users;

public class Dean extends User{

	private static Dean dean = new Dean();
	
	public Dean() {
		super("zh_azamat", "dean123");
	}
	
	public static Dean getDean() {
		return dean;
	}
	
}
