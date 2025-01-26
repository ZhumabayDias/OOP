package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.util.*;

import Users.Manager;
import Users.Student;
import Users.Teacher;

import enums.Weekday;
import enums.LessonType;


public class Lesson implements Serializable{
    
	private String name;
    private LocalDateTime startLesson;
    private LocalDateTime endLesson;
    private Vector<Student> students;
    private Room room;
    private Teacher teacher;
    private Course course;
    private Weekday day;
    private LessonType lessonType;
    
    
    public Lesson(String name ,LocalDateTime Time, LocalDateTime Time2, Course course, LessonType type) {
    	this.name = name;
		this.startLesson = Time;
		this.endLesson = Time2;
		this.students = new Vector<>();
		this.room = new Room(100,100);
		this.teacher = null;
		this.course = course;
		this.day = day;
		this.lessonType = type;
	}
	public LocalDateTime getStartLesson() {
        return this.startLesson;
    }
	
    
    @Override
	public int hashCode() {
		return Objects.hash(course, name, teacher);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lesson other = (Lesson) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name)
				&& Objects.equals(teacher, other.teacher);
	}
	public LocalDateTime getEndLesson() {
        return this.endLesson;
    }
   
    
    public Vector<Student> getStudents() {
        return this.students;
    }
    public void setStudents(Vector<Student> students) {
        this.students = students;
    }
    public Student getStudent(int index) {
    	return this.students.get(index);
    }
    public void addStudent(Student student) {
    	this.students.add(student);
    }
    public void deleteStudent(int index) {
    	this.students.remove(index);
    }
    
    public String getType() {
    	return this.lessonType.name();
    }
    public String getDay() {
    	return this.day.name();
    }
    public void setDay(Weekday day) {
    	this.day = day;
    }
    public Room getRoom() {
        return this.room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public Course getCourse() {
        return this.course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public void addAttendance() {
    }
	@Override
	public String toString() {
		return "Lesson [room=" + room + ", teacher=" + teacher + ", course=" + course + "]";
	}
    
    
    
}
