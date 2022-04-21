package com.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.*;
import com.model.UserProfileDetails;
@Component
public class UserProfileDAOImpl implements UserProfileDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addProfile(UserProfileDetails profile) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(profile);
		session.flush();
		session.getTransaction().commit();
		

	}

	@Override
	public UserProfileDetails findProfile(String useremailId) {
		Session session=sessionFactory.openSession();
		UserProfileDetails profile=session.find(UserProfileDetails.class, useremailId);
		
		return  profile;
	}

	@Override
	public List<UserProfileDetails> findAllProfile() {
		Session session=sessionFactory.openSession();
		List<UserProfileDetails> profilelist=session.createQuery("select i from UserProfileDetails i").list();
		
		return profilelist;
	}

	@Override
	public boolean updateProfile(UserProfileDetails profile) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(profile);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteProfile(String useremailId) {
		Session session=sessionFactory.openSession();
		UserProfileDetails profile=session.find(UserProfileDetails.class, useremailId);
		session.getTransaction().begin();
		session.delete(profile);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		return true;
	}

}
