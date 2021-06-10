package cn.cicoding.read.write.service;

import cn.cicoding.read.write.model.Cicoding;

import java.util.List;

public interface CicodingService {

	List<Cicoding> list();
	
	Long addLouDong(Cicoding louDong);
		
}
