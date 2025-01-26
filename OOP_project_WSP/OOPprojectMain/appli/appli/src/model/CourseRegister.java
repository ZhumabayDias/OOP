//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import DBs.DBContext;
import Users.Student;
import controllers.ApplicationController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class CourseRegister {
    private static List<CourseApplication> applications = DBContext.getApplications();

    public CourseRegister() {
    }
    

    public static List<CourseApplication> getUncheckedApplications() {
		return applications.stream()
				.filter(application -> application.isChecked() == false)
				.collect(Collectors.toList());
	}
    
    public static List<CourseApplication> getApplicationOfStudent(Student student) {
		return applications.stream()
				.filter(application -> application.getStudent().equals(student))
				.collect(Collectors.toList());
	}
 
    

    public List<Course> getAvailableCourses(Student student) {
        List<CourseApplication> studentApplications = getApplicationOfStudent(student);


        List<Course> appliedCourses = studentApplications.stream()
                .filter(application -> application.isChecked() || application.isApproved())
                .map(CourseApplication::getCourse)
                .collect(Collectors.toList());

       
        return DBContext.getCourses().stream()
                .filter(course -> !appliedCourses.contains(course)) 
                .collect(Collectors.toList());
    }
}