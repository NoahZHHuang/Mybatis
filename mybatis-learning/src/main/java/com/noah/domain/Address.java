package com.noah.domain;

public class Address {
	
	private Integer addrId;
	private String street;
	private String city;
	private String zipCodeString;
	
	public Integer getAddrId() {
		return addrId;
	}
	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCodeString() {
		return zipCodeString;
	}
	public void setZipCodeString(String zipCodeString) {
		this.zipCodeString = zipCodeString;
	}
	
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", street=" + street + ", city=" + city + ", zipCodeString="
				+ zipCodeString + "]";
	}
		
	

}
