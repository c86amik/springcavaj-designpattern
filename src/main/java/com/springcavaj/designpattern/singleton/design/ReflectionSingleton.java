/**
 * 
 */
package com.springcavaj.designpattern.singleton.design;

/**
 * 
 * @author springcavaj
 */
public class ReflectionSingleton {
	
	private static ReflectionSingleton instance;
	
	private ReflectionSingleton() {}
	
	public static ReflectionSingleton getInstance() {
		if(null == instance) {
			instance = new ReflectionSingleton();
		}
		return instance;
	}

}
