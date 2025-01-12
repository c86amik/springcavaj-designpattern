/**
 * 
 */
package com.springcavaj.designpattern.abstractfactory.design.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.abstractfactory.design.Tablet;

/**
 * 
 * springcavaj
 */
public class SamsungTablet implements Tablet {
	
	private static final Logger LOG = LoggerFactory.getLogger(SamsungTablet.class);

	@Override
	public void playGames() {
		LOG.info("playGames() - Playing Games in SamsungTablet");
	}

}
