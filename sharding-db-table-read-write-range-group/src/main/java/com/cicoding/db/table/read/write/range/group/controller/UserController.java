package com.cicoding.db.table.read.write.range.group.controller;

import com.cicoding.db.table.read.write.range.group.entity.User;
import com.cicoding.db.table.read.write.range.group.service.UserService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public Object list() {
		HintManager.getInstance().setMasterRouteOnly();
		return userService.list();
	}
	
	@GetMapping("/add")
	public Object add() {
		for (long i = 31; i <= 60; i++) {
			User user = new User();
			user.setId(i);
			user.setCity("深圳");
			user.setName("李四");
			userService.add(user);
		}
		return "success";
	}
	
	@GetMapping("/users/{id}")
	public Object get(@PathVariable Long id) {
		HintManager.getInstance().setMasterRouteOnly();
		return userService.findById(id);
	}
	
	@GetMapping("/users/query")
	public Object get(String name) {
		return userService.findByName(name);
	}
	
}
