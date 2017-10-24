package com.noah.services;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.noah.domain.SpecialType;
import com.noah.mappers.MyBatisSqlSessionFactory;
import com.noah.mappers.SpecialTypeMapper;

public class SpecialTypeService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public int insertSpecialType(SpecialType specialType){
		logger.debug("Insert a special type {}", specialType);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			SpecialTypeMapper specialTypeMapper = sqlSession.getMapper(SpecialTypeMapper.class);
			int count = specialTypeMapper.insertSpecialType(specialType);
			sqlSession.commit();
			return count;
		}finally{
			sqlSession.close();
		}
	}
	
	public SpecialType selectSpecialTypeById(Integer id){
		logger.debug("select a special type by id {}", id);
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try{
			SpecialTypeMapper specialTypeMapper = sqlSession.getMapper(SpecialTypeMapper.class);
			return specialTypeMapper.selectSpecialTypeById(id);
		}finally{
			sqlSession.close();
		}
	}

}
