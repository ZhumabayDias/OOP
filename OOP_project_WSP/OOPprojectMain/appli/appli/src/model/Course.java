//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import Users.Student;
import Users.Teacher;
import enums.CourseType;
import enums.SchoolName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

import DBs.DBContext;

public class Course implements Serializable {
    private int maxCapacity;
    private String courseCode;
    private String courseName;
    private Integer credits;
    private Vector<Teacher> teachers;
    private List<Attestation> grades;
    private List<Student> students;
    private CourseType courseType;
    private boolean statusForRegistration;
    private Integer yearOfStudy;
    private SchoolName school;
    private List<Lesson> lessons;

    public Course(String courseCode, String courseName, Integer credits, Integer yearOfStudy, CourseType courseType, SchoolName school) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.teachers = new Vector<>();
        this.grades = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courseType = courseType;
        this.statusForRegistration = false;
        this.school = school;
        this.yearOfStudy = yearOfStudy;
        this.lessons = new ArrayList<>();
        this.maxCapacity = 100;
    }

    public SchoolName getSchoolName() {
        return this.school;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Integer getYearOfStudy() {
        return this.yearOfStudy;
    }

    public Integer getCredits() {
        return this.credits;
    }

    public Vector<Teacher> getTeachers() {
        return this.teachers;
    }

    public List<Attestation> getGrades() {
        return this.grades;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public CourseType getCourseType() {
        return this.courseType;
    }

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    public boolean getStatusForRegistration() {
        return this.statusForRegistration;
    }

    public void openRegistration() {
        this.statusForRegistration = true;
    }

    public void closeRegistration() {
        this.statusForRegistration = false;
    }

    public void enrollStudent(Student s) {
        if (this.students.size() < this.maxCapacity) {
        	Subject sub = new Subject(this.courseName, this.credits);
            boolean statement = s.getLastSemester().addSubject(sub);
            if(statement) {
            	this.students.add(s);
            	System.out.println("Student " + s.getUserName() + " enrolled in course " + this.courseName);
            }
            else {
            	System.out.println("Not enough credits");
            }
        } else {
            System.out.println("Course is full");
        }
        DBContext.saveCourses();

    }
    
    public void enrollLesson(Lesson l) {
    	 System.out.println("Before adding lesson: " + lessons.size() + " lessons.");
    	    lessons.add(l);
    	    System.out.println("After adding lesson: " + lessons.size() + " lessons.");
    	    DBContext.saveCourses();
    	    System.out.println("Lesson added: " + l.getStartLesson() + " - " + l.getEndLesson());
    }
    
    public void enrollTeacher(Teacher t) {
   	 System.out.println("Before adding teacher: " + teachers.size() + " teachers.");
   	   teachers.add(t);
   	    System.out.println("After adding teacher: " + teachers.size() + " teachers.");
   	    DBContext.saveCourses();
   	    System.out.println("Teacher added: " + t);
   }
    
    public List<Lesson> getLessons() {
    	return lessons;
    }

	@Override
	public int hashCode() {
		return Objects.hash(courseCode, courseName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(courseName, other.courseName);
				
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + "]";
	}
	
    
}