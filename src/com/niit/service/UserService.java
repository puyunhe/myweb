package com.niit.service;

import java.util.List;

import com.niit.model.Users;

public interface UserService {
	public void addUser(Users user);
	
	public boolean deleteUser(String id);
	
	public boolean modifyUser(Users user);
	
	public List<Users> getAll();
	
	public Users getUser(String id);
}
