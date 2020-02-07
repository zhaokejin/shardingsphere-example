package cn.cicoding.repository;

import java.util.List;

import cn.cicoding.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
