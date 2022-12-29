package com.example.getmesocialservice.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import com.example.getmesocialservice.validation.ValidName;

public class User {
	
	@Id
	private String id;
	@NotEmpty @ValidName
	private String name;
	@Length(max =10) @ValidName
	private String address;
	@Min(value=10) @Max(value=120)
	private int age;
	
	
	public User(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	
	}
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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
	

}
