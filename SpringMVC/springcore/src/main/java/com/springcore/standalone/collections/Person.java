package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;


public class Person {
	
	private List<String> friends;
	private Map<String, Integer> id;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getId() {
		return id;
	}
	public void setId(Map<String, Integer> id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", id=" + id + "]";
	}
	
	
	
		
}
