package com.springbooth2.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {
	
	@Id
   Integer Empid;
	
      String name;
	 
	 
   public Integer getId() {
		return Empid;
	}
	public void setId(Integer id) {
		this.Empid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
