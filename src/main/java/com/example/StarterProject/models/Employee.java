package com.example.StarterProject.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee  implements Serializable{
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("designation")
	private String designation;
	
	public Employee() {
	}
	
	public Employee(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.designation = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String description) {
		this.designation = description;
	}
	
	
}
