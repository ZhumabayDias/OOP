package abstrac;

import java.util.Objects;

public abstract class Animal {
	String vid;
	Animal(String vid){
		this.vid = vid;
	}
	public abstract String getVid();
}
