/**
 * 
 */
package com.springcavaj.designpattern.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.singleton.design.BillPughSingleton;
import com.springcavaj.designpattern.singleton.design.EagerInitializationSingleton;
import com.springcavaj.designpattern.singleton.design.LazyInitializationSingleton;
import com.springcavaj.designpattern.singleton.design.LazyInitializationSingletonDoubleChecking;
import com.springcavaj.designpattern.singleton.design.ThreadSafeSingletonSynchronized;

/**
 * 
 * @author springcavaj
 */
public class SingletonMasterclassApplication {


	private static Logger logger = LoggerFactory.getLogger(SingletonMasterclassApplication.class);
	
	public static void main(String[] args) {
		EagerInitializationSingleton eagerInitializationSingleton = EagerInitializationSingleton.getInstance();
		logger.info("Eager Initialization Singleton : {}", eagerInitializationSingleton.hashCode());
		
		LazyInitializationSingleton lazyInitializationSingleton = LazyInitializationSingleton.getInstance();
		logger.info("Lazy Initialization Singleton (Not Thread-safe): {}", lazyInitializationSingleton.hashCode());
		
		ThreadSafeSingletonSynchronized threadSafeSingletonSynchronized = ThreadSafeSingletonSynchronized.getInstance();
		logger.info("Thread-safe Singleton (Using synchronized method): {}", threadSafeSingletonSynchronized.hashCode());
		
		LazyInitializationSingletonDoubleChecking lazyInitializationSingletonDoubleChecking = LazyInitializationSingletonDoubleChecking.getInstance();
		logger.info("Efficient Thread-safe Singleton (Double Checking): {}", lazyInitializationSingletonDoubleChecking.hashCode());
		
		BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
		logger.info("Bill Pugh Singleton (Best Practice): {}", billPughSingleton.hashCode());
	}

}
