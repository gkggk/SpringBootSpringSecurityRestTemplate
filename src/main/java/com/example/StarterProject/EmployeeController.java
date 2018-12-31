package com.example.StarterProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.StarterProject.models.Employee;
import com.example.StarterProject.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService studentService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Employee> fetchEmployees(ModelMap model) {
		return studentService.retrieveStudents();
	}

	@RequestMapping(value = "/updateName/{empId}", method = RequestMethod.PATCH)
	public String updateName(@PathVariable String empId,@RequestParam String name) {
		if(studentService.updateName(empId, name)){
			return "Employee name updaetd successfully";
		}else{
			return "Failed to update name";
		}
	}

}
