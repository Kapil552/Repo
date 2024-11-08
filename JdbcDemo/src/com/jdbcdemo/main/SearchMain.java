package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id of the product to "
				+ "be searched : ");
		int pid = scanner.nextInt();
		
		try {
			//1) load the database Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) get Connection with the database
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+ "useSSL=false", "root", "root");
			
			//3) create Statement to execute query
			PreparedStatement st = 
			con.prepareStatement("SELECT * FROM product"
					+ " WHERE id = ?");
			st.setInt(1, pid);
			
			//4) execute the query
			//5) store result of the query into ResultSet
			ResultSet rs = st.executeQuery();
			
			//6) process data from the ResultSet
			if(rs.isBeforeFirst()) {
				rs.next();
				System.out.println(rs.getInt("id") + " : "
				+ rs.getString(2) + " : " 
				+ rs.getInt("price"));
			} else {
				System.out.println("no such product found");
			}
			
			//close the database Connection
			con.close();
		} catch (SQLException | ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}
}



