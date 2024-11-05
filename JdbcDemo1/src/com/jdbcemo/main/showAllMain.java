package com.jdbcemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class showAllMain {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(
			 "jdbc");
			
		}catch(SQLException|ClassNotFoundException exc) {
			exc.printStackTrace();
		}

	}

}
