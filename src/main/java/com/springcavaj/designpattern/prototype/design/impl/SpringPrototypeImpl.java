/**
 * 
 */
package com.springcavaj.designpattern.prototype.design.impl;

import com.springcavaj.designpattern.prototype.design.SpringPrototype;

/**
 * 
 * @author springcavaj
 */
public class SpringPrototypeImpl implements SpringPrototype {
	
	private String dependencyInjection;
	private String inversionOfControl;
	
	public SpringPrototypeImpl(String dependencyInjection, String inversionOfControl) {
		super();
		this.dependencyInjection = dependencyInjection;
		this.inversionOfControl = inversionOfControl;
	}

	public String getDependencyInjection() {
		return dependencyInjection;
	}

	public String getInversionOfControl() {
		return inversionOfControl;
	}

	@Override
	public SpringPrototype clone() {
		return new SpringPrototypeImpl(this.dependencyInjection, this.inversionOfControl);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SpringPrototypeImpl [dependencyInjection=");
		builder.append(dependencyInjection);
		builder.append(", inversionOfControl=");
		builder.append(inversionOfControl);
		builder.append("]");
		return builder.toString();
	}
	
}
