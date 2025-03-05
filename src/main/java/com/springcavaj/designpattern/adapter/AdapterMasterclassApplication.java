/**
 * 
 */
package com.springcavaj.designpattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.adapter.design.SpringBootFramework;
import com.springcavaj.designpattern.adapter.design.impl.FrameworkAdapter;
import com.springcavaj.designpattern.adapter.design.impl.ObjectFrameworkAdapter;

/**
 * @author springcavaj
 */
public class AdapterMasterclassApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AdapterMasterclassApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Class Adapter (Using Inheritance)");
		FrameworkAdapter adapter = new FrameworkAdapter();
		adapter.ioc("Spring Boot");
		adapter.ioc("Struts");
		LOGGER.info("Object Adapter (Using Composition)");
		ObjectFrameworkAdapter frameworkAdapter = new ObjectFrameworkAdapter(new SpringBootFramework());
		frameworkAdapter.ioc("Spring Boot");
		frameworkAdapter.ioc("Struts");
	}

}
