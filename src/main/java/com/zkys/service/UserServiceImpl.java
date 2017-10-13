package com.zkys.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zkys.entity.User;
import com.zkys.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper usermapper;
	@Override
	public List<User> findAll() {
		
		return usermapper.findAll();
	}
	public void update(User user) {
	
		 usermapper.save(user);
	}
	@Override
	public void saveUser(User user) {
		usermapper.save(user);
		
	}
	@Override
	public void updateUser(User user) {
		/*
		 * 如果数据库中有主键id，则是做修改操作
		 * 如果没有主键id，则做新增操作
		 */
		usermapper.save(user);
		
	}
	@Override
	public List<User> findByAge(Integer age) {
		
		return usermapper.findByAge(age);
	}

}
