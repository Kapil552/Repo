package com.jdbcloginjsp.dao;

import com.jdbcloginjsp.pojo.User;

public interface UserDao {

	boolean checkUserDetails(User user);
	boolean addNewUser(User user);
}
