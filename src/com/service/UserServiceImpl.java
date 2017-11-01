package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bean.User;
import com.dao.UserDao;

public class UserServiceImpl implements UserService{
@Autowired
@Qualifier("userDao")
private UserDao userDao;
	@Override
	public List<User> getAllUsers() {
		 
		return userDao.getAllUsers();
	}

}
