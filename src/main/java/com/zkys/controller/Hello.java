package com.zkys.controller;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.property.access.spi.BuiltInPropertyAccessStrategies;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zkys.entity.User;
import com.zkys.service.UserService;

@Controller
@ResponseBody
public class Hello {
	@Resource
	private UserService useresrvice;
	/*//@Value("${id}")
	private Integer id;
	
	//@Value("${name}")
	private String name;
	
	@Resource
	private User user;
	
	@RequestMapping("/hello")
	public String Helloword() {
		
		return "HELLO WORLDE";
		
	}
	@RequestMapping("/msg")
	public String getMsg() {
		
		return id+","+name;
		
	}
	@RequestMapping("/getUsermsg")
	public String getUserMsg() {
		return user.toString();
		
	}
	
	//restFul结构
	@RequestMapping("/rest/{name}/{age}")
	public String restFul(@PathVariable String name,@PathVariable String age) {
		return "获取name属性："+name+",年龄"+age;
		
	}*/
	@RequestMapping("/findAll")
	public List<User> findAll() {
		
		return useresrvice.findAll();
	}
	@RequestMapping("/saveUser")
	public String saveUser(@Validated User user,BindingResult br) {
		if(br.hasErrors()) {
			//证明不满足校验规则
			return br.getFieldError().getDefaultMessage();//获取校验信息
		}
		useresrvice.saveUser(user);
		return "新增成功";
		
	}
	@RequestMapping("/updateUser")
	public String updateUser(User user) {
		useresrvice.updateUser(user);
		return "修改成功";
		
	}
	@RequestMapping("/findByAge")
	public List<User> findByAge(Integer age){
		
		
		return useresrvice.findByAge(age);
		
	}
}
