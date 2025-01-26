package laboratory2;

public class Dormitoory {
		public enum campus{
			first,second,third;
		}
		private static final int studyminmax = 90;
		private final String nameOfStudent;
		private campus numberOfCampus;
		private static int countOfStudents;
		private int min;
		
		static {
			countOfStudents = 0;
		}
		{
			min = 0;
		}
		public Dormitoory(String nameOfStudent, campus numberOfCampus) {
			this.nameOfStudent = nameOfStudent;
			this.numberOfCampus = numberOfCampus;
			countOfStudents++;
		}
		public void count(int minut) {
			this.min += minut;
			if(this.min<=studyminmax) {
				this.min = studyminmax;
			}
		}
		public void count() {
			count(25);
		}
		public static int getCountOfStudents(){
			return countOfStudents;
		}
		public campus getCampus() {
			return this.numberOfCampus;
		}
		public int getstudytime() {
			return min;
		}
		public String getNameOfStudent() {
			return nameOfStudent;
		}
	}









