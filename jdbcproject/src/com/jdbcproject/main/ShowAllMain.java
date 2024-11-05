package com.jdbcproject.main;

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
			
			//3. create statement to execute query
			PreparedStatement st=con.prepareStatement
					("select * from product");
			
			//4.execute the query
			//5.store result of the query into resultSet
			ResultSet rs=st.executeQuery();
			
			
			//6. Process data from ResultSet
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					System.out.println(rs.getInt("id")+" : "
						+rs.getString(2)+" : " +rs.getInt("price"));
				}
			}else {
				System.out.println("no products found");
			}
			
			//7. close the database Connection
			con.close();
			
		}catch(SQLException|ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}
}
