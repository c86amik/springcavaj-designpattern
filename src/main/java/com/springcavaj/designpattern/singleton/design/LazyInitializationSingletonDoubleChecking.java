/**
 * 
 */
package com.springcavaj.designpattern.singleton.design;

/**
 * 
 * @author springcavaj
 */
public class LazyInitializationSingletonDoubleChecking {
	
	private static volatile LazyInitializationSingletonDoubleChecking instance;
	
	private LazyInitializationSingletonDoubleChecking() {
		if(null != instance) {
			throw new RuntimeException("Use getInstance() method to create instance not using Constructor uisng Reflection.");
		}
	}
	
	public static LazyInitializationSingletonDoubleChecking getInstance() {
		if(null == instance) {
			synchronized (LazyInitializationSingletonDoubleChecking.class) {
				if(null == instance) {
					instance = new LazyInitializationSingletonDoubleChecking();
				}
			}
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
