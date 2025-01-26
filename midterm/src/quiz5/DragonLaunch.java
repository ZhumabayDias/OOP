package quiz5;

import java.util.Vector;

public class DragonLaunch {
	private static Vector<Person> people;
	private Gender gen;
	private static int count = 0;
	
	DragonLaunch(){
		people = new Vector<Person>();
	}
	
	public void kidnap(Person p) {
		people.add(p);
		count++;
	}
	public String willDragonEatOrNot() {
		while(count>1) {
			if(people.get(count-2).getGender()==gen.BOY && people.get(count-1).getGender() == gen.GIRL){
				people.removeLast();
				people.removeLast();
				count-=2;
			}
			else count=-1;
		}
		if(people.isEmpty()) {
			return "NO";
		}
		else return "YES";
	}
	
}