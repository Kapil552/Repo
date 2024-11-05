package com.springmvcdemo3.daoimpl;

import org.springframework.stereotype.Repository;

import com.springmvcdemo3.dao.UserDao;
import com.springmvcdemo3.pojo.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUserCredentials(User user) {
		if(user.getUsername().equals("ABC@gmail.com") && 
				user.getPassword().equals("ABC@123"))
			return true;
		else
			return false;
	}
}
