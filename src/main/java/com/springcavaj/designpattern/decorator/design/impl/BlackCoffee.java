/**
 * 
 */
package com.springcavaj.designpattern.decorator.design.impl;

import com.springcavaj.designpattern.decorator.design.Coffee;

/**
 * 
 * @author springcavaj
 */
public class BlackCoffee implements Coffee {
	
	public String getDescription() {
        return "Black Coffee";
    }
    public double getCost() {
        return 235.0;
    }
}
