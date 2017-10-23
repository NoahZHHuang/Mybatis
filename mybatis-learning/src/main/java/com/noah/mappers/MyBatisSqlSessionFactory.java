package com.noah.mappers;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public synchronized static SqlSessionFactory getSqlSessionFactory(){
		if(sqlSessionFactory == null){
			InputStream inputStream = MyBatisSqlSessionFactory.class.getResourceAsStream("/mybatis/config/mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"dev");
		}
		return sqlSessionFactory;
	}
	
	public static SqlSession openSession(){
		return getSqlSessionFactory().openSession();
	}
	

}
