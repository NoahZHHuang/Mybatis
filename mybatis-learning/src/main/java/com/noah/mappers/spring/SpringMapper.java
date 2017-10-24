package com.noah.mappers.spring;

import java.util.List;

import com.noah.domain.Student;

public interface SpringMapper {
	
	List<Student> findAllStudents();
	int insertStudent(Student student);

}
