package com.thymeleafexm.controller;

public class User {

	public String name;
	public String role;
	public String email;
	public User(String name, String role, String email) {
		super();
		this.name = name;
		this.role = role;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public String getEmail() {
		return email;
	}
	
}
