package model;

import java.util.Set;

import Users.Student;
import Users.Teacher;

import enums.AttendanceType;

import java.util.HashSet;

public class Attendance {
    
    //private Lesson lesson;
    private Boolean status;
    private Boolean isOpen;
    
    public Attendance(Boolean status, Boolean open) {
		//this.lesson = lesson;
		this.status = status;
		this.isOpen = open;
	}
    
	/*public Lesson getLesson() {
        return this.lesson;
    }
    */
    
    public Boolean getStatus() {
        return this.status;
    }
    public void changeStatus() {
        this.status = !this.status;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }
    public void changeIsOpen() {
        this.isOpen = !this.isOpen;
    }
}
