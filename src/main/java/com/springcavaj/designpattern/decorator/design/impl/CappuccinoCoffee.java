/**
 * 
 */
package com.springcavaj.designpattern.decorator.design.impl;

import com.springcavaj.designpattern.decorator.design.Coffee;

/**
 * 
 * @author springcavaj
 */
public class CappuccinoCoffee implements Coffee {
	
	public String getDescription() {
        return "Cappuccino Coffee";
    }
    public double getCost() {
        return 435.0;
    }
}
