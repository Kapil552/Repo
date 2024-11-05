package com.mvcjspdemo1.dao;

import com.mvcjspdemo1.pojo.User;

public interface UserDao {
	
	boolean checkUserDetails(User user);
	boolean addNewUser(User user);
}
