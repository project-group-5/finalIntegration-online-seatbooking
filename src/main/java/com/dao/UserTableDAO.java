package com.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.UserTable;

@Repository
public interface UserTableDAO {
	
	public void addUserTable(UserTable user);
	public UserTable findUser(String userName);
	public List<UserTable> findAllUser();
	public boolean updateUser(UserTable user);
	public boolean deleteUser(String userName);
	

}
