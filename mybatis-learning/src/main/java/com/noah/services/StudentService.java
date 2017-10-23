package com.noah.services;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.noah.domain.Student;
import com.noah.mappers.MyBatisSqlSessionFactory;
import com.noah.mappers.StudentMapper;

public class StudentService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<Student> findAllStudents(){
		
		logger.debug("Select all students");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findAllStudents();
		}finally{
			sqlSession.close();
		}
		
	}
	

	public static void main (String [] args){
		StudentService studentService = new StudentService();
		studentService.findAllStudents().stream().forEach(System.out::println);
	}

}
