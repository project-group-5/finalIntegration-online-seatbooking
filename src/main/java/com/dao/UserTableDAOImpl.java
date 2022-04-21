package com.dao;
import java.util.List;

import javax.transaction.UserTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.UserTable;

@Component
public class UserTableDAOImpl implements UserTableDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addUserTable( UserTable user) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(user);
		session.flush();
		session.getTransaction().commit();
		
		// TODO Auto-generated method stub

	}

	@Override
	public UserTable findUser(String userName) {
		Session session=sessionFactory.openSession();
	UserTable user=session.find(UserTable.class, userName);
		
		return user;
	}

	@Override
	public List<UserTable> findAllUser() {
		Session session=sessionFactory.openSession();
		List<UserTable> userlist=session.createQuery("select i from User i").list();
		
		return userlist;
	}

	@Override
	public boolean updateUser(UserTable user) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(user);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteUser(String userName) {
		Session session=sessionFactory.openSession();
		UserTable user=session.find(UserTable.class, session);
		session.getTransaction().begin();
		session.delete(user);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		return true;
	}


}
