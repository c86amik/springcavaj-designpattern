/**
 * 
 */
package com.springcavaj.designpattern.adapter.design.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.adapter.design.OOPFramework;
import com.springcavaj.designpattern.adapter.design.SpringBootFramework;

/**
 * 
 * @author springcavaj
 */
public class FrameworkAdapter extends SpringBootFramework implements OOPFramework {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FrameworkAdapter.class);

	@Override
	public void ioc(String typeOfFramework) {
		if("Spring Boot".equalsIgnoreCase(typeOfFramework)) {
			inversionOfControl(typeOfFramework);
		} else {
			LOGGER.info("{} doesn't follow Inversion of Control", typeOfFramework);
		}
	}

}
