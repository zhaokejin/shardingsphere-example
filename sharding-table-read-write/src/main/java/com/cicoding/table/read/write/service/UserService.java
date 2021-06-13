package com.cicoding.table.read.write.service;

import com.cicoding.table.read.write.po.User;

import java.util.List;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
