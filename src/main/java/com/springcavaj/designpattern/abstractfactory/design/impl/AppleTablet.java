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
public class AppleTablet implements Tablet {
	
	private static final Logger LOG = LoggerFactory.getLogger(AppleTablet.class);

	@Override
	public void playGames() {
		LOG.info("playGames() - Playing Games in AppleTablet");
	}

}
