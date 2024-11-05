package com.jdbcproject.main;

import java.sql.*;
import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id of the product to be searched: ");
		int pid=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+"useSSL=false","root","root");
			
			PreparedStatement st=con.prepareStatement("select"
					+ "* from product where id=?");
			st.setInt(1, pid);
			
			ResultSet rs=st.executeQuery();
			
			if(rs.isBeforeFirst()) {
				rs.next();
				System.out.println(rs.getInt("id")+	" : "
				+rs.getString(2)+	" : "
				+rs.getInt("price"));
			}else {
				System.out.println("no such product found");
			}
		}catch(SQLException|ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}

}
