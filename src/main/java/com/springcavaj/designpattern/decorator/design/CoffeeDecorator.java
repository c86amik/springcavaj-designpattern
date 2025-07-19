/**
 * 
 */
package com.springcavaj.designpattern.decorator.design;

/**
 * 
 * @author sprngcavaj
 */
public abstract class CoffeeDecorator implements Coffee {
	
	protected Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		super();
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription();
	}

	@Override
	public double getCost() {
		return coffee.getCost();
	}

}
