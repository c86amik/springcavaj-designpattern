/**
 * 
 */
package com.springcavaj.designpattern.singleton.design;

/**
 * 
 * @author springcavaj
 */
public class ReflectionSafeSingleton {
	
	private static ReflectionSafeSingleton instance;
	
	private ReflectionSafeSingleton() {
		if(null != instance) {
			throw new RuntimeException("Use getInstance() method to create instance");
		}
	}
	
	public static ReflectionSafeSingleton getInstance() {
		if(null == instance) {
			instance = new ReflectionSafeSingleton();
		}
		return instance;
	}

}
