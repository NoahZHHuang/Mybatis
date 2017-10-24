package com.noah.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.noah.domain.Course;
import com.noah.domain.Tutor;
import com.noah.domain.TutorCourseCount;
import com.noah.mappers.MyBatisSqlSessionFactory;
import com.noah.mappers.TutorAndCourseMapper;

public class TutorAndCourseService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public Tutor findTutorWithCoursesById(Integer tutorId){
		logger.debug("Select Tutor By Id {}", tutorId);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			TutorAndCourseMapper tutorAndCourseMapper = sqlSession.getMapper(TutorAndCourseMapper.class);
			return tutorAndCourseMapper.findTutorWithCoursesById(tutorId);
		}finally{
			sqlSession.close();
		}
	}
	
	public Tutor findTutorWithCoursesByIdEmbeddedSelect(Integer tutorId){
		logger.debug("Select Tutor By Id {} with embedded select", tutorId);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			TutorAndCourseMapper tutorAndCourseMapper = sqlSession.getMapper(TutorAndCourseMapper.class);
			return tutorAndCourseMapper.findTutorWithCoursesByIdEmbeddedSelect(tutorId);
		}finally{
			sqlSession.close();
		}
	}
	
	public List<Tutor> findCourseByNameAndDescription(String name, String description){
		logger.debug("Select Course By name '{}' and description '{}'", name, description);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			TutorAndCourseMapper tutorAndCourseMapper = sqlSession.getMapper(TutorAndCourseMapper.class);
			return tutorAndCourseMapper.findCourseByNameAndDescription(name, description);
		}finally{
			sqlSession.close();
		}
	}
	
	public List<Course> findCourseByConditionsWithIf(Map map){
		logger.debug("Select Course By Conditions With If, params is a map {}", map);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			TutorAndCourseMapper tutorAndCourseMapper = sqlSession.getMapper(TutorAndCourseMapper.class);
			return tutorAndCourseMapper.findCourseByConditionsWithIf(map);
		}finally{
			sqlSession.close();
		}
	}
	
	public List<Course> findCourseByConditionsWithChooseWhen(Map map){
		logger.debug("Select Course By Conditions With Choose-When, params is a map {}", map);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			TutorAndCourseMapper tutorAndCourseMapper = sqlSession.getMapper(TutorAndCourseMapper.class);
			return tutorAndCourseMapper.findCourseByConditionsWithChooseWhen(map);
		}finally{
			sqlSession.close();
		}
	}
	
	public List<TutorCourseCount> countCourseForEachTutor(){
		logger.debug("count the course for each tutor");
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			TutorAndCourseMapper tutorAndCourseMapper = sqlSession.getMapper(TutorAndCourseMapper.class);
			return tutorAndCourseMapper.countCourseForEachTutor();
		}finally{
			sqlSession.close();
		}
	}

}
