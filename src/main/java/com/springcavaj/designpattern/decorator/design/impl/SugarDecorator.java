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
public class SugarDecorator extends CoffeeDecorator {

	public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }
}
