package practice;
import java.util.HashSet;
import java.util.Scanner;
public class Test {
	private static HashSet<Person> people = new HashSet<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Что хочешь сделать?(1 или 2 или 3)");
			System.out.println("1:Вывести информацию обо всех");
			System.out.println("2:Добавить новое лицо");
			System.out.println("3:Я закончил!!!");
			System.out.print("Выбираю:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if(choice == 1) {
				for(Person person:people) {
					System.out.println(person);
				}
			}
			if(choice == 2) {
				System.out.println("Вводи имя и адрес");
				System.out.print("Имя:");
				String name = scanner.nextLine();
				System.out.print("Адрес:");
				String address = scanner.nextLine();
				System.out.println("Куда хочешь добавить?(1 или 2 или 3");
				System.out.println("1:Человек");
				System.out.println("2:Студент");
				System.out.println("3:Сотрудник");
				System.out.print("Выбираю:");
				int choice2 = scanner.nextInt();
				scanner.nextLine();
				if(choice2 == 1) {
					people.add(new Person(name,address));
			
				}
				else if(choice2 == 2) {
					System.out.print("Программа:");
					String program = scanner.nextLine();
					System.out.print("Год:");
					int year = scanner.nextInt();
					System.out.print("Плата:");
					double fee = scanner.nextDouble();
					scanner.nextLine();
					people.add(new Student(name,address,program,year,fee));
				}
				else if(choice2 == 3){
					System.out.print("Школа:");
					String school = scanner.nextLine();
					System.out.print("Оплата:");
					double pay = scanner.nextDouble();
					scanner.nextLine();
					people.add(new Staff(school,pay,name,address));
				}
				else System.out.println("Только 1 или 2 или 3");
			}
			if(choice==3) {
				System.out.println("Все");
				scanner.close();
				break;
			}
		}
	}
}
		
	
	

