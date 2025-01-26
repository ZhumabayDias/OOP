package controllers;

import DBs.DBContext;
import enums.CourseType;
import enums.SchoolName;
import enums.UserTypes;
import model.Course;

public class CourseController {
	public static boolean createCourse(String courseCode, String courseName, Integer credits, Integer yearOfStudy, CourseType courseType, SchoolName school) {
		Course c = new Course(courseCode,  courseName, credits, yearOfStudy, courseType,  school);
		
		DBContext.course.add(c);
        return DBContext.saveCourses();
	}
}
