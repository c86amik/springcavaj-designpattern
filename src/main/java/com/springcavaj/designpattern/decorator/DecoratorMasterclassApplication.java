/**
 * 
 */
package com.springcavaj.designpattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.decorator.design.Coffee;
import com.springcavaj.designpattern.decorator.design.impl.BlackCoffee;
import com.springcavaj.designpattern.decorator.design.impl.CappuccinoCoffee;
import com.springcavaj.designpattern.decorator.design.impl.MilkDecorator;
import com.springcavaj.designpattern.decorator.design.impl.SugarDecorator;

/**
 * 
 * @author springcavaj
 */
public class DecoratorMasterclassApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DecoratorMasterclassApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Decorator Design Pattern Example");
		Coffee blackCoffee = new BlackCoffee();
		LOGGER.info("{} Rs. {}", blackCoffee.getDescription(), blackCoffee.getCost());

        blackCoffee = new MilkDecorator(blackCoffee);
        blackCoffee = new SugarDecorator(blackCoffee);

        LOGGER.info("{} Rs. {}", blackCoffee.getDescription(), blackCoffee.getCost());
        
        Coffee cappuccino = new CappuccinoCoffee();
        LOGGER.info("{} Rs. {}", cappuccino.getDescription(), cappuccino.getCost());

        cappuccino = new MilkDecorator(cappuccino);
        cappuccino = new SugarDecorator(cappuccino);

        LOGGER.info("{} Rs. {}", cappuccino.getDescription(), cappuccino.getCost());
		
	}

}
