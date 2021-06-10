package cn.cicoding.db.sharding.service;

import cn.cicoding.db.sharding.entity.Cicoding;

import java.util.List;

public interface CicodingService {

	List<Cicoding> list();
	
	Long addCicoding(Cicoding cicoding);
		
}
