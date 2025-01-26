package laboratory5;
import java.util.*;
public class DragonLaunch {
	private static Vector<Person> launch;
	private static Vector<Person> kidnapped;
	private static  int count = 0;
	private gender gender;
	 
	DragonLaunch(){
		launch = new Vector<Person>();
		kidnapped = new Vector<Person>();
				
	}
	
	public void kidnap(Person p) {
		launch.add(p);
		kidnapped.add(p);
		count++;
		
		Person pos_last;
		Person pos_prev_last;
		
		if(count>=2) {
			pos_last = launch.get(count-1);
			pos_prev_last = launch.get(count-2);
			if(pos_last.getGender()== gender.GIRL && pos_prev_last.getGender()==gender.BOY) {
				launch.remove(pos_last);
				launch.remove(pos_prev_last);
				count-=2;
			}
		}
	}
	public boolean willDragonEatOrNot() {
		return !launch.isEmpty();
	}
		
	}

