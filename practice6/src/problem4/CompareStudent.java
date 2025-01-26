package problem4;
import java.util.Collections;
import java.util.Vector;
public class CompareStudent {

	public static void main(String[] args) {
		Vector<Student> students = new Vector<Student>();
		Student s = new Student("stu1",3.2);
		Student s1 = new Student("atu2",3.1);
		Student s2 = new Student("btu3",3.6);
		Student s3 = new Student("ttu4",3.5);
		Student s4 = new Student("utu5",3.09);
		Student s5 = new Student("qtu6",2.87);
		
		students.add(s);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
//		Collections.sort(students, new NameComparator());
//		Collections.sort(students, new GpaComparator());
		
		for(int i=0;i<students.size();i++) {
			for(int j=i+1;j<students.size();j++) {
				if(students.elementAt(i).compareTo(students.elementAt(j))==1) {
					Student temp = students.elementAt(i);
					students.set(i, students.elementAt(j));
					students.set(j, temp);
				}
			}
		}
		
//		for(Student stu:students) {
//			System.out.println(stu.toString());
//			
//		}
		
		int[] number = {1,2 ,3, 4, 1, 1, 4, 5, 2, 1};
		int max = 5;
		int[] count = new int[max+1];
		for(int numb:number) {
			count[numb]++;
		}
		for (int i = 0; i < count.length; i++) {
			 for (int j = 0; j < count[i]; j++) {
                System.out.print(i + " ");}
        }
	}

}
