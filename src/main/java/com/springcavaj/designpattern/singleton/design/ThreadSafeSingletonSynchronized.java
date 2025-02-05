/**
 * 
 */
package com.springcavaj.designpattern.singleton.design;

/**
 * 
 * @author springcavaj
 */
public class ThreadSafeSingletonSynchronized {
	
	private static ThreadSafeSingletonSynchronized instance;
	
	private ThreadSafeSingletonSynchronized() {
		if(null != instance) {
			throw new RuntimeException("Use getInstance() method to create instance not using Constructor uisng Reflection.");
		}
	}
	
	public static synchronized ThreadSafeSingletonSynchronized getInstance() {
		if(null == instance) {
			instance = new ThreadSafeSingletonSynchronized();
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
