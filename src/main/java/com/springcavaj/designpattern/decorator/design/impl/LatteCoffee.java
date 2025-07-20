/**
 * 
 */
package com.springcavaj.designpattern.decorator.design.impl;

import com.springcavaj.designpattern.decorator.design.Coffee;

/**
 * 
 * @author springcavaj
 */
public class LatteCoffee implements Coffee {
	
	public String getDescription() {
        return "Latte Coffee";
    }
    public double getCost() {
        return 235.0;
    }
}
