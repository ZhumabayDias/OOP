//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import Users.Student;
import enums.SchoolName;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Vector;

public class Semester {
    private SchoolName school;
    private int currentSemester;
    private Vector<Subject> subjects;
    //private List<Course> courses;
    private List<CourseApplication> applications;
    private int maxCredits;
    private int crediteBalance;

    public Semester(SchoolName school, int semester, int credits) {
        this.school = school;
        this.currentSemester = semester;
        this.subjects = new Vector<>();
        this.applications = new ArrayList<>();
        this.maxCredits = credits;
        this.crediteBalance = credits;
    }

    /*public void addCourse(Course course) {
        this.courses.add(course);
    }

    /*public List<Course> getCoursesForStudent(SchoolName school, int yearOfStudy) {
        return (List)this.courses.stream().filter((course) -> {
            return course.getSchoolName().equals(school) && course.getYearOfStudy() == yearOfStudy;
        }).collect(Collectors.toList());
    }*/
    
    public boolean addSubject(Subject subject) {
    	if(this.crediteBalance <= subject.getCredits()) {
    		this.subjects.add(subject);
    		this.crediteBalance -= subject.getCredits();
    		return true;
    	}
    	return false;
    }
    
    public Subject getSubject(String name) {
    	return this.subjects.stream()
    			.filter(subject -> subject.getName().equals(name))
    			.findFirst()
    			.orElse(null);
    }
    public Subject getSubject(int Index) {
    	return this.subjects.get(Index);
    }
    
    public Vector<Subject> getSubjects(){
    	return this.subjects;
    }
    
    public int getCredits() {
    	return this.maxCredits;
    }
    public int getCreditsBalance() {
    	return this.crediteBalance;
    }

    public void addStudentApplication(Student student, Course course) {
        this.applications.add(new CourseApplication(student, course));
    }

    public List<CourseApplication> getApplications() {
        return this.applications;
    }

    public SchoolName getSchoolName() {
        return this.school;
    }

    public int getCurrentSemester() {
        return this.currentSemester;
    }

}