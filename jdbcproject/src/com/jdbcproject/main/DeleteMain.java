package com.jdbcproject.main;

import java.sql.*;
import java.util.Scanner;

public class DeleteMain {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id of the product to be deleted: ");
			int pid=sc.nextInt();
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/19thfebadv?"
				+"useSSL=false","root","root");
				
				PreparedStatement st=con.prepareStatement("delete from product"
						+ "where id=?");
				st.setInt(1,pid);
				
				int count=st.executeUpdate();
				
				if(count>0) {
					System.out.println("product deleted");
				}else {
					System.out.println("product was not deleted or no such "
							+ "product found");
				}
				con.close();
			}catch(SQLException|ClassNotFoundException exc) {
				exc.printStackTrace();
		}
	}
}