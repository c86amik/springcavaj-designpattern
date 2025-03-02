/**
 * 
 */
package com.springcavaj.designpattern.adapter.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author springcavaj
 */
public class SpringBootFramework {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootFramework.class);
	
	public void inversionOfControl(String typeOfFramework) {
		LOGGER.info("{} follows Inversion Of Control", typeOfFramework);
	}
}
