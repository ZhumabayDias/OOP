package model;

import java.util.Set;
import java.util.Vector;

import Users.Student;

import java.util.HashSet;

public class Enrollment {
    
    private Vector<Semester> semester;
    private Course course;
    private String status;
    private Student student;
    private Attestation grade;
    
    
    
    public Enrollment(Vector<Semester> semester, Course course, String status, Student student, Attestation grade) {
		semester = new Vector<Semester>();
    	this.course = course;
		this.status = status;
		this.student = student;
		this.grade = grade;
	}

	private Vector<Semester> getSemester() {
        return this.semester;
    }
    private void setSemester(Vector<Semester> semester) {
        this.semester = semester;
    }
    
    private Course getCourse() {
        return this.course;
    }
    private void setCourse(Course course) {
        this.course = course;
    }
    
    private String getStatus() {
        return this.status;
    }
    private void setStatus(String status) {
        this.status = status;
    }
    
    private Student getStudent() {
        return this.student;
    }
    private void setStudent(Student student) {
        this.student = student;
    }
    
    private Attestation getGrade() {
        return this.grade;
    }
    private void setGrade(Attestation grade) {
        this.grade = grade;
    }
    
}
