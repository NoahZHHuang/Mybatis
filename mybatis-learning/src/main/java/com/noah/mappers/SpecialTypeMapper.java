package com.noah.mappers;

import com.noah.domain.SpecialType;

public interface SpecialTypeMapper {
	
	int insertSpecialType(SpecialType specialType);
	SpecialType selectSpecialTypeById (Integer id);

}
