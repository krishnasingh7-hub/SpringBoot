package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	//List<Courses> list;
	
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Courses(145,"java core Course","This course contains java basics"));
//		list.add(new Courses(146,"springboot Course","This course contains springboot Rest API"));
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
		
		//return list;
	}
	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.getOne(courseId);
		
//		Courses c=null;
//		for(Courses course:list) {
//			if(course.getId()==courseId) {
//				c=course;
//				break;
//			}
//		}
//		return c;
	}
	
	@Override
	public Courses addCourses(Courses courses) {
		// TODO Auto-generated method stub
		
		courseDao.save(courses);
		//list.add(courses);
		return courses;
	}
	@Override
	public Courses updateCourses(Courses courses) {
		// TODO Auto-generated method stub
		
		courseDao.save(courses);
//		list.forEach(e -> {
//			if(e.getId()==courses.getId()){
//				e.setTitle(courses.getTitle());
//				e.setDescription(courses.getDescription());
//			}
//		});
		return courses;
	}
	@Override
	public void deleteCourses(long parseLong) {
		// TODO Auto-generated method stub
		
		Courses entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
	
	

	
}
