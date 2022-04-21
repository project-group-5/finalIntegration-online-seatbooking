package com.dao;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.model.UserProfileDetails;

@Repository
public interface UserProfileDAO {
	 public void addProfile(UserProfileDetails profile);
	 public UserProfileDetails findProfile(String useremailId);
	 public List<UserProfileDetails> findAllProfile();
	 public boolean updateProfile(UserProfileDetails profile);
	 public boolean deleteProfile(String useremailId);
	


	

}
