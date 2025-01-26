/**
 * 
 */
package com.springcavaj.designpattern.prototype.cloning.design;

/**
 * 
 * @author springcavaj
 */
public class DependencyInjection implements Cloneable {
	
	private String dependencyOfInjection;

	public DependencyInjection(String dependencyOfInjection) {
		super();
		this.dependencyOfInjection = dependencyOfInjection;
	}

	public String getDependencyOfInjection() {
		return dependencyOfInjection;
	}

	public void setDependencyOfInjection(String dependencyOfInjection) {
		this.dependencyOfInjection = dependencyOfInjection;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DependencyInjection [dependencyOfInjection=");
		builder.append(dependencyOfInjection);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	protected DependencyInjection clone() throws CloneNotSupportedException {
		return (DependencyInjection) super.clone();
	}

}
