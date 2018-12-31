package com.example.StarterProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.StarterProject.models.Employee;
import com.example.StarterProject.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String addEmployee(@AuthenticationPrincipal UserDetails userDetails,@RequestBody Employee emp) {
		if(adminService.addEmployee(emp)){
			return "Employee successfully added";
		}else{
			return "Failed to add employee";
		}
	}
	
	@RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable String employeeId) {
		if(adminService.deleteEmployee(employeeId)){
			return "Employee successfully deleted";
		}else{
			return "Failed to delete employee";
		}
	}

}
