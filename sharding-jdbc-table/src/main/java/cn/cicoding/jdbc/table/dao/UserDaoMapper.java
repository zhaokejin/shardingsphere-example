package cn.cicoding.jdbc.table.dao;

import cn.cicoding.jdbc.table.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDaoMapper {
    Long addUser(User user);

    List<User> list();

    User findById(Long id);

    User findByName(String name);
}
