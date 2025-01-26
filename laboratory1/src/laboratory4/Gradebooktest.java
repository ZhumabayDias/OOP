package laboratory4;
import practice2.Student;
public class Gradebooktest {

	public static void main(String[] args) {
		  GradeBook gb = new GradeBook();
		  for(int i=1;i<25;i++) {
			  Student stu = new Student("student"+i,i);
		  }
		   
		  System.out.println("Highest grade: " + gb.getHighResult());
	      System.out.println("Lowest grade: " + gb.getLowResult());
		  System.out.println("Average: " + gb.getAverage());
		    

	}

}
