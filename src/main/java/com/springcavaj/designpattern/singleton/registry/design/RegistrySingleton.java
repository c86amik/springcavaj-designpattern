/**
 * 
 */
package com.springcavaj.designpattern.singleton.registry.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author springcavaj
 */
public class RegistrySingleton {
	
	private static final Map<String, Object> registry = new ConcurrentHashMap<>();
	
	private RegistrySingleton() {}
	
	public static void registerInstance(String key, Object instance) {
		if(!registry.containsKey(key)) {
			registry.put(key, instance);
		}
	}
	
	public static Object getInstance(String key) {
		return registry.get(key);
	}

}
