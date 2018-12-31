package com.example.StarterProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.StarterProject.models.Employee;
import com.example.StarterProject.service.EmployeeService;

@RestController
public class LoginController {

	@Autowired
	EmployeeService studentService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public List<Employee> showLoginPage(ModelMap model) {
		List<Employee> list=studentService.retrieveStudents();
		return list;
	}

}
