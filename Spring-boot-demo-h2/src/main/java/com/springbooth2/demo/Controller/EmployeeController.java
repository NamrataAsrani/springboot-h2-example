package com.springbooth2.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbooth2.demo.dao.*;
import com.springbooth2.demo.Model.*;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	
	//search, update and delete operations
	//get all 
	@RequestMapping(value="/employees",method =RequestMethod.GET)
	List<Employee> getEmployee() {
		return repository.findAll();
		
		
	}
	
	//get by id
	@RequestMapping(value="/employees/{id}",method =RequestMethod.GET)
	Employee getEmployee(@PathVariable Integer id) {
		return repository.findById(id).get();
		
	}
	
	//insert all
	@RequestMapping (value="/employees/", method= RequestMethod.POST)
 String addallEmployees(@RequestBody List<Employee> emplist) {
		
           // repository.save(emplist);
        repository.saveAll( emplist);
        return "success";
	}
	
  
	
	//updating all
	@RequestMapping (value="/employees",method=RequestMethod.PUT)
String updateEmployee(@RequestBody List<Employee> employee) {
		 repository.saveAll(employee);
		 return "SUCCESS";
		
		
	}
	
	
	//updating 1
	
			
			
		
	
	//deleting 1
	@RequestMapping (value="/employees/{id}",method=RequestMethod.DELETE)
	void deleteEmployee(@PathVariable ("id") int id) {
		 repository.deleteById(id);
		
	}
	
	
	//deleting all
	@RequestMapping (value="/employees",method=RequestMethod.DELETE)
	String deleteAllEmployee() {
		repository.deleteAll();
		return "Success";
		
	}
}
