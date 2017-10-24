package com.noah.mappers;

import java.util.List;
import java.util.Map;

import com.noah.domain.Course;
import com.noah.domain.Tutor;
import com.noah.domain.TutorCourseCount;

public interface TutorAndCourseMapper {
	
	Tutor findTutorWithCoursesById(Integer tutorId);
	Tutor findTutorWithCoursesByIdEmbeddedSelect(Integer tutorId);
	List<Tutor> findCourseByNameAndDescription(String name, String description);
	List<Course> findCourseByConditionsWithIf(Map map);
	List<Course> findCourseByConditionsWithChooseWhen(Map map);
	List<TutorCourseCount> countCourseForEachTutor();
}
