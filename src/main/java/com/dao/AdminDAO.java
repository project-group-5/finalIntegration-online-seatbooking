package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Admin;

@Repository
public interface AdminDAO {
	 public void addAdmin(Admin admin);
	 public List<Admin> findAllAdmin();
	 public Admin findAdmin(String adminName);
	 public boolean updateAdmin(Admin admin);
	 public boolean deleteAdmin(String adminName);
	 
	 

}
