package com.springmvcjdbcdemo.dao;

import com.springmvcjdbcdemo.pojo.User;

public interface UserDao {

	boolean checkUserCredentials(User user);
	boolean addNewUser(User user);
}
