/**
 * 
 */
package com.springcavaj.designpattern.bridge.abstraction.impl;

import com.springcavaj.designpattern.bridge.abstraction.Shape;
import com.springcavaj.designpattern.bridge.design.Drawing;

/**
 * 
 * @author springcavaj
 */
public class Circle extends Shape {
	
	private double x, y, radius;

	public Circle(double x, double y, double radius, Drawing drawing) {
		super(drawing);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawing.drawCircle(x, y, radius);
	}

}
