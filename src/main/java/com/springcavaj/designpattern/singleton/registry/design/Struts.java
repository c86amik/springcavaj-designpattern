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
public class Struts {
	
	private static final Logger LOG = LoggerFactory.getLogger(Struts.class);
	
	private static Struts struts;
	
	private Struts() {}
	
	public void xmlBasedConf() {
		LOG.info("Struts MVC OOPFramework : {}", struts.hashCode());
	}
	
	public static Struts getInstance() {
		if(null == struts) {
			struts = new Struts();
		}
		return struts;
	}

}
