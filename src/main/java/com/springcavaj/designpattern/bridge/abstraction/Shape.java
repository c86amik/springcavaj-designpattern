/**
 * 
 */
package com.springcavaj.designpattern.bridge.abstraction;

import com.springcavaj.designpattern.bridge.design.Drawing;

/**
 * 
 * @author springcavaj
 */
public abstract class Shape {
	
	protected Drawing drawing;
	
	protected Shape(Drawing drawing) {
		this.drawing = drawing;
	}
	
	public abstract void draw();
}
