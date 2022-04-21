package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.UserTable;

@Service

public class UserTableService {
	@Autowired
	UserTableDAO userTableDAOImpl;

	public void add(UserTable user) {
		userTableDAOImpl.addUserTable(user);
		
	}
	public UserTable find(String userName) {
		return userTableDAOImpl.findUser(userName);
	}
	public List<UserTable> findAll(){
		return userTableDAOImpl.findAllUser();
	}
	public boolean update(UserTable user) {
		return userTableDAOImpl.updateUser(user);
	}
	public boolean delete(String userName) {
		return userTableDAOImpl.deleteUser(userName);
	}


}
