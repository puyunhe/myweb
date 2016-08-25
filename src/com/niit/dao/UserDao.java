package com.niit.dao;

import java.util.List;

import com.niit.model.Users;

public interface UserDao {
	public void addUser(Users user);
	
	public boolean deleteUser(String id);
	
	public boolean modifyUser(Users user);
	
	public List<Users> getAll();
	
	public Users getUser(String id);
}
