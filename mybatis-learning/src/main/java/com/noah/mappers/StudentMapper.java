package com.noah.mappers;

import java.util.List;

import com.noah.domain.Address;
import com.noah.domain.Student;

public interface StudentMapper {

	List<Student> findAllStudents();
	Student findStudentWIthAddressById(Integer id);	
	Student findStudentWIthAddressByIdNeedOneMoreSelect(Integer id);
	Address findAddressById(Integer id);
	int insertStudent(Student student);
	int updateStudent(Student student);
	int deleteStudentById(Integer id);
	
}
