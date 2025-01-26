package laboratory1;
import java.util.Scanner;
public class Analyzer {

	public static void main(String[] args) {
		Data data = new Data();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Enter number (Q to quit): ");
			String input = scanner.next();
			if(input.equals("Q")) {
				break;
			}else {
				double value = Double.parseDouble(input);
				data.add(value);
			}
		}
		System.out.println("Average = "+ data.getAverage());
		System.out.print("Max = "+ data.getMax());
	}

}
