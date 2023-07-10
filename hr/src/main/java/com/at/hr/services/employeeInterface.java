package com.at.hr.services;

import java.util.List;
import com.at.hr.model.Employee;

public interface employeeInterface {

	Employee getEmployeeById(int id);

	List<Employee> getAllEmployees();

	Employee insertAnEmployee(Employee employee);

	Employee updateEmployeeDetails(int id, Employee employee);

	void deleteAnEmployee(int id);

	
}
