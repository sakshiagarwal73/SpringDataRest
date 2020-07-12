package com.luv2code.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
   
	//no need to write any code
	//It provides all the basic CRUD features:
	//findAll()
	//findById()
	//deleteById()
	//save
	//Just mention entity type and primary Key
	//Here Primary key type is Integer
}
