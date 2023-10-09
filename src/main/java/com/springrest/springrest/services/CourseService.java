package com.springrest.springrest.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;


public interface CourseService {

	public List<Courses> getCourses();

	public Courses getCourse(long courseId);
	
	public Courses addCourses(Courses courses);

	public Courses updateCourses(Courses courses);

	public void deleteCourses(long parseLong);
}
