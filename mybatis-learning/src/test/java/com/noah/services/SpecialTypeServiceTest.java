package com.noah.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.noah.domain.SpecialType;

public class SpecialTypeServiceTest {
	
private static SpecialTypeService specialTypeService;
	
	@BeforeClass
	public static void setUp(){
		specialTypeService = new SpecialTypeService();
	}
	
	@AfterClass
	public static void tearDown(){
		specialTypeService = null;
	}
	
	@Test
	public void testInsertSpecialType() throws IOException{
		byte [] picAsBytes = IOUtils.toByteArray(SpecialTypeServiceTest.class.getResourceAsStream("/images/GoogleIcon.JPG"));
		SpecialType specialTypeToInsert = new SpecialType();
		specialTypeToInsert.setPic(picAsBytes);
		specialTypeService.insertSpecialType(specialTypeToInsert);
		SpecialType specialTypeInserted = specialTypeService.selectSpecialTypeById(specialTypeToInsert.getId());
		if(specialTypeInserted != null){
			IOUtils.write(specialTypeInserted.getPic(), new FileOutputStream(new File("C:\\img\\ThePic"+System.currentTimeMillis()+".JPG")));
		}
	}
	
	

}
