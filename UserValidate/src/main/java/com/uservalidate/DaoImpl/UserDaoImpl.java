package com.uservalidate.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.uservalidate.connection.DbConnection;
import com.uservalidate.dao.UserDao;
import com.uservalidate.pojo.User;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean checkUser(User user) {
		try(Connection con=DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst=con.prepareStatement(
					"select * from userdata where username=? and password=?");
			
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			ResultSet rs=pst.executeQuery();
			
			if(rs.isBeforeFirst())
				return true;
			else
			return false;
		}catch(SQLException|NullPointerException exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addNewUser(User user) {
		try(Connection con=DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst=con.prepareStatement("insert into userdata values(?,?)"); 
			
			pst.setString(1, user.getUsername());
			pst.setString(0, user.getPassword());
			
			int count=pst.executeUpdate();
			if(count>0)
				return true;
			else
				return false;
					
		}catch(SQLException|NullPointerException exc) {
			exc.printStackTrace();
			return false;
		}

	}
	
	
}
