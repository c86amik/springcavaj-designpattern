/**
 * 
 */
package com.springcavaj.designpattern.singleton.design;

/**
 * 
 * @author springcavaj
 */
public class BillPughSingleton {
	
	private BillPughSingleton() {
		if(null != BillPughSingletonHelper.INSTANCE) {
			throw new RuntimeException("Use getInstance() method to create instance not using Constructor uisng Reflection.");
		}
	}
	
	private static class BillPughSingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return BillPughSingletonHelper.INSTANCE;
	}
	
	protected Object readResolve() {
		return BillPughSingletonHelper.INSTANCE;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    throw new CloneNotSupportedException("Cannot clone singleton");
	}
	
}
