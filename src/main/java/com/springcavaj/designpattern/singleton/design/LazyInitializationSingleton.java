/**
 * 
 */
package com.springcavaj.designpattern.singleton.design;

/**
 * 
 */
public class LazyInitializationSingleton {
	
	private static LazyInitializationSingleton instance;
	
	private LazyInitializationSingleton() {
		if(null != instance) {
			throw new RuntimeException("Use getInstance() method to create instance not using Constructor uisng Reflection.");
		}
	}
	
	public static LazyInitializationSingleton getInstance() {
		if(null == instance) {
			instance = new LazyInitializationSingleton();
		}
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
