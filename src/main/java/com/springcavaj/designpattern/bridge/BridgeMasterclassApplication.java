/**
 * 
 */
package com.springcavaj.designpattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.adapter.design.SpringBootFramework;
import com.springcavaj.designpattern.adapter.design.impl.FrameworkAdapter;
import com.springcavaj.designpattern.adapter.design.impl.ObjectFrameworkAdapter;
import com.springcavaj.designpattern.bridge.abstraction.Shape;
import com.springcavaj.designpattern.bridge.abstraction.impl.Circle;
import com.springcavaj.designpattern.bridge.design.impl.DirectX;
import com.springcavaj.designpattern.bridge.design.impl.OpenGL;

/**
 * @author springcavaj
 */
public class BridgeMasterclassApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BridgeMasterclassApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Computuation for Circle 1 Object");
		Shape shape1 = new Circle(3, 12, 3, new OpenGL());
		shape1.draw();
        LOGGER.info("Computation for Circle 2 Object");
        Shape shape2 = new Circle(6, 24, 6, new DirectX());
        shape2.draw();
	}

}
