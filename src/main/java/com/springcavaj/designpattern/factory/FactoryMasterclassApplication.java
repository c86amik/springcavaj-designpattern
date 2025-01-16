/**
 * 
 */
package com.springcavaj.designpattern.factory;

import com.springcavaj.designpattern.factory.design.Framework;
import com.springcavaj.designpattern.factory.execution.FrameworkFactory;

/**
 * 
 * springcavaj
 */
public class FactoryMasterclassApplication {
	
	public static void main(String[] args) {
		FrameworkFactory factory = new FrameworkFactory();
		Framework framework = factory.getFramework("Spring");
		framework.frameworkFeatures();
		framework = factory.getFramework("springboot");
		framework.frameworkFeatures();
	}

}
