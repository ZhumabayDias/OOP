package task4;
import java.util.* ; 
public class Test {
	public static void main(String[] args) {
		System.out.println();  
		Date hireDate1 = new Date() ; 
		Date hireDate2 = new Date(hireDate1.getTime() - 864000000L);
		Date hireDate3 = new Date(hireDate1.getTime() - 1728000000L);
		
		
		Employee e1 = new Employee("Steve", 100000 , hireDate1 ,"KZ23241") ;
		Employee e2 = new Employee("Smith" , 200000 , hireDate2 , "KZ101010"); 
		
		Employee e3 = new Employee("Many", 200000 , hireDate3 , "KZ23241") ;
		Employee e4 = new Employee("Steve", 100000 , hireDate1 ,"KZ23241") ; 
		
		Manager m1 = new Manager("Johnson" , 1020000 , hireDate2 , "KZ3292482" , 10000);
		Manager m2 = new Manager("Jordan" , 2000000 , hireDate3 , "KZ329484" , 12000) ;
		m1.add(e1); 
		m1.add(e2);
		m2.add(e3);
		m2.add(e4);
		System.out.println(e1); 
		System.out.println(e2); 
		System.out.println(m1) ; 
		
		System.out.println("e1 equals e2 : " + e1.equals(e2)); 
		System.out.println("e1 equals e4 : " + e1.equals(e4)); 
		System.out.println("m1 equals m2 : " + m1.equals(m2)); 		
		
		
		try {
			Employee cloneEmp1 = (Employee) e1.clone() ;
			System.out.println("Clone employee : " + cloneEmp1);			
		}catch(CloneNotSupportedException e) {
			e.getMessage() ;
		}
		
		try { 
			Manager cloneM1 = (Manager) m1.clone(); 
			System.out.println("Manager employee : " + cloneM1) ;
		}catch(CloneNotSupportedException e) {
			e.getMessage() ; 
		}
		
		
		System.out.println("e1 compare e2 : " + e1.compareTo(e2)) ; 
		System.out.println("m1 compare m2 : " + m1.compareTo(m2)); 
		
		System.out.println("-------Sort with name----------"); 
		
		Vector <Employee> employees = new Vector<>() ; 
		employees.add(e1);  
		employees.add(e2); 
		employees.add(e3); 
		employees.add(e4); 
		employees.sort(new NameComparator());
		for(Employee employee : employees) {
			System.out.println(employee); 
		}
		
		System.out.println("----Sort w Hire Date ----"); 
		employees.sort(new HireDateComparator());
		for(Employee employee : employees) {
			System.out.println(employee) ; 
		}
		System.out.println("---Compare w salary"); 
		Collections.sort(employees);
		for(Employee e : employees) {
			System.out.println(e) ; 
		}
	}
}