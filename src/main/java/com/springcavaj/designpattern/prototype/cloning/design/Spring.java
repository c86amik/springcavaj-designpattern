/**
 * 
 */
package com.springcavaj.designpattern.prototype.cloning.design;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author springcavaj
 */
public class Spring implements Cloneable {
	
	private DependencyInjection dependencyInjection;
	private List<String> inversionOfControls;
	
	public Spring(DependencyInjection dependencyInjection, List<String> inversionOfControls) {
		super();
		this.dependencyInjection = dependencyInjection;
		this.inversionOfControls = inversionOfControls;
	}

	public DependencyInjection getDependencyInjection() {
		return dependencyInjection;
	}

	public List<String> getInversionOfControls() {
		return inversionOfControls;
	}
	
	@Override
	public Spring clone() throws CloneNotSupportedException {
		return (Spring) super.clone();
	}
	
	public Spring deepClone() throws CloneNotSupportedException {
		DependencyInjection dependencyInjection = this.dependencyInjection.clone();
		List<String> inversionOfControls = new ArrayList<>();
		return new Spring(dependencyInjection, inversionOfControls);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Spring [dependencyInjection=");
		builder.append(dependencyInjection);
		builder.append(", inversionOfControls=");
		builder.append(inversionOfControls);
		builder.append("]");
		return builder.toString();
	}
	
}
