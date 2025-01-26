package midterm;
import java.util.Scanner;
public class Analyzer {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		    Data data = new Data();
		    boolean ok = true;
			while(ok) {
				System.out.print("Enter number (Q to quit):");
				String s = scanner.next();
				if(s.equals("Q")) {
					ok = false;
				}
				else data.add(Integer.valueOf(s));
			}
			System.out.println(data.getAverage());
			System.out.println(data.getMax());
		}
	}

