/**
 * 
 */
package com.springcavaj.designpattern.bridge.design.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.bridge.design.Drawing;

/**
 * 
 * @author springcavaj
 */
public class OpenGL implements Drawing {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OpenGL.class);

	@Override
	public void drawCircle(double x, double y, double radius) {
		LOGGER.info("OpenGL: Drawing circle at ({} and {}) with radius {}", x, y ,radius);
	}

}
