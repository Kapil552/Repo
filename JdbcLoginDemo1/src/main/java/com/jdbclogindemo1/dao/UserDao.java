package com.jdbclogindemo1.dao;

import com.jdbclogindemo1.pojo.User;

public interface UserDao {

	boolean checkUserDetails(User user);
	boolean addNewUser(User user);
}
