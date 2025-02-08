/**
 * 
 */
package com.springcavaj.designpattern.singleton.registry.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author springcavaj
 */
public class Spring {
	private static final Logger LOG = LoggerFactory.getLogger(Spring.class);
	
	private static Spring spring;
	
	private Spring() {}
	
	public void dependencyInjection() {
		LOG.info("Spring MVC Framework : {}", spring.hashCode());
	}
	
	public static Spring getInstance() {
		if(null == spring) {
			spring = new Spring();
		}
		return spring;
	}
}
