package com.hibernatewebdemo.dao;

import com.hibernatewebdemo.pojo.User;

public interface UserDao {

	boolean checkUserCredentials(User user);
	boolean addNewUser(User user);
}
