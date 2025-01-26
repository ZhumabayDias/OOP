package problem2C;

import java.util.Objects;

public class Dormitory extends Building{
	public int numberOfStudents; 
	public Dormitory(int height, String material,int numberOfStudents) {
		super(height, material);
		this.numberOfStudents = numberOfStudents;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dormitory dorm = (Dormitory) obj;
		return numberOfStudents == dorm.numberOfStudents;
	}
	public int hashCode() {
        return Objects.hash(super.hashCode(),numberOfStudents);
    }
	@Override
	public String toString() {
		return "Dormitory [numberOfStudents=" + numberOfStudents + "]";
	}
	
}
