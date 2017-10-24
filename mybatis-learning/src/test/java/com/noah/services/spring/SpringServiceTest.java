package com.noah.services.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.noah.domain.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext.xml")
public class SpringServiceTest {

	@Autowired
	private SpringService springService;
	
	@Test
	public void testCreateStudents() throws Exception{ 
		Student stud_1 = new Student();
		stud_1.setName("David");
		stud_1.setEmail("David@**.com");
		Student stud_2 = new Student();
		stud_2.setName("Mike");
		stud_2.setEmail("Mike@**.com");
		springService.createStudents(stud_1, stud_2);
		System.out.println(springService.findAllStudents());
	}
	
}
