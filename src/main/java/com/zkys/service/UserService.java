package com.zkys.service;

import java.util.List;

import com.zkys.entity.User;

public interface UserService  {
	public List<User> findAll();

	public void saveUser(User user);

	public void updateUser(User user);

	public List<User> findByAge(Integer age);
}
