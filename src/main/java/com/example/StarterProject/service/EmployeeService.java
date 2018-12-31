package com.example.StarterProject.service;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import com.example.StarterProject.models.Employee;

public interface EmployeeService {
	
	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	public List<Employee> retrieveStudents();
	
	@PreAuthorize("hasAnyRole('USER')")
	public boolean updateName(String id,String name);
}
