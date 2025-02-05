/**
 * 
 */
package com.springcavaj.designpattern.singleton.design;

/**
 * 
 * @author springcavaj
 */
public class EagerInitializationSingleton {
	
	private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
	
	private EagerInitializationSingleton() {
		if(null != instance) {
			throw new RuntimeException("Use getInstance() method to create instance not using Constructor uisng Reflection.");
		}
	}
	
	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException("Cannot clone singleton");
	}
}
