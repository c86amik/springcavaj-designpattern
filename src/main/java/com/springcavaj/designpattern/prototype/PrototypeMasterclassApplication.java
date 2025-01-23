/**
 * 
 */
package com.springcavaj.designpattern.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.prototype.design.impl.SpringPrototypeImpl;

/**
 * 
 * @author springcavaj
 */
public class PrototypeMasterclassApplication {

	private static Logger logger = LoggerFactory.getLogger(PrototypeMasterclassApplication.class);
	
	public static void main(String[] args) {
		SpringPrototypeImpl prototypeImplOriginal = new SpringPrototypeImpl("DI", "IOC");
		
		SpringPrototypeImpl prototypeImplClone = (SpringPrototypeImpl) prototypeImplOriginal.clone();
		
		logger.info("Original Spring Prototype Object : {} and hash code is : {}", prototypeImplOriginal, prototypeImplOriginal.hashCode());
		logger.info("Clone Spring Prototype Object : {}, and hash code is : {}", prototypeImplClone, prototypeImplClone.hashCode());
	}

}
