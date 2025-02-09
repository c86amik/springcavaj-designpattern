/**
 * 
 */
package com.springcavaj.designpattern.singleton.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springcavaj.designpattern.singleton.database.design.DatabaseSingleton;

/**
 * @author springcavaj
 */
public class DatabaseBackedSingletonMasterclassApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(DatabaseBackedSingletonMasterclassApplication.class);

	public static void main(String[] args) {
		DatabaseSingleton singleton = DatabaseSingleton.getInstance();
        LOG.info("Initial Data: {}", singleton.getInstanceData());
        // Update Singleton instance data
        singleton.updateInstanceData("Updated Singleton Data in Distributed Systems.");
        // Fetch instance again to check if data is updated
        DatabaseSingleton singleton2 = DatabaseSingleton.getInstance();
        LOG.info("Updated Data: {}", singleton2.getInstanceData());
	}
}
