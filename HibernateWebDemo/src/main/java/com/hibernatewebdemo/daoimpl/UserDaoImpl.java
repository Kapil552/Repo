package com.hibernatewebdemo.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernatewebdemo.dao.UserDao;
import com.hibernatewebdemo.pojo.User;
import com.hibernatewebdemo.sessionfactory.MySessionFactory;

public class UserDaoImpl implements UserDao {

	private SessionFactory sf = 
					MySessionFactory.getSessionFactory();
	
	@Override
	public boolean checkUserCredentials(User user) {
		try(Session s = sf.openSession()) {
			Query<User> q = s.createQuery("FROM User u"
			+ " WHERE u.username = :uname AND "
			+ "u.password = :upass" , User.class);
			q.setParameter("uname", user.getUsername());
			q.setParameter("upass", user.getPassword());
			List<User> lst = q.list();
			if(lst.size() > 0)
				return true;
			else
				return false;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addNewUser(User user) {
		try(Session s = sf.openSession()) {
			Transaction tr = s.beginTransaction();
			s.persist(user);
			tr.commit();
			return true;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}
}
