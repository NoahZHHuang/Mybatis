package com.noah.mappers;

import java.util.List;

import com.noah.domain.Address;
import com.noah.domain.Student;

public interface StudentMapper {

	List<Student> findAllStudents();
	Student findStudentWIthAddressById(Integer id);
	Address findAddressById(Integer id);
	
}
