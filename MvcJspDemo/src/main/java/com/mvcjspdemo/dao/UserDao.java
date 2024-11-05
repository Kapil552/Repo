package com.mvcjspdemo.dao;

import com.mvcjspdemo.pojo.User;

public interface UserDao {

	boolean checkUserDetails(User user);
	boolean addNewUser(User user);
}
