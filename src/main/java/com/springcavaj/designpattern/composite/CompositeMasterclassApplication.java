/**
 * 
 */
package com.springcavaj.designpattern.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.composite.design.impl.CompanyCompositeDirectory;
import com.springcavaj.designpattern.composite.design.impl.Developer;
import com.springcavaj.designpattern.composite.design.impl.Manager;

/**
 * 
 * @author springcavaj
 */
public class CompositeMasterclassApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CompositeMasterclassApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Composite Design Pattern Example");
		Developer dev1 = new Developer(100, "John", "Developer");
        Developer dev2 = new Developer(101, "David", "Senior Developer");
        Manager man1 = new Manager(200, "Sophie", "Manager");

        CompanyCompositeDirectory engineeringDirectory = new CompanyCompositeDirectory();
        engineeringDirectory.addEmployee(dev1);
        engineeringDirectory.addEmployee(dev2);

        CompanyCompositeDirectory mainDirectory = new CompanyCompositeDirectory();
        mainDirectory.addEmployee(engineeringDirectory);
        mainDirectory.addEmployee(man1);

        mainDirectory.showEmployeeDetails();
        mainDirectory.removeEmployee(man1);
        mainDirectory.showEmployeeDetails();
	}

}
