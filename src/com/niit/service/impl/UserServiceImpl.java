package com.niit.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.dao.UserDao;
import com.niit.model.Users;
import com.niit.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(Users user) {
		userDao.addUser(user);

	}

	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

	@Override
	public boolean modifyUser(Users user) {
		// TODO Auto-generated method stub
		return userDao.modifyUser(user);
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	@Override
	public Users getUser(String id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

}
