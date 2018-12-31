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
import com.example.StarterProject.service.AdminService;
import com.example.StarterProject.service.EmployeeService;
import com.example.StarterProject.utils.DBHelper;

@Service("adminservice")
public class AdminServiceImpl implements AdminService{
	
	
	public boolean addEmployee(Employee emp){
		Connection conn=DBHelper.getConnection();
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate("INSERT INTO public.\"Employee\"(id, name, designation)" +
									"VALUES ("+emp.getId()+", '"+emp.getName()+"', '"+emp.getDesignation()+"');");
			System.out.println();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteEmployee(String empId){
		Connection conn=DBHelper.getConnection();
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate("DELETE FROM public.\"Employee\" WHERE id="+empId);
			System.out.println();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
}
