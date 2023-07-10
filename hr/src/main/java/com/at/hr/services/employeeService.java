package com.at.hr.services;

/*
public class employeeService {

	public employeeService() {
		// TODO Auto-generated constructor stub
	}

}

*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.at.hr.dao.EmployeeRepository;
import com.at.hr.model.Employee;

@Service
public class employeeService implements employeeInterface {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeById(int id) {

		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();

	}

	@Override
	public Employee insertAnEmployee(Employee employee) {

		return employeeRepository.save(employee);

	}

	@Override
	public Employee updateEmployeeDetails(int id, Employee employee) {

		Employee employeeToUpdate = employeeRepository.findById(id).get();

		employeeToUpdate.setFirstName(employee.getFirstName());
		employeeToUpdate.setLastName(employee.getLastName());
		employeeToUpdate.setEmail(employee.getEmail());

		return employeeRepository.save(employeeToUpdate);

	}

	@Override
	public void deleteAnEmployee(int id) {

		employeeRepository.deleteById(id);

	}

}
