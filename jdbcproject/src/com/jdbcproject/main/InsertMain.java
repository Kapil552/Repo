package com.jdbcproject.main;

import java.sql.*;
import java.util.Scanner;

public class InsertMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of new product: ");
		String nm=sc.next();
		System.out.println("Enter price of new product: ");
		int prc=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+"useSSL=false","root","root");
			
			PreparedStatement st=con.prepareStatement(
			"insert into product (name,price) values(?,?)");
			st.setString(1, nm);
			st.setInt(2, prc);
			
			int count=st.executeUpdate();
			
			if(count>0) {
				System.out.println("product inserted");
			}else {
				System.out.println("product was not inserted");
			}
		}catch(SQLException|ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}

}
