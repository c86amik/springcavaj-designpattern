/**
 * 
 */
package com.springcavaj.designpattern.decorator.design.impl;

import com.springcavaj.designpattern.decorator.design.Coffee;
import com.springcavaj.designpattern.decorator.design.CoffeeDecorator;

/**
 * 
 * @author springcavaj
 */
public class MilkDecorator extends CoffeeDecorator {
	
	public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }

}
