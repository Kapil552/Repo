package com.jdbcdemo.main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallStoredProcMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee number : ");
		int eno = scanner.nextInt();
		
		try {
			//1) load the database Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) get Connection with the database
			Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/19thfebadv?"
			+ "useSSL=false", "root", "root");
			
			//3) create CallableStatement to call stored proc
			CallableStatement cs = con.prepareCall(
			"{call myproc(?,?)}");
			
			cs.setInt(1, eno);
			cs.registerOutParameter(2, Types.CHAR);
			
			//4) call the stored proc
			cs.execute();
			
			//5) get result from the stored proc
			String dname = cs.getString(2);
			System.out.println("this employee belongs to "
					+ dname + " department");
			
			//6) close the database Connection
			con.close();
			
		} catch (SQLException | ClassNotFoundException exc) {
			exc.printStackTrace();
		}
	}
}



