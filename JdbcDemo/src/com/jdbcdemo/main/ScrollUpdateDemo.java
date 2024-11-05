package com.jdbcdemo.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollUpdateDemo {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+ "useSSL=false", "root", "root");
			
			PreparedStatement st = 
			con.prepareStatement("SELECT * FROM product" , 
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " : "
				+ rs.getString(2) + " : " 
				+ rs.getInt("price"));
			}
			
			rs.first();
			System.out.println("first product :- ");
			System.out.println(rs.getInt("id") + " : "
					+ rs.getString(2) + " : " 
					+ rs.getInt("price"));
			
			rs.last();
			System.out.println("last product :- ");
			System.out.println(rs.getInt("id") + " : "
					+ rs.getString(2) + " : " 
					+ rs.getInt("price"));
			
			rs.absolute(3);
			System.out.println("third product :- ");
			System.out.println(rs.getInt("id") + " : "
					+ rs.getString(2) + " : " 
					+ rs.getInt("price"));
			
			rs.previous();
			System.out.println("second product :- ");
			System.out.println(rs.getInt("id") + " : "
					+ rs.getString(2) + " : " 
					+ rs.getInt("price"));
			
			
			//adding a new record
			rs.moveToInsertRow();
			rs.updateString("name", "earphones");
			rs.updateInt("price", 250);
			rs.insertRow();
			
			System.out.println("After insertion all products"
					+ " are :- ");
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " : "
				+ rs.getString(2) + " : " 
				+ rs.getInt("price"));
			}
			
			//updating a record
			rs.absolute(7);
			rs.updateString("name", "philips earphones");
			rs.updateInt("price", 350);
			rs.updateRow();
			System.out.println("After updation all products"
					+ " are :- ");
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " : "
				+ rs.getString(2) + " : " 
				+ rs.getInt("price"));
			}
			
			//deleting a record
			rs.absolute(7);
			rs.deleteRow();
			System.out.println("After deletion all products"
					+ " are :- ");
			rs.beforeFirst();
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " : "
				+ rs.getString(2) + " : " 
				+ rs.getInt("price"));
			}
			
			con.close();
			
		} catch (SQLException | ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}
}



