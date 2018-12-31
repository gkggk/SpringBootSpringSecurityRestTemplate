package com.example.StarterProject.serviceimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.StarterProject.models.Course;
import com.example.StarterProject.models.Employee;
import com.example.StarterProject.service.EmployeeService;
import com.example.StarterProject.utils.DBHelper;

@Service("studentservice")
public class EmployeeServiceImpl implements EmployeeService {
	@Override
	public List<Employee> retrieveStudents() {
		Connection conn = DBHelper.getConnection();
		List<Employee> employees = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM public.\"Employee\"");
			while (resultSet.next()) {
				Employee emp = new Employee(resultSet.getInt("id"), resultSet.getString("name"),
						resultSet.getString("designation"));
				employees.add(emp);
			}
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public boolean updateName(String id, String name) {
		Connection conn = DBHelper.getConnection();
		List<Employee> employees = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate("UPDATE public.\"Employee\" SET name='"+name+"' WHERE id=" + id);
			System.out.println();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
