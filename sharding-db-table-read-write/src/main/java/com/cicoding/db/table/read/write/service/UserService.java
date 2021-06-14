package com.cicoding.db.table.read.write.service;

import com.cicoding.db.table.read.write.entity.User;

import java.util.List;


public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
