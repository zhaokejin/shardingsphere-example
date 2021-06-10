package cn.cicoding.db.sharding.service;

import cn.cicoding.db.sharding.entity.User;

import java.util.List;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
