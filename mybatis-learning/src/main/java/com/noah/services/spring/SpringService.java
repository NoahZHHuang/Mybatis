package com.noah.services.spring;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noah.domain.Student;
import com.noah.mappers.spring.SpringMapper;

@Service
public class SpringService {
	
	@Autowired
	private SqlSession sqlSession;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<Student> findAllStudents(){
		logger.debug("Select all students with Spring");
		SpringMapper springMapper = sqlSession.getMapper(SpringMapper.class);
		return springMapper.findAllStudents();
	}
	
	
	// @Transactional annotation will rollback only when unchecked exception(namely the runtime exception) throws
	// if checked exception(namely the normal exception) throws, all the inserted data will take effect, unless explicitly say "rollbackFor= Exception.class"
	//@Transactional
	@Transactional(rollbackFor= Exception.class)
	public void createStudents(Student stud_1, Student stud_2) throws Exception{
		logger.debug("Create 2 Students with Spring in Transaction #1 {}, #2 {}", stud_1, stud_2);
		SpringMapper springMapper = sqlSession.getMapper(SpringMapper.class);
		springMapper.insertStudent(stud_1);
		springMapper.insertStudent(stud_2);
		//throw new RuntimeException("this is an unchecked exception");
		throw new Exception("this is a checked exception");
	}

}
