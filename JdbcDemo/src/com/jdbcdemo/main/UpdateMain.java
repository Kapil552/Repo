package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id of the product to"
				+ " be updated: ");
		int pid = scanner.nextInt();
		System.out.println("Enter new name of the product : ");
		String nm = scanner.next();
		System.out.println("Enter new price of the product : ");
		int prc = scanner.nextInt();
		
		try {
			//1) load the database Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) get Connection with the database
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+ "useSSL=false", "root", "root");
			
			//3) create Statement to execute query
			PreparedStatement st = 
			con.prepareStatement("UPDATE product SET"
			+ " name = ? , price = ? WHERE id = ?");
			st.setString(1, nm);
			st.setInt(2, prc);
			st.setInt(3, pid);
			
			//4) execute the query
			int count = st.executeUpdate();
			
			if(count > 0) {
				System.out.println("product updated");	
			} else {
				System.out.println("product was not updated"
						+ " or no such product found");
			}
			
			//5) close the database Connection
			con.close();
		} catch (SQLException | ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}
}



