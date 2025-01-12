/**
 * 
 */
package com.springcavaj.designpattern.abstractfactory.design.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.abstractfactory.design.Mobile;

/**
 * springcavaj
 * 
 */
public class SamsungMobile implements Mobile {
	
	private static final Logger LOG = LoggerFactory.getLogger(SamsungMobile.class);

	@Override
	public void makeCalls() {
		LOG.info("makeCalls() - Calling using SamsungMobile");
	}

	@Override
	public void playGames() {
		LOG.info("playGames() - Playing Games in SamsungMobile");
	}

}
