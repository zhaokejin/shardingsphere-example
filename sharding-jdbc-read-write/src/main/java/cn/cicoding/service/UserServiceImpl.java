package cn.cicoding.service;

import java.util.List;

import cn.cicoding.model.User;
import cn.cicoding.dao.UserRepository;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> list() {
		// 强制路由主库
//		HintManager.getInstance().setMasterRouteOnly();
		return userRepository.list();
	}

	public Long add(User user) {
		return userRepository.addUser(user);
	}

}
