package com.springdidemo2.entity;

import java.util.Properties;

public class DbConnection {

	private Properties dbProperties;

	public DbConnection() {
	}

	public Properties getDbProperties() {
		return dbProperties;
	}

	public void setDbProperties(Properties dbProperties) {
		this.dbProperties = dbProperties;
	}
}
