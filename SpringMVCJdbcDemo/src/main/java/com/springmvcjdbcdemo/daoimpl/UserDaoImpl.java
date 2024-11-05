package com.springmvcjdbcdemo.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvcjdbcdemo.dao.UserDao;
import com.springmvcjdbcdemo.pojo.User;

@Repository
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jTemplate;
	
	@Autowired
	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public boolean checkUserCredentials(User user) {
		try {
			jTemplate.queryForObject("SELECT * FROM"
			+ " userdata WHERE username = ? AND password = ?",
			new BeanPropertyRowMapper<User>(User.class),
			new Object[] {user.getUsername(),
			user.getPassword()});
			return true;
		} catch (EmptyResultDataAccessException exc) {
			return false;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addNewUser(User user) {
		try {
			int count = jTemplate.update("INSERT INTO"
			+ " userdata VALUES (?,?)" , new Object[] {
			user.getUsername(), user.getPassword()});
			if(count > 0)
				return true;
			else
				return false;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}
}
