package com.example.getmesocialservice.user;

public class User {
	
	private String name;
	private String address;
	private int age;
	private String profilepicurl;
	
	public User(String name, String address, int age, String profilepicurl) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.profilepicurl = profilepicurl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfilepicurl() {
		return profilepicurl;
	}

	public void setProfilepicurl(String profilepicurl) {
		this.profilepicurl = profilepicurl;
	}
	

}
