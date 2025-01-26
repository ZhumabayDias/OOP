package laboratory2;

import laboratory2.Dormitoory.campus;

public class test {

	public static void main(String[] args) {
		Dormitoory student1 = new Dormitoory("diad", campus.first);
        Dormitoory student2 = new Dormitoory("dias", campus.second);

        student1.count();
        student2.count(40);

        System.out.println("Student1 name: " + student1.getNameOfStudent()  + ",study time: " + student1.getstudytime() + " number of campus  " + student1.getCampus());
        System.out.println("Student2 name:  " + student2.getNameOfStudent() + ", study time: " + student2.getstudytime() + ", campus: " + student2.getCampus());
        System.out.println("Count of students: " + Dormitoory.getCountOfStudents());
    

	}

}
