package quiz3;

public class Test {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature('C');
		Temperature temp2 = new Temperature(132);
		Temperature temp3 = new Temperature(0,'C');
		Temperature temp4 = new Temperature();
		
		System.out.println(temp1.getTemperatureFahrenheit());
		System.out.println(temp4.getTemperatureCelcius());
	}

}
