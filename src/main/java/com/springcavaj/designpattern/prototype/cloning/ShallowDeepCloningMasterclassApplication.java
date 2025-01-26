/**
 * 
 */
package com.springcavaj.designpattern.prototype.cloning;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.prototype.cloning.design.DependencyInjection;
import com.springcavaj.designpattern.prototype.cloning.design.Spring;

/**
 * 
 * @author springcavaj
 */
public class ShallowDeepCloningMasterclassApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ShallowDeepCloningMasterclassApplication.class);

	public static void main(String[] args) throws CloneNotSupportedException {
		DependencyInjection dependencyInjection = new DependencyInjection("DI - Clone");
		List<String> inversionOfControls = new ArrayList<>();
		inversionOfControls.add("IOC - Original");
		Spring springOriginal = new Spring(dependencyInjection, inversionOfControls);
		
		// Shallow Clone
		Spring springShallowCopy = springOriginal.clone();
		
		// Deep Clone
		Spring springDeepCopy = springOriginal.deepClone();
		
		springOriginal.getDependencyInjection().setDependencyOfInjection("DI - Original");
		springOriginal.getInversionOfControls().add("IOC - Clone");
		
		LOGGER.info("Original object : {}", springOriginal);
		LOGGER.info("Shallow Clone object : {}", springShallowCopy);
		LOGGER.info("Deep Clone object : {}", springDeepCopy);
 	}

}
