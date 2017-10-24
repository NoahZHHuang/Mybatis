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
	
	public Student findStudentWIthAddressById(Integer id){
		logger.debug("Select student with address by ID {}", id);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentWIthAddressById(id);
		}finally{
			sqlSession.close();
		}
	}
	
	public Student findStudentWIthAddressByIdNeedOneMoreSelect(Integer id){
		logger.debug("Select student with address by ID {}, need one more select", id);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentWIthAddressByIdNeedOneMoreSelect(id);
		}finally{
			sqlSession.close();
		}
	}
	
	public int createStudent(Student student){
		logger.debug("Create Student {}", student);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int count = studentMapper.insertStudent(student);
			//by default, the connection from the sqlSession is NOT auto commit, Do it manually for insert/update/delete operation
			sqlSession.commit();
			return count;
		}finally{
			sqlSession.close();
		}
	}
	
	public int updateStudent(Student student){
		logger.debug("Update Student {}", student);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int count = studentMapper.updateStudent(student);
			sqlSession.commit();
			return count;
		}finally{
			sqlSession.close();
		}
	}
	
	public int deleteStudentById(Integer id){
		logger.debug("Delete Student By Id {}", id);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			int count = studentMapper.deleteStudentById(id);
			sqlSession.commit();
			return count;
		}finally{
			sqlSession.close();
		}
	}



}
