package bonus2;


public class Test {

	public static void main(String[] args) {
		Person[] persons = {
	            new Person("Axa"),
	            new Person("bav"),
	            new Person("ef"),
	            new Person("grgefs"),
	            new Person("tgrrs")
	        };
		Detective det = new Detective("foi");
		for (int i=0;i<persons.length;i++) {
            if (det.isSpy(persons[i])) {
                persons[i] = det.detected(persons[i]);
                System.out.println(persons[i].getName() +" is spy.");
          
            }
            else System.out.println(persons[i].getName()+" is person.");
        }
		
		for(Person person:persons) {
			System.out.println(person.getName()+" "+ person.getClass());
		}
	}
}