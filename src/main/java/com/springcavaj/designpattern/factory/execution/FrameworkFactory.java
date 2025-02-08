/**
 * 
 */
package com.springcavaj.designpattern.factory.execution;

import org.springframework.util.StringUtils;

import com.springcavaj.designpattern.factory.design.Framework;
import com.springcavaj.designpattern.factory.design.impl.Spring;
import com.springcavaj.designpattern.factory.design.impl.SpringBoot;

/**
 * 
 * springcavaj
 */
public class FrameworkFactory {
	
	private static final String SPRING = "Spring";
	private static final String SPRING_BOOT = "Spring";
	
	public Framework getFramework(String frameworkType) {
		if(!StringUtils.hasText(frameworkType)) {
			return null;
		}else if(StringUtils.hasText(frameworkType) 
				&& SPRING.toUpperCase().equalsIgnoreCase(frameworkType.toUpperCase())) {
			return new Spring();
		} else if(StringUtils.hasText(frameworkType) 
				&& SPRING_BOOT.toUpperCase().equalsIgnoreCase(frameworkType.toUpperCase())) {
			return new SpringBoot();
		}
		return null;
	}
}
