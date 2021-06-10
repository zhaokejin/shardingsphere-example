package cn.cicoding.read.write.dao;

import cn.cicoding.read.write.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
}
