package lab1;
import java.util.Scanner;
public class Analyzer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    Data data = new Data();
		while(true) {
			System.out.print("Enter number (Q to quit):");
			String s = scanner.next();
			if(s=="Q") {
				break;
			}
			else data.add(Integer.valueOf(s));
		}
		System.out.println(data.getAverage());
		System.out.println(data.getMax());
	}

}
