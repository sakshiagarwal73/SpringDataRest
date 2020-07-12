package com.luv2code.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	
	public List<Employee> findAll() {
		
		
		return employeeRepository.findAll();
	}

	@Override
	
	public Employee findById(int id) {
		
		 Optional<Employee> result = employeeRepository.findById(id);
		 
		 Employee employee = null;
		 if(result.isPresent())
		 {
			 employee = result.get();
		 }
		 else
		 {
			 throw new RuntimeException("did not find Employee Id: " + id);
		 }
		 return employee;
	}

	@Override
	
	public void save(Employee employee) {
		
		employeeRepository.save(employee);
	}
    
	@Override
	
	public void deleteById(int id) {
		
		employeeRepository.deleteById(id);
	}
	
	//remove @Transactional

}
