package com.jdbcproject.main;

import java.sql.*;
import java.util.Scanner;

public class UpdateMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of the product to be updated:");
		int pid=sc.nextInt();
		System.out.println("Enter new name of the product: ");
		String nm=sc.next();
		System.out.println("Enter price of new product: ");
		int prc=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+"useSSL=false","root","root");
			
			PreparedStatement st=con.prepareStatement(
			"update product set name=?, price=? where id=?");
			st.setString(1, nm);
			st.setInt(2, prc);
			st.setInt(3, pid);
			
			int count=st.executeUpdate();
			
			if(count>0) {
				System.out.println("product updated");
			}else {
				System.out.println("product was not updated or no such product fount");
			}
			con.close();
		}catch(SQLException|ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}

}
