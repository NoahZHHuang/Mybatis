package com.noah.services;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TutorAndCourseServiceTest {

private static TutorAndCourseService tutorAndCourseService;
	
	@BeforeClass
	public static void setUp(){
		tutorAndCourseService = new TutorAndCourseService();
	}
	
	@AfterClass
	public static void tearDown(){
		tutorAndCourseService = null;
	}
	
	@Test
	public void testFindTutorWithCoursesById(){
		System.out.println(tutorAndCourseService.findTutorWithCoursesById(2));
	}
	
	@Test
	public void testFindTutorWithCoursesByIdEmbeddedSelect(){
		System.out.println(tutorAndCourseService.findTutorWithCoursesByIdEmbeddedSelect(1));
	}
	
	@Test
	public void testFindCourseByNameAndDescription(){
		System.out.println(tutorAndCourseService.findCourseByNameAndDescription("Java", "Thinking In Java"));
	}
	
	@Test
	public void testFindCourseByConditionsWithIf(){
		Map<String,String> map = new HashMap<>();
		map.put("name", "Java");
		map.put("description", "Thinking");
		System.out.println(tutorAndCourseService.findCourseByConditionsWithIf(map));
	}
	
	@Test
	public void testFindCourseByConditionsWithChooseWhen(){
		Map<String, String> map = new HashMap<>();
		map.put("name", "DB");
		map.put("description", "Thinking");
		System.out.println(tutorAndCourseService.findCourseByConditionsWithChooseWhen(map));
		map.remove("name");
		System.out.println(tutorAndCourseService.findCourseByConditionsWithChooseWhen(map));
		map.clear();
		System.out.println(tutorAndCourseService.findCourseByConditionsWithChooseWhen(map));
	}
	
	@Test
	public void testCountCourseForEachTutor(){
		System.out.println(tutorAndCourseService.countCourseForEachTutor());
	}
}
