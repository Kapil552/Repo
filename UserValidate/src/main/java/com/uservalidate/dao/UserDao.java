package com.uservalidate.dao;

import com.uservalidate.pojo.User;

public interface UserDao {
	
	boolean checkUser(User user);
	boolean addNewUser(User user);
}
