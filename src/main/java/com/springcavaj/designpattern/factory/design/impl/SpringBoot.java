/**
 * 
 */
package com.springcavaj.designpattern.factory.design.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.factory.design.Framework;

/**
 * 
 * springcavaj
 */
public class SpringBoot implements Framework {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBoot.class);

	@Override
	public void frameworkFeatures() {
		LOGGER.info("Use Annotation Based Dependency Injections...");
	}

}
