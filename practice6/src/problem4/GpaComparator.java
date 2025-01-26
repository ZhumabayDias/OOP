package problem4;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student>{
	
	public int compare(Student o1, Student o2) {
		return o1.compareTo(o2);
	}

}
