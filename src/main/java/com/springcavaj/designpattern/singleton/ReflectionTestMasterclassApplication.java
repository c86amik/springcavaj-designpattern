/**
 * 
 */
package com.springcavaj.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.singleton.design.ReflectionSafeSingleton;
import com.springcavaj.designpattern.singleton.design.ReflectionSingleton;

/**
 * 
 * @author springcavaj
 */
public class ReflectionTestMasterclassApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(ReflectionTestMasterclassApplication.class);

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ReflectionSingleton instance1 = ReflectionSingleton.getInstance();
		
		// Using Reflection to create another instance
        Constructor<ReflectionSingleton> constructor = ReflectionSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true); // Breaks private access
        ReflectionSingleton instance2 = constructor.newInstance();
        
        LOG.info("Instance 1: {}", instance1.hashCode());
        LOG.info("Instance 2: {}", instance2.hashCode()); // Shouldn't happen in proper Singleton
        
        ReflectionSafeSingleton instance3 = ReflectionSafeSingleton.getInstance();
		
		// Using Reflection to create another instance
        Constructor<ReflectionSafeSingleton> constructorSafe = ReflectionSafeSingleton.class.getDeclaredConstructor();
        constructorSafe.setAccessible(true); // Breaks private access
        ReflectionSafeSingleton instance4 = constructorSafe.newInstance();
        
        LOG.info("Instance 1: {}", instance3.hashCode());
        LOG.info("Instance 2: {}", instance4.hashCode()); // Shouldn't happen in proper Singleton
		
	}

}
