package com.jdbcproject.main;

import java.sql.*;

public class MetaDataDemo {
		public static void main(String[] args) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/19thfebadv?"
				+ "useSSL=false","root","root");
				
				PreparedStatement st=con.prepareStatement(
						"select * from product");
				
				ResultSet rs=st.executeQuery();
				
				ResultSetMetaData rsmd=rs.getMetaData();
				
				int count=rsmd.getColumnCount();
				
				System.out.println("Name of database: "
						+ rsmd.getCatalogName(1));
				
				System.out.println("Name of Table: " +rsmd.getTableName(1));
				
				System.out.println("Total columns loaded in resultSet are: " +count);
				
				for(int i=1;i<=count;i++) {
					System.out.println(rsmd.getColumnName(i)+
							rsmd.getColumnType(i)+
							rsmd.getColumnClassName(i));
				}
				con.close();
			}catch(SQLException|ClassNotFoundException exc) {
				exc.printStackTrace();
			}
		}
}
