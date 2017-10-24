package com.noah.domain;

import java.util.Arrays;

public class SpecialType {
	
	private Integer id;
	private byte[] pic;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "SpecialType [id=" + id + ", pic=" + Arrays.toString(pic) + "]";
	}
	
	
	
	

}
