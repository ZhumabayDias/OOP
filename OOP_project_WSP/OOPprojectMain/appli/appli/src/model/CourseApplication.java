package model;
import java.io.Serializable;
import java.util.Objects;

import DBs.DBContext;
import Users.Student;

public class CourseApplication implements Serializable{
    Course course;
    Student student;
    boolean isApproved;
    boolean isChecked;
    private static final long serialVersionUID = 1L;
    
  
    public CourseApplication(Student student, Course course) {
        this.student = student;
        this.course = course;
        
        this.isApproved = false;
        this.isChecked = false;
    }

    public Course getCourse() {
        return this.course;
    }

    public Student getStudent() {
        return this.student;
    }

    public void Approved() {
        this.isApproved = true;
        this.isChecked = true;
        Course existingCourse = DBContext.getCourseByName(course.getCourseName());
        Student existingStudent = DBContext.getStudentByName(student.getUserName());

        if (existingCourse != null && existingStudent != null) {
            existingStudent.enrollInCourse(existingCourse);
            existingCourse.enrollStudent(existingStudent);

            System.out.println("Course " + existingCourse.getCourseName() +
                               " has been approved for student " + existingStudent.getUserName());
        } else {
            System.out.println("Error: Course or student not found in DBContext.");
        }
     }

    public void Rejected() {
        this.isChecked = true;
        this.isApproved = false;
    }

    public String toString() {
        return "Course=" + course.getCourseName() + ", student=" + String.valueOf(this.student);
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public boolean isApproved() {
        return this.isApproved;
    }

	@Override
	public int hashCode() {
		return Objects.hash(course, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseApplication other = (CourseApplication) obj;
		return Objects.equals(course, other.course)
				&& Objects.equals(student, other.student);
	}
    
}
