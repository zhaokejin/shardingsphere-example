package cn.cicoding.jdbc.db.table.service;

import cn.cicoding.jdbc.db.table.model.User;

import java.util.List;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
