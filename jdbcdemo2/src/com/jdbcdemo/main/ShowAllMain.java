package com.jdbcdemo.main;

import java.sql.*;

public class ShowAllMain {

	public static void main(String[] args) {
		
		try {
			//1. load the database driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. get Connection with the database
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+"useSSL=false","root","root");
			
			PreparedStatement st=con.prepareStatement(
					"select * from product");
			
			if(rs.idBeforeFirst()) {
				while
			}
		}
	}

}
