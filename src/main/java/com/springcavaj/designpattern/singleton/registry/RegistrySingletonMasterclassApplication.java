/**
 * 
 */
package com.springcavaj.designpattern.singleton.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.singleton.registry.design.RegistrySingleton;
import com.springcavaj.designpattern.singleton.registry.design.Spring;
import com.springcavaj.designpattern.singleton.registry.design.Struts;

/**
 * 
 * @author springcavaj
 */
public class RegistrySingletonMasterclassApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(RegistrySingletonMasterclassApplication.class);

	public static void main(String[] args) {
		RegistrySingleton.registerInstance("SPRING", Spring.getInstance());
		RegistrySingleton.registerInstance("STRUTS", Struts.getInstance());
		
		Spring spring = (Spring) RegistrySingleton.getInstance("SPRING");
		spring.dependencyInjection();
		LOG.info("HashCode of Spring instance: {}", spring.hashCode());
		
		Struts struts = (Struts) RegistrySingleton.getInstance("STRUTS");
		struts.xmlBasedConf();
		LOG.info("HashCode of Struts instance: {}", struts.hashCode());
	}

}
