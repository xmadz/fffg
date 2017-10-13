package com.zkys.mapper;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zkys.entity.User;

public interface UserMapper extends JpaRepository<User, Integer> {
	
	public List<User> findByAge(Integer age);

}
