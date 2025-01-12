/**
 * 
 */
package com.springcavaj.designpattern.abstractfactory.design.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.abstractfactory.design.Mobile;

/**
 * 
 * springcavaj
 */
public class AppleMobile implements Mobile {
	private static final Logger LOG = LoggerFactory.getLogger(AppleMobile.class);

	@Override
	public void makeCalls() {
		LOG.info("makeCalls() - Calling using AppleMobile");
		
	}

	@Override
	public void playGames() {
		LOG.info("playGames() - Playing Games in AppleMobile");
	}
}

