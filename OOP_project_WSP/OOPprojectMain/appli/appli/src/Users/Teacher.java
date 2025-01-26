package Users;

import java.util.Set;
import java.util.Vector;

import DBs.DBContext;
import OOPproject.ResearcherDecorator;
import enums.SchoolName;
import model.Attendance;
import model.Attestation;
import model.Course;
import model.Lesson;
import model.Request;
import Interfaces.Subscribers;
import Interfaces.Researchable;
import Interfaces.CanSendRequest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class Teacher extends Employee implements Researchable, Subscribers, CanSendRequest, Serializable {
  private static final long serialVersionUID = 1L;

  private SchoolName school;
  private Vector<Lesson> lessons;
  private List<Course> myCourses;
  private ResearcherDecorator researcher;
  
    public Teacher(String name, String password) {
    super(name, password);
    school = SchoolName.SITE;
    this.lessons = new Vector<>();
    this.myCourses = new ArrayList<>();
    this.researcher = new ResearcherDecorator(this);
  }

    /*public void putAttendance(Lesson lesson) {
      if(this.lessons.contains(lesson)) {
        lesson.addAttendance();
      }
    }*/
    
   
    public void addLesson(Lesson lesson) {
      this.lessons.add(lesson);
      DBContext.saveUsers();
    }
    
    public ResearcherDecorator getResearcher() {
		return researcher;
	}

	public void setResearcher(ResearcherDecorator researcher) {
		this.researcher = researcher;
	}

	public void setSchool(SchoolName school) {
		this.school = school;
	}

	public void setLessons(Vector<Lesson> lessons) {
		this.lessons = lessons;
	}

	public void removeLesson(Lesson lesson) {
      this.lessons.remove(lesson);
    }
    public Vector<Lesson> getLessons(){
      return lessons;
    }
    
    
    

    public String toString() {
      return "Name: "+getUserName() + "isPaid: "+isPaid();
    }
    @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(getUserName(), getPassword(), school);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Teacher other = (Teacher) obj;
    return Objects.equals(getUserName(), other.getUserName()) && Objects.equals(getPassword(), other.getPassword()) && school == other.school;
  }

  public SchoolName getSchool() {
      return school;
    }
  
  public void putMark(double mark, int indexLesson, int indexStudent) {
    String name = this.lessons.get(indexLesson).getName();
    this.lessons.get(indexLesson).getStudent(indexStudent).getLastSemester().getSubject(name).putAttestaion(mark);
  }
  
    public void addAttendance(int indexLesson, int openTime) {
      Attendance att = new Attendance(false, true);
      String name = this.lessons.get(indexLesson).getName();
      for(int i = 0; i < this.lessons.get(indexLesson).getStudents().size(); i++) {
        this.lessons.get(indexLesson).getStudent(i).getLastSemester().getSubject(name).addAttendance(att);
      }
      int size = this.lessons.get(indexLesson).getStudent(0).getLastSemester().getSubject(name).getAttendances().size();
      closeAttendance(indexLesson, openTime, size-1);
    }
    public void putAttendance(int indexLesson) {
      Attendance att = new Attendance(true, false);
      String name = this.lessons.get(indexLesson).getName();
      for(int i = 0; i < this.lessons.get(indexLesson).getStudents().size(); i++) {
        this.lessons.get(indexLesson).getStudent(i).getLastSemester().getSubject(name).addAttendance(att);
      }
    }
    public void closeAttendance(int indexLesson, int time, int index) {
      Timer timer = new Timer();
      String name = this.lessons.get(indexLesson).getName();
      timer.schedule(new TimerTask() {
        @Override
        public void run() {
          for(int i = 0; i < lessons.get(indexLesson).getStudents().size(); i++) {
            lessons.get(indexLesson).getStudent(i).getLastSemester().getSubject(name).setAttendance(index);
          }
        }
      }, time*60*1000);
    }
    
    public void addCourse(Course c) {
		myCourses.add(c);
		DBContext.saveUsers();
		System.out.println("Course was added");
	}
    
    public List<Course> getCourses(){
		return myCourses;
	}


    
	
}