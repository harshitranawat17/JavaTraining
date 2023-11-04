package com.springcore.autowire.anotation;

public class Address {
	
	private String city;
	private String Street;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public Address(String city, String street) {
		super();
		this.city = city;
		Street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", Street=" + Street + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
