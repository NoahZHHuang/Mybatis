package com.noah.services;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentServiceTest {
	
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUp(){
		studentService = new StudentService();
	}
	
	@AfterClass
	public static void tearDown(){
		studentService = null;
	}
	
	@Test
	public void testFindAllStudents(){
		studentService.findAllStudents().forEach(System.out::println);
	}
	
	@Test
	public void testFindStudentWIthAddressById(){
		System.out.println(studentService.findStudentWIthAddressById(17));
	}
	
	@Test
	public void testFindStudentWIthAddressByIdNeedOneMoreSelect(){
		System.out.println(studentService.findStudentWIthAddressByIdNeedOneMoreSelect(17));
	}

}
