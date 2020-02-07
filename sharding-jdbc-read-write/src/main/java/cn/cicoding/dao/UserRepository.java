package cn.cicoding.dao;

import java.util.List;

import cn.cicoding.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
}
