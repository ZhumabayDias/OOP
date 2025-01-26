package laboratory3;

public class test {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature(100 , 'C');
		Temperature temp3 = new Temperature(212 , 'F');
		temp1.setScale('F');
		System.out.println(temp1.getCelcius());
		System.out.println(temp2.getFahrenheit());
		System.out.println(temp3.getCelcius());
	}

}
