package com.noah.services;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.noah.domain.Address;
import com.noah.domain.Student;

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
	
	@Test
	public void testCreateStudent(){
		Student student = new Student();
		student.setName("Ben");
		student.setEmail("Ben@**.com");
		int count = studentService.createStudent(student);
		System.out.println("Successfully add "+count + " student(s)");
		System.out.println("The student id just added is " + student.getStudId());
		studentService.findAllStudents().forEach(System.out::println);
	}
	
	@Test
	public void testUpdateStudent(){
		Student student = new Student();
		student.setName("Ben Gor");
		student.setEmail("Ben Gor Gor@**.com");
		student.setDob(new Date());
		Address address = new Address();
		address.setAddrId(1);
		student.setAddress(address);
		student.setStudId(19);
		int count = studentService.updateStudent(student);
		System.out.println("Successfully update "+count + " student(s)");
		studentService.findAllStudents().forEach(System.out::println); 
	}
	
	@Test 
	public void testDeleteStudentById() {
		int count = studentService.deleteStudentById(20);
		System.out.println("Successfully delete " + count + " student(s)");
		studentService.findAllStudents().forEach(System.out::println); 
	}

}
