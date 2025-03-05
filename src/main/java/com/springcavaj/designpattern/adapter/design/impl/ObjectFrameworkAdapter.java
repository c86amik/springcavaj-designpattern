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
public class ObjectFrameworkAdapter implements OOPFramework {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ObjectFrameworkAdapter.class);
	
	private SpringBootFramework bootFramework;
	
	public ObjectFrameworkAdapter(SpringBootFramework bootFramework) {
		this.bootFramework = bootFramework;
	}

	@Override
	public void ioc(String typeOfFramework) {
		if("Spring Boot".equals(typeOfFramework)) {
			this.bootFramework.inversionOfControl(typeOfFramework);
		} else {
			LOGGER.info("{} doesn't follow Inversion of Control", typeOfFramework);
		}
	}

}
