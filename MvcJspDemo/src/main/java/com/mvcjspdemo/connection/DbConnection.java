package com.mvcjspdemo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getDatabaseConnection() {
		try {
			Class.forName(DbDetails.DBDRIVER);
			Connection con = DriverManager.getConnection(
			DbDetails.CONSTR, DbDetails.USERNAME,
			DbDetails.PASSWORD);
			return con;
		} catch (SQLException | ClassNotFoundException exc) {
			exc.printStackTrace();
			return null;
		}
	}
}
