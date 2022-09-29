package com.springbooth2.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbooth2.demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
