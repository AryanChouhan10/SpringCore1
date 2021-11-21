package com.aryan.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aryan.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {

	
}
