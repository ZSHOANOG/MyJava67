package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bean.User;

public class UserDaoImpl  extends HibernateDaoSupport implements UserDao{

	 
	public List<User> getAllUsers() {
		 
		return this.getHibernateTemplate().find("from User");
	}

}
