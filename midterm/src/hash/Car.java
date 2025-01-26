package hash;

import java.util.Objects;

public class Car {
	String color;
	
	public Car(String color) {
		this.color = color;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Car)) return false;
		
		Car car =(Car)o;
		return Objects.equals(color, car.color);
	}
	public int hashCode() {
		return Objects.hash(color);
	}
}
