package business;

import java.util.List;

import dataAccess.CourseDao;
import entities.Course;
import logger.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}
	public void add(Course course)throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
		for(Course cours:courses) {
			if(cours.getName().equals(course.getName())) {
				throw new Exception("Kurs adi diğerleriyle aynı olamaz!");
			}
		}
		courseDao.add(course);
		courses.add(course);
		for(Logger logger:loggers) {
			logger.add(course.getName());
		}
	}
}

