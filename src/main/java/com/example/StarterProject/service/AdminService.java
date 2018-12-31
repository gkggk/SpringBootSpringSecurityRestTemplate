package com.example.StarterProject.service;

import org.springframework.security.access.prepost.PreAuthorize;

import com.example.StarterProject.models.Employee;

public interface AdminService {
	
	@PreAuthorize("hasRole('ADMIN')")
	public boolean addEmployee(Employee emp);
	

	@PreAuthorize("hasRole('ADMIN')")
	public boolean deleteEmployee(String empId);
}
