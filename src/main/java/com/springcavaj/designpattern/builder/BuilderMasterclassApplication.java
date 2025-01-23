/**
 * 
 */
package com.springcavaj.designpattern.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.builder.design.SpringBoot;

/**
 * 
 * @author springcavaj
 */
public class BuilderMasterclassApplication {
	
	private static Logger logger = LoggerFactory.getLogger(BuilderMasterclassApplication.class);

	public static void main(String[] args) {
		SpringBoot springBoot = new SpringBoot.SpringBootBuilder("@Controller", "@Repository", "@Entity")
				.setAnnotationService("@Service")
				.setDIEnabled(true)
				.setIOCEnabled(true)
				.build();
		logger.info("Spring Boot Object : {}", springBoot);
	}

}
