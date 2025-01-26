package bonus2;

public class Detective extends Person{
	Detective(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	int i =0;
	public boolean isSpy(Person p) {
		while(true) {
			if( Math.pow(2, i) == generateRandom() ) {
				return true;
			}
			else if(  Math.pow(2, i) > generateRandom() ) {
				return false;
			}i++;
		}
	}	
	
	public Person detected(Person p) {
		return new Spy(p.getName());
	}
}
