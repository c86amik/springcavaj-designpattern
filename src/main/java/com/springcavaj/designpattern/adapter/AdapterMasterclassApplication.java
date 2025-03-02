/**
 * 
 */
package com.springcavaj.designpattern.adapter;

import com.springcavaj.designpattern.adapter.design.impl.FrameworkAdapter;

/**
 * @author springcavaj
 */
public class AdapterMasterclassApplication {

	public static void main(String[] args) {
		FrameworkAdapter adapter = new FrameworkAdapter();
		adapter.ioc("Spring Boot");
		adapter.ioc("Struts");
	}

}
