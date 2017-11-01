package com.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class UserAction extends ActionSupport{
@Autowired
@Qualifier("userService")
UserService userService;
	public String getAllUsers(){
		List<User> users = userService.getAllUsers();
		ServletActionContext.getRequest().setAttribute("users",users);
		return SUCCESS;
	}
}
