package task5;
import java.util.Date;
import task4.Employee; 
public class Test {
	public static void main(String[] args) {
		System.out.println(); 
		Chocolate[] chocolates = {
				new Chocolate("Snikers" , 150),
				new Chocolate("Kazakhstan" , 200), 
				new Chocolate("Kit Kat" , 180) 
		};
		
		System.out.println("---Sort---");
		Sort.bubbleSort(chocolates);
		for(Chocolate chocolate : chocolates) {
			System.out.println(chocolate) ; 
		}
		
		System.out.println("---------------");
		Time[] namazTime = {
				new Time(17,53,0), //Құптан
				new Time(11,39,0), //Бесін
				new Time(0,0,3),//Таң
				new Time(14,53,0), //Екінті
				new Time(16,35,0),  //Ақшам
		};
		
		System.out.println("-----Sort-----"); 
		Sort.mergeSort(namazTime,0,namazTime.length-1);
		for(Time time : namazTime) {
			System.out.println(time.toUniversal()); 
		}
		
		System.out.println("----Sort----") ;
		Date hireDate = new Date() ;
		Date hireDate1 = new Date(hireDate.getTime() - 864000000L) ; 
		Date hireDate2 = new Date(hireDate.getTime() - 1728000000L)  ;  
		Employee[] employees = {
				new Employee("Steve Jobs" , 200000 , hireDate ,"KZ32408"), 
				new Employee("Mark Zuckerberg" , 4001130  , hireDate1,"KZ393202"), 
				new Employee("Durov" , 232234 , hireDate2, "KZDn2084")
		}; 
		
		Sort.bubbleSort(employees);
		for(Employee e : employees) {
			System.out.println(e) ; 
		}
	}
}