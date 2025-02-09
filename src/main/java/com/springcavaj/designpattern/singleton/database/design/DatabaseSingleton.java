/**
 * 
 */
package com.springcavaj.designpattern.singleton.database.design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author springcavaj
 */
public class DatabaseSingleton {
	
	private static final Logger LOG = LoggerFactory.getLogger(DatabaseSingleton.class);
	
	private static DatabaseSingleton instance;
	
	private static final String DB_URL = "jdbc:mysql://localhost:3306/spring";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";
	
	private String instanceData;
	
	private DatabaseSingleton(String instanceData) {
		this.instanceData = instanceData;
	}
	
	public static DatabaseSingleton getInstance() {
		if(null == instance) {
			try(Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
					PreparedStatement preparedStatement = connection.prepareStatement("SELECT instance_data FROM singleton_instance LIMIT 1");
					ResultSet resultSet = preparedStatement.executeQuery()) {
				if(resultSet.next()) {
					synchronized (DatabaseSingleton.class) {
						instance = new DatabaseSingleton(resultSet.getString("instance_data"));
					}
				} else {
					String defaultData = "Database Driven Singleton in Distributed Systems.";
					synchronized (DatabaseSingleton.class) {
						try(PreparedStatement statement = connection.
								prepareStatement("INSERT INTO singleton_instance (instance_data) VALUES (?)")) {
							statement.setString(1, defaultData);
							statement.executeUpdate();
						}
						instance = new DatabaseSingleton(defaultData);
					}
				}
			} catch(Exception e) {
				LOG.error("Exception occurred : {}", e);
			}
		}
		return instance;
	}
	
	public String getInstanceData() {
		return instanceData;
	}
	
	public void updateInstanceData(String newData) {
		this.instanceData = newData;
		
		try(Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
				PreparedStatement preparedStatement = connection.prepareStatement("UPDATE singleton_instance SET instance_data = ? WHERE id = 1")) {
			preparedStatement.setString(1, newData);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			LOG.error("Exception occurred while updating the Data : {}", e);
		}
	}
}
