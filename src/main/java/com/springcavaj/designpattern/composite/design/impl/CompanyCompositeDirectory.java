/**
 * 
 */
package com.springcavaj.designpattern.composite.design.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.composite.design.Employee;

/**
 * 
 * #@author springcavaj
 */
public class CompanyCompositeDirectory implements Employee {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CompanyCompositeDirectory.class);
	
	private List<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		LOGGER.info("List of Employees are : {}", employees);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
		LOGGER.info("List of Employees are : {}", employees);
	}

	@Override
	public void showEmployeeDetails() {
		for(Employee employee : employees) {
			employee.showEmployeeDetails();
		}
	}

}
