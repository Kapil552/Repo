package com.jdbcloginjsp.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbcloginjsp.connection.DbConnection;
import com.jdbcloginjsp.dao.UserDao;
import com.jdbcloginjsp.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUserDetails(User user) {
		try(Connection con = 
				DbConnection.getDatabaseConnection()) {
			PreparedStatement pst = 
			con.prepareStatement("SELECT * FROM userdata"
					+ " WHERE userid = ? AND password = ?");
			pst.setString(1, user.getUserid());
			pst.setString(2, user.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.isBeforeFirst())
				return true;
			else
				return false;
		} catch (SQLException | NullPointerException exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addNewUser(User user) {
		try(Connection con = 
				DbConnection.getDatabaseConnection()) {
			PreparedStatement pst = 
			con.prepareStatement("INSERT INTO userdata"
					+ " VALUES (?,?)");
			pst.setString(1, user.getUserid());
			pst.setString(2, user.getPassword());
			int count = pst.executeUpdate();
			if(count > 0)
				return true;
			else
				return false;
		} catch (SQLException | NullPointerException exc) {
			exc.printStackTrace();
			return false;
		}
	}
}
