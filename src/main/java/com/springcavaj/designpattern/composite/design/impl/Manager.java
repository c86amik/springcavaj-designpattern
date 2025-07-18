/**
 * 
 */
package com.springcavaj.designpattern.composite.design.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.composite.design.Employee;

/**
 * 
 * @author springcavaj
 */
public class Manager implements Employee {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Manager.class);
	
	private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

	@Override
	public void showEmployeeDetails() {
		LOGGER.info("Employee ID : {}, Name : {}, Position : {}", this.empId, this.name, this.position);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [name=");
		builder.append(name);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", position=");
		builder.append(position);
		builder.append("]");
		return builder.toString();
	}
}
