//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Users;

import Interfaces.CanSendRequest;
import Interfaces.Researchable;
import Interfaces.Subscribers;
import OOPproject.ResearcherDecorator;
import enums.Organization;
import enums.SchoolName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

import DBs.DBContext;
import model.Course;
import model.Lesson;
import model.Semester;

public class Student extends User implements Researchable, Subscribers, CanSendRequest {
    private static final long serialVersionUID = 4L;
    private SchoolName schoolName;
    private Integer yearOfStudy;
    private Organization Organization;
    private List<Course> courses;
    private Vector<Semester> semesters;
    private List<Lesson> lessons;
    private ResearcherDecorator studentResearcher;

    public Student(String username, String password, Semester firstSemester) {
      super(username, password);
      courses = new ArrayList<>();
      this.yearOfStudy = 1;
      this.schoolName = SchoolName.SITE;
      this.semesters = new Vector<>();
      this.semesters.add(firstSemester);
      this.lessons = new ArrayList<>();
  }
    
    public Student(String name, String password) {
    	super(name,password);
    }

  

    
    public SchoolName getSchoolName() {
    return schoolName;
  }

  public void setSchoolName(SchoolName schoolName) {
    this.schoolName = schoolName;
  }

  public Integer getYearOfStudy() {
    return yearOfStudy;
  }

  public void setYearOfStudy(Integer yearOfStudy) {
    this.yearOfStudy = yearOfStudy;
  }

  public Organization getOrganization() {
    return Organization;
  }

  public void setOrganization(Organization organization) {
    Organization = organization;
  }

  public List<Course> getCourses() {
      return courses;
  }
  
  public List<Lesson> getLessons() {
      return lessons;
  }

  public void setCourses(Vector<Course> courses) {
    this.courses = courses;
  }

  public Vector<Semester> getSemesters() {
    return semesters;
  }
  
  public void addNewSemester(int credits) {
    Semester sem = new Semester(this.schoolName, this.semesters.size()+1, credits);
    this.semesters.add(sem);
  }
  
  public Semester getLastSemester() {
    return this.semesters.getLast();
  }

  public ResearcherDecorator getStudentResearcher() {
    return studentResearcher;
  }

  public void setStudentResearcher(ResearcherDecorator studentResearcher) {
    this.studentResearcher = studentResearcher;
  }
  
  
  


    public double viewMarks() {
        return 0.0;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        System.out.println("Enroll in course");
        DBContext.saveUsers();
    }
    
    public void enrollInLesson(Lesson lesson) {
        lessons.add(lesson);
        System.out.println("Enroll in lesson");
        DBContext.saveUsers();
    }




  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + Objects.hash(schoolName, yearOfStudy);
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
    Student other = (Student) obj;
    return schoolName == other.schoolName && Objects.equals(yearOfStudy, other.yearOfStudy);
  }
  
}