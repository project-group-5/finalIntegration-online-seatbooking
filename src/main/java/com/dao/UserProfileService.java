package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.model.UserProfileDetails;

@Service
public class UserProfileService {
	
	@Autowired
	UserProfileDAO userProfileDAOImpl;

	public void add(UserProfileDetails profile) {
		userProfileDAOImpl.addProfile(profile);
		
	}
	public UserProfileDetails find(String useremailId) {
		return userProfileDAOImpl.findProfile(useremailId);
	}
	public List<UserProfileDetails> findAll(){
		return userProfileDAOImpl.findAllProfile();
	}
	public boolean update(UserProfileDetails profile) {
		return userProfileDAOImpl.updateProfile(profile);
	}
	public boolean delete(String useremailId) {
		return userProfileDAOImpl.deleteProfile(useremailId);
	}


}
